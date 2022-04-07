package design;

/**
 * @author liumf
 * @date 15:22 2022/4/6
 * @className JavaBeanBuilder
 * @description idea生成setter方法快捷设置
 */
public class JavaBeanBuilder {


    private String name;
    private Integer id;
    private Integer age;

    public JavaBeanBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public JavaBeanBuilder setId(Integer id) {
        this.id = id;
        return this;
    }

    public JavaBeanBuilder setAge(Integer age) {
        this.age = age;
        return this;
    }
}
