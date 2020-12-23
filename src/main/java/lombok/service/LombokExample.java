package lombok.service;


import lombok.*;
import lombok.extern.slf4j.Slf4j;
import lombok.pojo.User;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/**
 * @author liumf
 * @date 21:28 2020/12/23
 * @className LombokExample
 * @description
 */

/**@Value
 * 使用@Value注解可以把类声明为不可变的，声明后此类相当于final类，无法被继承，其属性也会变成final属性。
 */

public class LombokExample {


    @Test
    public void valExample() {
        // 1.使用val注解可以取代任意类型作为局部变量
        val val = new ArrayList<String>(16);
        val.add("1");
        val.add("2");

        String s = val.get(1);
        System.out.println(s);
        System.out.println(val);
    }


    @Test
    public void nonNullExample() {
        // 2.@NonNull的使用，直接会报空指针，原因是编译后的class会直接加上非空判断
        String name = null;
        notNullExample(name);
    }
    private static void notNullExample(@NonNull String name) {
        System.out.println(name);
    }


    @Test
    public void nonNullProperty() {
        // 2.@NonNull的使用，直接会报空指针，原因是编译后的class会直接加上非空判断
        // User user = new User();
        // notNullProperty(user);
    }

    private static void notNullProperty(@NonNull User user) {
        System.out.println(user);
    }


    /**
     * @author liumf
     * 使用输入输出流自动关闭，无需编写try catch和调用close()方法
     * class 文件编译后会自动生成finally释放资源
     * @throws IOException
     */

    @Test
    public void CleanupExample() throws Exception {
        String inStr = "Hello World!";
        //使用输入输出流自动关闭，无需编写try catch和调用close()方法
        @Cleanup ByteArrayInputStream in = new ByteArrayInputStream(inStr.getBytes("UTF-8"));
        @Cleanup ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] b = new byte[1024];
        while (true) {
            int r = in.read(b);
            if (r == -1) break;
            out.write(b, 0, r);
        }
        String outStr = out.toString("UTF-8");
        System.out.println(outStr);
    }


    /**
     * 使用@Builder注解可以通过建造者模式来创建对象，建造者模式加链式调用，创建对象太方便了！
     * 注意最后要加上.build()
     */
    @Test
    public void buildExample(){
        User user = User.builder()
                .name("liu")
                .pwd("xy").build();
        notNullProperty(user);
    }


    /**
     * 手动抛出异常？？？？？？试试@SneakyThrows
     */
    @Test
    public void neakyThrowsExample() {
        String str = "Hello World!";
        System.out.println(str2byte(str).length);
    }
    //自动抛出异常，无需处理
    @SneakyThrows(UnsupportedEncodingException.class)
    public byte[] str2byte(String str) {
        return str.getBytes("UTF-8");
    }

    /**
     * 单例模式  @Synchronized 实现自动枷锁
     *
     * 当我们在多个线程中访问同一资源时，往往会出现线程安全问题，以前我们往往使用synchronized关键字修饰方法来实现同步访问。使用@Synchronized注解同样可以实现同步访问。
     */

    // public static void main(String[] args) {
    //     LombokExample lombokExample = LombokExample.getLombokExample();
    //     System.out.println(lombokExample);
    // }
    private static LombokExample lombokExample;
    private LombokExample() {
    }
    @Synchronized
    public static LombokExample getLombokExample(){
        // if (lombokExample == null){
            synchronized (LombokExample.class){
                if (lombokExample ==null){
                    lombokExample = new LombokExample();
                }
            }
        // }
        return lombokExample;
    }



    /**
     * @with 实现对象克隆 见Stuent类
     */


}
