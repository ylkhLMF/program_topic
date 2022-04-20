package annotation;

import java.lang.annotation.Target;

/**
 * @author liumf
 * @date 10:42 2022/4/12
 * @className TestClazzAnnotation
 * @description
 */

// 注解属性没有顺序
@MyAnnotation(name = "llll",schools = {"1111","2222"},age = 15)
@MyAnnotation2("value的属性直接省略")
public class TestClazzAnnotation {


}
