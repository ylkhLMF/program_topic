package lombok.pojo;

import lombok.*;
import lombok.service.LombokExample;
import org.junit.Test;

/**
 * @author liumf
 * @date 21:52 2020/12/23
 * @className User
 * @description
 *
 * @Data是一个方便使用的组合注解，是@ToString、@EqualsAndHashCode、@Getter、@Setter和@RequiredArgsConstructor的组合体。
 * 使用@XxConstructor注解可以自动生成构造方法，有@NoArgsConstructor、@RequiredArgsConstructor和@AllArgsConstructor三个注解可以使用。
 * @NoArgsConstructor：生成无参构造函数。
 * @RequiredArgsConstructor：生成包含必须参数的构造函数，使用@NonNull注解的类属性为必须参数。
 * @AllArgsConstructor：生成包含所有参数的构造函数。
 *
 */
@With
@Data
@Builder
@AllArgsConstructor
public class User {


    /**
     * @NonNull 注解在属性上注解要配合下面的注解使用
     * @RequiredArgsConstructor：生成包含必须参数的构造函数，使用@NonNull注解的类属性为必须参数。
     */
    private String name;

    private String pwd;


    public static void main(String[] args) {
        LombokExample lombokExample = LombokExample.getLombokExample();
        System.out.println(lombokExample);
    }

}
