package lombok.pojo;

import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.Value;
import lombok.With;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import org.junit.Test;

/**
 * @author liumf
 * @date 22:41 2020/12/23
 * @className Student
 * @description
 */
@AllArgsConstructor
@With
@ToString
@Log4j
@Value

public class Student {
    private String name;
    private String age;




    /**
     * @With注解
     * 实现对象clone
     * @Log4j 打印日志
     * @param args
     */
    public static void main(String[] args) {
        Student student1 = new Student("liu", "15");
        System.out.println(student1);
        Student student2 = student1.withAge("19");
        log.error("xxxxx");
        System.out.println(student2);
    }

}
