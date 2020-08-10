package reflection.study;

import org.junit.Before;
import org.junit.Test;
import reflection.study.bean.User;

import java.lang.reflect.Field;

/**
 * Copyright: Copyright (c) 2020 AsiaInfo
 *
 * @ClassName: FiledClass
 * @Description:
 * @version: v1.0.0
 * @author: liumf
 * @date: 12:56 2020/8/10
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 12:56       liumf           v1.1.0
 */
@SuppressWarnings("all")
public class FiledClass {

    Class<User> userClass;
    User user;
    @Before
    public void beforeTest(){
        userClass = User.class;
        user = new User("15","userName","pwd","地址");
    }


    /**
     * @author liumf
     * @description 暴力反射获取对象私有属性的值
     * @params
     * @return
     * @time 2020/8/10 13:15
     * @version V1.0
     */
    @Test
    public void filedTest() throws Exception{


        Field userIdParam = userClass.getDeclaredField("id");
        String name = userIdParam.getName();
        System.out.println("获取到的当前属性名称:"+name);
        /*
        获取当前对象中的字段的值,此时因为Id属性是private修饰所以会报错
        System.out.println(userIdParam.get(user));
        */
        // 要像获得当前私有属性的值必须开启暴力反射
        userIdParam.setAccessible(true);
        System.out.println(userIdParam.get(user));

    }
    /**
     * @author liumf
     * @description 给私有属性设置值
     * @params
     * @return
     * @time 2020/8/10 16:40
     * @version V1.0
     */
    @Test
    public void TestSet() throws NoSuchFieldException, IllegalAccessException {
        System.out.println("反射前:"+user);
        Field userName = userClass.getDeclaredField("userName");
        // 开启暴力反射,否则无法设置私有属性的值
        userName.setAccessible(true);
        // 设置属性值
        userName.set(user,"李四");
        System.out.println("反射后:"+user);
    }

}