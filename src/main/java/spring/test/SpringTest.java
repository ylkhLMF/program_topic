package spring.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.bean.User;

/**
 * @author dreamFly
 * @date 15:50 2020/6/21
 * @className SpringTest
 * @description
 */

public class SpringTest {



    @SuppressWarnings("all")
    public static void main(String[] args) {

        // 第一种目前不推荐使用了
        /*
        ClassPathResource classPathResource = new ClassPathResource("applicationContext.xml");
        XmlBeanFactory factory = new XmlBeanFactory(classPathResource);
        // Object user = factory.getBean("user");  //实例化
        User user = factory.getBean(User.class);
        System.out.println(user);
        */
        /**
         * 目前的使用方式
         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User)context.getBean("user");
        System.out.println(user);


    }
}
