package com.example.reviewgit;

import com.example.reviewgit.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ReviewGitApplicationTests {

    @Test
    void contextLoads() {
        Student student = new Student();
        student.setAge(10);
        student.setName("张三");
        student.setSex(1);
        student.setIdCar("1234567891234578");
        System.out.println(student.toString()+"============");
    }

}
