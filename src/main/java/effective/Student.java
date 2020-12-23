package effective;

import lombok.Data;

import java.util.List;

/**
 * @author liumf
 * @date 21:45 2020/11/3
 * @className Student
 * @description
 */
@Data
public class Student {

    private String id;
    private String name;
    private String grade;
    private String des;
    private List<Group> groups;


    public Student() {
    }

    public Student(String id, String name, String grade, String des) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.des = des;
    }
}

