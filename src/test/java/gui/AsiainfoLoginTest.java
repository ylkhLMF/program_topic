package gui;

import entity.Book;

import java.util.Optional;

import static org.junit.Assert.*;

public class LoginTest {


    public static void main(String[] args) {

  /*      Book book = new Book();
        book.setBookName("123");*/
        Book book = null;

        String name = Optional.ofNullable(book).map(u -> u.getBookName()).get();

        System.out.println(name);

    }

}
