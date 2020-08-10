package reflection.study;


import org.junit.Test;
import reflection.study.bean.User;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/**
 * @author dreamFly
 * @date 1:40 2020/8/8
 * @className InvokeStudy
 * @description 反射
 */


@SuppressWarnings("all")
public class InvokeStudy {

    /**
     * 获取Class类的三种方式
     * @throws ClassNotFoundException
     */
    @Test
    public void getClassName() throws ClassNotFoundException {

        // 获取Class类方法一:
        Class<?> aClass = Class.forName("reflection.study.bean.User");
        System.out.println("获取全类名:"+aClass.getName());
        System.out.println("获取类名:"+aClass.getSimpleName());
        // 获取Class类方法二:
        Class<User> bClass = User.class;
        System.out.println(bClass.getName());
        // 获取Class类的方法三:通过实例对象获取
        User user = new User();
        Class<? extends User> cUser = user.getClass();
        System.out.println(cUser.getSimpleName());
    }

    /**
     * class类的相关操作方法
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     */
    @Test
    public void getClassMethod() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<?> aClass = Class.forName("reflection.study.bean.User");
        // 获取包名 注意:此时获取的包名有"package "前缀
        System.out.println(aClass.getPackage());
        // 获取User对象实例方法一:java9后不推荐使用
        User user = (User) aClass.newInstance();
        System.out.println("方法一获取User对象实例"+user);
        // 获取User对象实例方法二:java9推荐使用
        User user2 =(User) aClass.getDeclaredConstructor().newInstance();
        // 获取类加载器
        ClassLoader classLoader = aClass.getClassLoader();
        System.out.println(classLoader);
        // 获取静态内部公共类和接口数组,只能public修饰,返回一个数组,
        Class<?>[] classes = aClass.getClasses();
        for (Class<?> class1 : classes) {
            System.out.println("获取公共静态内部类:"+class1.getSimpleName());
        }
        // 获取全部静态内部类,非公共类和接口
        Class<?>[] declaredClasses = aClass.getDeclaredClasses();
        for (Class<?> declaredClass : declaredClasses) {
            System.out.println("获取全部静态内部类"+declaredClass.getSimpleName());
        }
        // 获取当前类的父类名称,java只允许单继承
        Class<?> superclass = aClass.getSuperclass();
        System.out.println(superclass.getSimpleName());
        // 获取当前类实现的接口,java允许多实现所以返回一个数组
        Class<?>[] interfaces = aClass.getInterfaces();
        System.out.println(interfaces);
    }

    /**
     * Class类中获取字段的相关方法
     * @throws Exception
     */
    @Test
    public void getField() throws Exception{

        Class<User> userClass = User.class;
        // 获取类中的相关字段名称(只能是public修饰的公共字段)
        Field[] fields = userClass.getFields();
        for (Field field : fields) {
            System.out.println("获取公共字段名:"+field.getName());
        }
        // 获取类中的所有字段(不分修饰符)
        Field[] declaredFields = userClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("获取所有不分修饰符字段:"+declaredField.getName());
        }
        // 获取单个不分修饰符字段
        Field fieldId = userClass.getDeclaredField("id");
        System.out.println("获取单个不分修饰符字段:"+fieldId);

        // 获取类中单个公共字段名称,必须public修饰的字段才能获取
        Field userName = userClass.getField("address");
        System.out.println("获取类中单个公共字段名称:"+userName.getName());
    }

    /**
     * 获取Class类中的注解
     */
/*    @Test
    public void getClassAnnotation(){
        User user = new User();
        Class<? extends User> aClass = user.getClass();
        // 获取类中的注解只有注解声明周期为RetentionPolicy.RUNTIME类型的才能被访问到,若为空则null
        Logger aClassAnnotation = aClass.getAnnotation(Logger.class);
        System.out.println("Logger"+aClassAnnotation);
        // Data的声明周期为Source,只在源文件中有效,编译后丢弃
        Data annotation = aClass.getAnnotation(Data.class);
        System.out.println("Data:"+annotation);
        // 获取多个注解
        Annotation[] annotations = aClass.getAnnotations();
        for (Annotation annotation1 : annotations) {
            System.out.println(annotation1);
        }
    }*/

    /**
     * 获取Class类的构造方法
     * @throws NoSuchMethodException
     */
    @Test
    public void getClassConstructor() throws NoSuchMethodException {
        Class<User> userClass = User.class;
        // 获取Class中所有的公共构造方法(public修饰)
        Constructor<?>[] constructors = userClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("获取构造方法的名称:"+constructor.getName());
            // 获取构造方法的参数个数
            int parameterCount = constructor.getParameterCount();
            System.out.println("构造方法的参数个数:"+parameterCount);
        }
        // 获取所有的构造方法,包括私有的
        Constructor<?>[] declaredConstructors = userClass.getDeclaredConstructors();
        System.out.println("获取所有的构造方法个数:"+declaredConstructors.length);

        // 根据指定的参数类型,获取构造方法
        Constructor<User> declaredConstructor = userClass.getDeclaredConstructor(String.class,String.class,String.class,String.class);
        System.out.println("有四个参数的构造方法:"+declaredConstructor.getName()+";参数个数是:"+declaredConstructor.getParameterCount());
    }

    /**
     * 获取Class中的非构造方法
     * @throws Exception
     */
    @Test
    public void getMethod() throws Exception{

        Class<?> aClass = Class.forName("reflection.study.bean.User");
        // 获取该类所有的public修饰的公共方法,包含父类Object
        Method[] methods = aClass.getMethods();
        List<Method> asList = Arrays.asList(methods);
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(String.class, String.class, String.class, String.class);
        for (Method method : asList) {
            if (method.getName().equals(declaredConstructor.getName())){
                System.out.println("包含构造方法");
            }
        }
        // 根据方法名和参数类型获取指定的公共方法,参数为可变参数
        Method getIdMethod = aClass.getMethod("getId");
        System.out.println(getIdMethod.getName());

        // 获取所有方法包括私有
        Method[] declaredMethods = aClass.getDeclaredMethods();
        // 获取单个方法
        Method getId = aClass.getDeclaredMethod("getId");
    }

}
