package generic.wildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liumf
 * @date 17:30 2022/4/6
 * @className WoxTest
 * @description
 */
public class WoxTest {

    public static void main(String[] args) {

        Wox<Number> numberWox = new Wox<>();
        numberWox.setE(100);
        showWox(numberWox);

        Wox<Integer> integerWox = new Wox<>();

        integerWox.setE(1000);
        showWox(integerWox);


    }

    /**
     * 由于 Integer 的父类是 Number类型,这时可以采用类型通配符的上限 去传递参数
     * ? extends Number表示最大上限是Number类型
     * @param wox
     */
    public static void showWox(Wox<? extends Number> wox){

        Number e = wox.getE();
        System.out.println(e);

    }
}
