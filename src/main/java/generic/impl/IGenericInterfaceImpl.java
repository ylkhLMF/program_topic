package generic.impl;

import generic.interfaces.GenericInterface;

/**
 * @author liumf
 * @date 10:48 2022/4/6
 * @className IGenericInterfaceImpl
 * @description
 */
public class IGenericInterfaceImpl<T,E> implements GenericInterface<T> {

    private T key;
    private E value;


    public IGenericInterfaceImpl(T key, E value) {
        this.key = key;
        this.value = value;
    }

    private E getValue(){

        return value;
    }

    @Override
    public T getKey() {
        return null;
    }

    @Override
    public String toString() {
        return "IGenericInterfaceImpl{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public static void main(String[] args) {

        IGenericInterfaceImpl<String, Integer> key = new IGenericInterfaceImpl<>("key", 100);

        System.out.println(key);

    }
}

