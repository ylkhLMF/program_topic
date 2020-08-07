package spring.bean;

import lombok.Data;

/**
 * @author liumf
 * @date 15:40 2020/6/21
 * @className User
 * @description
 */
@Data
public class User {

    private String userName;
    private String address;
    private String password;
    private String phoneNum;

    public User() {
    }

    public User(String password) {
        this("小明","杭州",password,"17721518301");
    }

    public User(String userName, String address, String password, String phoneNum) {
        this.userName = userName;
        this.address = address;
        this.password = password;
        this.phoneNum = phoneNum;
    }


}

