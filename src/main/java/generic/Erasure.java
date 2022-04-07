package generic;

import java.util.List;

/**
 * @author liumf
 * @date 16:51 2022/4/7
 * @className Erasure
 * @description
 */
public class Erasure<T extends Number> {



    public <T extends List> T showT(T t){
        return t;
    }

    private T key;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }
}
