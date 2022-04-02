package jvm;

/**
 * @author liumf
 * @date 23:24 2022/3/1
 * @className ClassLoaderTest
 * @description
 */

public class ClassLoaderTest {


    public static void main(String[] args) {


        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();

        System.out.println(classLoader); // sun.misc.Launcher$AppClassLoader@18b4aac2

        ClassLoader stringClassLoader = String.class.getClassLoader();
        System.out.println(stringClassLoader);  // 输出 null ；
    }
}
