package annotation;

import java.lang.annotation.*;

/**
 * @author liumf
 * @date 10:39 2022/4/12
 * @className MyAnnotation
 * @description
 */
// 注解能够使用在什么地方
@Target({ElementType.TYPE,ElementType.METHOD})
// 表示注解的生效范围,是编译期还是运行期或者编译后
@Retention(RetentionPolicy.RUNTIME)
// 表示注解是否生成在java doc中
@Documented
// 子类可以继承父类的注解
@Inherited
public @interface MyAnnotation {

    /** 注解的参数:参数类型+参数名() */
    String name() default "";

    int age() default 0;

    // 默认值为-1 代表不存在,类似于indexOf(),没有返回-1
    int id() default -1;
    // 数组,可以传入多个值
    String[] schools();
}



@interface MyAnnotation2{

    String value();

}
