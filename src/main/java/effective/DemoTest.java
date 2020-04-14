package effective;

import org.junit.Test;

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
        System.out.println(y);

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
}
