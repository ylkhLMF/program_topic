package generic;

/**
 * Copyright: Copyright (c) 2022 Dnt
 *
 * @ClassName: GenericClazz
 * @Description: 泛型类定义
 * @version: v1.0.0
 * @author: liumf
 * @date: 15:26 2022/4/2
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 15:26       liumf           v1.1.0
 */
public class GenericClazz<T> {

    private Integer number;

    private T t;


    public GenericClazz() {
    }

    public GenericClazz(Integer number, T t) {
        this.number = number;
        this.t = t;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "GenericClazz{" +
                "number=" + number +
                ", t=" + t +
                '}';
    }

    public static void main(String[] args) {

        GenericClazz<String> genericClazz = new GenericClazz<>();
        // 确定的数据类型
        genericClazz.setNumber(10);
        genericClazz.setT("外部使用的时候传入的类型");
        System.out.println(genericClazz);


        GenericClazz<String> clazz2 = new GenericClazz<>(100, "构造方法");

        // 未指定具体的类型，将按照Object来进行推断
        GenericClazz<Object> clazz3 = new GenericClazz<>();

    }
}
