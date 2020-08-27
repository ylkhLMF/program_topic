package entity;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import static org.junit.Assert.*;

public class FastJsonBeanTest {

    //language=JSON
    static String str = "{\n" +
            "  \"id\": \"l\",\n" +
            "  \"name\": \"liumf\"\n" +
            "  \n" +
            "}";

    public static void main(String[] args) {

        test1();
    }


    public static void test1(){
        FastJsonBean fastJsonBean = JSON.parseObject(str, FastJsonBean.class);
        System.out.println(fastJsonBean);
    }

    public static void test2(){

    }

    public static void test3(){

    }

}