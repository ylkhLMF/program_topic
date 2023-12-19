package fastJson;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import entity.Book;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Copyright: Copyright (c) 2020 Dreamfly
 *
 * @ClassName: FastJsonBug
 * @Description:
 * @version: v1.0.0
 * @author: liumf
 * @date: 17:22 2020/10/23
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 17:22       liumf           v1.1.0
 */
public class FastJsonBug {


    public static void main(String[] args) throws Exception {
        //
        // Output output = new Output();
        // output.setHave(true);
        // output.setIsNoHave("true");
        //
        // ObjectMapper objectMapper = new ObjectMapper();
        // System.out.println(objectMapper.writeValueAsString(output));

        //
        // List<String> list =new ArrayList<>(16);
        // list.add("1234");
        // list.add("1234333");
        // System.out.println(list.size());
        // Iterator<String> iterator = list.iterator();
        // while (iterator.hasNext()){
        //     String next = iterator.next();
        //     if ("1234".equals(next)){
        //         iterator.remove();
        //         System.out.println(list.size());
        //     }
        // }
        // System.out.println(list);
        //
        // String s = LocalDate.now().toString();
        // System.out.println(s);

        // String str ="111<PUB_INFO>";
        // int i = str.indexOf("<PUB_INFO>");
        // System.out.println(i);


        // List<Book> listBook = Arrays.asList(
        //         new Book("111", "bk1", "liu", "测试1"),
        //         new Book("222", "bk2", "zk", "测试2"),
        //         new Book("444", "bk2", "zjamg", "测试4"),
        //         new Book("333", "bk2", "wang", "测试5"));
        // Book bk2 = listBook.stream().filter(bk -> bk.getBookName().equals("bk2")).findFirst().orElse(null);
        // Book bk3 = listBook.parallelStream().filter(bk -> bk.getBookName().equals("bk2")).findAny().orElse(null);
        // System.out.println(bk2);
        // System.out.println(bk3);


        // 过滤
/*        List<Book> filterList = listBook.stream().filter(bk -> bk.getId().equals("222")).collect(Collectors.toList());
        System.out.println(filterList);*/



        // listBook.forEach(book ->{
        //     Book bk = new Book();
        //     bk.setAuthor(book.getAuthor());
        //     bk.setId(book.getId());
        //     ts.add(bk);
        // });
        // System.out.println(ts);

        List<String> list = new ArrayList<>(16);
        list.add("123");
        list.add("456");

        System.out.println(list);

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            while (true){
                if (next.equals("123")){
                    int i =0;
                    System.out.println("第"+ ++i +"次遍历");
                    iterator.remove();
                    System.out.println(list);
                }else {
                    break;
                }

            }

        }

    }
}
