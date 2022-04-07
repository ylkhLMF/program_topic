package generic.wildcard;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.swing.*;

/**
 * @author liumf
 * @date 17:27 2022/4/6
 * @className Wox
 * @description
 */
public class Wox<E> {

    private E e;

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }
}
