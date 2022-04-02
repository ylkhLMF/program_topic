package generic;

/**
 * @author liumf
 * @date 17:10 2022/4/2
 * @className ChildGenericClazz
 * @description 泛型类派生子类
 */
public class ChildGenericClazz<T> extends ParentGenericClazz<T>{

    @Override
    public T getStr1() {
        return super.getStr1();
    }
}


