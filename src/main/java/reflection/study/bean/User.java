package reflection.study.bean;

import jdk.nashorn.internal.runtime.logging.Logger;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author dreamFly
 * @date 1:41 2020/8/8
 * @className User
 * @description
 */
@Data
@Logger
@Component
public class User implements Serializable {

    private String id;
    private String userName;
    private String password;

    public String address;

    private void testPrivate(){
        System.out.println("私有方法调用");
    }

    public User() {
    }

    public User(String id, String userName, String password, String address) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.address = address;
    }

    public static class InnerUser{

        @Override
        public String toString() {
            return "InnerUser{}";
        }
    }

    public static class InnerUser2{
        @Override
        public String toString() {
            return "InnerUser2{}";
        }
    }

    protected static class InnerUser3{
        @Override
        public String toString() {
            return "InnerUser3{}";
        }
    }

    private static class InnerUser4{
        @Override
        public String toString() {
            return "InnerUser4{}";
        }
    }

}
