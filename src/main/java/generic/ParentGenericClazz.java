package generic;

/**
 * @author liumf
 * @date 17:11 2022/4/2
 * @className ParentGenericClazz
 * @description 父类泛型类
 */
public class ParentGenericClazz<T> {

    private T str1;
    private T str2;

    public ParentGenericClazz(T str1, T str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    public ParentGenericClazz() {
    }

    public T getStr1() {
        return str1;
    }

    public void setStr1(T str1) {
        this.str1 = str1;
    }

    public T getStr2() {
        return str2;
    }

    public void setStr2(T str2) {
        this.str2 = str2;
    }

    @Override
    public String toString() {
        return "ParentGenericClazz{" +
                "str1=" + str1 +
                ", str2=" + str2 +
                '}';
    }
}
