package effective;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author liumf
 * @date 21:46 2020/11/3
 * @className Test
 * @description
 */

public class Test {


    public static void main(String[] args) {

        // List<Student> students = new ArrayList<>(16);
        // students.add(new Student("1242133", "dddd", "1", "dede"));
        //
        // students.add(new Student("123", "xxxx", "1", "ddad"));
        // students.add(new Student("4324", "rrr", "2", "xdadaxx"));
        // students.add(new Student("3434", "ttt", "3", "daed"));
        //
        //
        // List<Student> list2 = new ArrayList<>(16);
        //
        // for (Student student : students) {
        //     System.out.println(student);
        //     list2.add(0,student);
        // }
        //
        // System.out.println("-----------");
        //
        // list2.forEach(e->{
        //     System.out.println(e);
        // });

        List<String> list = new ArrayList<>(16);
        list.add("123");
        list.add("123");
        list.add("123");

        List<String> list2 = new ArrayList<>();
        for (String s : list) {
            list2.add(s);
        }

        
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String current = iterator.next();
            for (String o : list2) {
                if (current.equals(o)){
                    iterator.remove();
                }
            }
        }


    }
}
