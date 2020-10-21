package stringapi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author liumf
 * @date 22:16 2020/10/19
 * @className ListRemove
 * @description
 */

public class ListRemove {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>(16);
        list.add("123456");
        list.add("XX");
        list.add("ewee");
        list.add("VVVVV");
        System.out.println(list);
        Iterator<String> iterator = list.iterator();

        ListRemove.remove(iterator,"XX");

        System.out.println(list);

    }


    public static void remove(Iterator<String> iterator, String str) {

        while (iterator.hasNext()) {
            String next = iterator.next();
            if (str.equals(next)) {
                iterator.remove();
            }
        }
    }
}
