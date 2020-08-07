package generic;

/**
 * @author dreamFly
 * @date 17:25 2020/6/27
 * @className GenericClass
 * @description 定义泛型类
 */

public class GenericClass<E> {


    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
