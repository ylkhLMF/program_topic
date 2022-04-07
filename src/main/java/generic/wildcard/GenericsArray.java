package generic.wildcard;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liumf
 * @date 17:52 2022/4/7
 * @className GenericsArray
 * @description 泛型数组创建
 */
public class GenericsArray<T> {


    private T[] array;


    public GenericsArray(Class clazz,int size) {
        this.array =(T[]) Array.newInstance(clazz,size)    ;
    }


}
