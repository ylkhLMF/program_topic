package generic;

import org.apache.commons.lang3.ArrayUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author liumf
 * @date 16:52 2022/4/7
 * @className ErasureTest
 * @description
 */
public class ErasureTest {

    /**
     * 根据反射可以看到类型擦除后实际jvm加载的是Object类型
     * @param args
     */
    public static void main(String[] args) {

        Erasure<Integer> erasure = new Erasure<>();
        final Class<? extends Erasure> aClass = erasure.getClass();
        final Field[] declaredFields = aClass.getDeclaredFields();
        if (ArrayUtils.isNotEmpty(declaredFields)){

            for (Field declaredField : declaredFields) {

                final String name = declaredField.getName();

                System.out.println(name+":\t"+declaredField.getType().getSimpleName());

            }
        }

        System.out.println("------------------------------");

        final Method[] declaredMethods = aClass.getDeclaredMethods();
        if (ArrayUtils.isNotEmpty(declaredFields)){
            for (Method declaredMethod : declaredMethods) {

                System.out.println(declaredMethod.getName()+":\t"+declaredMethod.getReturnType().getSimpleName());
            }
        }
    }
}
