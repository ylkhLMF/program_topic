package reflection.utils;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class InvokeTest {

    @Test
    public void invokeTest() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Class<?> clazz = Class.forName("reflection.utils.Invoke");
        // java9后不推荐使用
        Object obj = clazz.newInstance();
        Method clazzMethod = clazz.getMethod("exampleMethod3", String.class, String.class);
        clazzMethod.invoke(obj,"一个参数","第二个参数");
    }

    /**
     * 反射调用可变参数
     */
    @Test
    public void exampleMethod2() throws Exception {

        Class<?> clazz = Class.forName("reflection.utils.Invoke");
        System.out.println(clazz);
        // java9后不推荐使用
        // Object obj = clazz.newInstance();
        Object obj = clazz.getDeclaredConstructor().newInstance();
        System.out.println(obj.toString());
        // 参数类型设置为数组
        Method clazzMethod = clazz.getMethod("variableParameter", String[].class);
        // 把参数转换成obj
        clazzMethod.invoke(obj,new Object[]{new String[]{"first","second"}});
    }


    @Test

    public void invokeMap() throws Exception{

        Class<?> clazz = Class.forName("reflection.utils.Invoke");
        Object obj = clazz.getDeclaredConstructor().newInstance();
        clazz.getMethod("mapParam", Map.class);

        Map<String, String> hashMap = new HashMap(16){

        };


    }

}