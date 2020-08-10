package reflection.study;

import org.junit.Before;
import org.junit.Test;
import reflection.study.bean.User;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Copyright: Copyright (c) 2020 AsiaInfo
 *
 * @ClassName: MethodClassInvoke
 * @Description:
 * @version: v1.0.0
 * @author: liumf
 * @date: 16:41 2020/8/10
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 16:41       liumf           v1.1.0
 */
public class MethodClassInvoke {

    Class<User> userClass;
    User user;

    @Before
    public void beforeDo() {
        userClass = User.class;
        user = new User("15","userName","pwd","地址");
    }
    
    /**
     * @author liumf
     * @description 暴力反射调用私有方法
     * @params 
     * @return 
     * @time 2020/8/10 16:53
     * @version V1.0
     */
    @Test
    public void getMethod() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = userClass.getDeclaredMethod("getId");
        System.out.println(method);
        Object value = method.invoke(user);
        System.out.println(value);
        // 私有方法必须开启暴力反射
        Method testPrivate = userClass.getDeclaredMethod("testPrivate");
        testPrivate.setAccessible(true);
        testPrivate.invoke(user);


        Method setMethod = userClass.getDeclaredMethod("setId", String.class);
        // 执行指定对象的方法
        setMethod.invoke(user,"1");
        System.out.println(user);
    }

}