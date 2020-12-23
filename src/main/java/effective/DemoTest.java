package effective;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * @author dreamFly
 * @date 23:45 2020/4/14
 * @className TestDemo
 * @description
 */

public class DemoTest {


    /**
     * 左移 几位就相当于于*2的几次方
     */
    @Test
    public void leftDisplacement(){

        int num =4;
        int y;
        y = num<<2;
        int expected = 4;
        Assert.assertEquals(expected,0,y);
    }

    @Test
    public void test1(){

        Node node1 = new Node();
        Node node2 =node1;
        System.out.println("node1="+node1);
        System.out.println("node2="+node2);

        Node node3 = new Node(3);
        node2.next =node3;

        System.out.println("node1="+node1);
        System.out.println("node2="+node2);
    }

    public static void main(String[] args) {
        String  s = "{\n" +
                "  \"billId\": \"432423\",\n" +
                "  \"billId2\": \"34324324\",\n" +
                "  \"billId4\": \"324234\",\n" +
                "  \"billId5\": \"234234\",\n" +
                "  \"billIde\": \"324234\",\n" +
                "  \"billId3\": \"334324324\"\n" +
                "}" ;



    }


    public class Node{

        int i ;
        Node next;

        public Node() {
        }

        public Node(int i) {
            this.i = i;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "i=" + i +
                    ", next=" + next +
                    '}';
        }
    }



    public class Person{

        private int age;

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "age=" + age +
                    '}';
        }

        public void setAge(int age) {
            this.age = age;
        }
    }


    @Test
    public void personTest(){

        Person person1 = new Person();
        Person person2 =person1;

        person2.setAge(1);
        System.out.println(person1);

    }

    @Test
    public void test2(){


        Stack<String> stack = new Stack<String>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");
        System.out.println(stack);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        List<String> strings = new ArrayList<String>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        for (String string : strings) {
            System.out.println(string);
        }
    }


}
