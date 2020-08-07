package reflection.study.bean;

import com.sun.istack.internal.NotNull;
import jdk.nashorn.internal.runtime.logging.Logger;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
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
