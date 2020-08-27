package stream;

import com.alibaba.fastjson.JSON;
import entity.Book;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author dreamFly
 * @date 23:00 2020/8/27
 * @className StreamSort 流排序
 * @description
 */

public class StreamOperate {

    List<Book> books = Arrays.asList(new Book("5","码出高效代码","杨冠宝"),
            new Book("2","Springboot开发","王松"),
            new Book("1","JavaEE",""),
            new Book("10","Python","崔庆才"));


    /**
     * Stream排序
     */
    @Test
    public void streamSort() {
        System.out.println("正常排序前:" + books);
        books = books.stream().sorted((e1, e2) -> Integer.valueOf(e2.getId()) - Integer.valueOf(e1.getId())).collect(Collectors.toList());
        System.out.println("倒叙排序后:" + books);
        //Comparator.comparing(Book::getId)默认排序方法,针对整型
        List<Book> positiveOrderList = books.stream().sorted(Comparator.comparing(Book::getId)).collect(Collectors.toList());
        System.out.println("正序排序后:" + positiveOrderList);
    }
    /**
     * 过滤
     */
    @Test
    public void streamFilter(){


    }





}
