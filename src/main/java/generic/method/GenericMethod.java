package generic.method;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author liumf
 * @date 11:07 2022/4/6
 * @className GenericMethod
 * @description 泛型方法
 */

public class GenericMethod<T> {

    private List<T> list = new ArrayList<>();


    public static  <T> T getRandomProduct(List<T> list){

        return list.get(new Random().nextInt(list.size()));
    }


    public static <T,S,U> void testListGeneric(T t,S s){
        System.out.println("T" +"\t" +t.getClass().getSimpleName());
        System.out.println("S" +"\t" +s.getClass().getSimpleName());

    }


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("xxx");
        list.add("yyy");
        list.add("zzzz");
        GenericMethod<String> method = new GenericMethod<String>();

        String randomProduct = method.getRandomProduct(list);
        System.out.println(randomProduct);


        List<Integer> listInteger = Arrays.asList(100, 1000, 10000);

        GenericMethod<String> genericMethod = new GenericMethod<String>();
        Integer randomProduct1 = genericMethod.getRandomProduct(listInteger);

        System.out.println("随机数字"+"\t" +randomProduct1);



        GenericMethod.testListGeneric("1000",1000);
    }
}
