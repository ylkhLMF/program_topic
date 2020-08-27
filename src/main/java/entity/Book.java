package entity;

import lombok.Data;

/**
 * @author dreamFly
 * @date 23:01 2020/8/27
 * @className Book
 * @description
 */
@Data
public class Book {
    private String id;
    private String bookName;
    private String author;
    private String des;


    public Book(String id, String bookName, String author, String des) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.des = des;
    }

    public Book() {
    }


    public Book(String id, String bookName, String author) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
    }
}
