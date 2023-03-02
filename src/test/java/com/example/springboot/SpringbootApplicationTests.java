package com.example.springboot;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springboot.Dao.StudentDao;
import com.example.springboot.domain.Student;
import com.example.springboot.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.awt.print.Book;
import java.time.Year;
import java.util.function.Function;


@SpringBootTest
class SpringbootApplicationTests {
    @Resource
    StudentService studentService;

    @Test
    void contextLoads() {
//        Student student=new Student();
//        student.setNo("202025320113");
//        student.setName("c罗");
//        student.setAge(37);
//        student.setCollage("体育学院");
//        Boolean flag=studentService.save(student);
//        System.out.println(flag);
        Student student=new Student();
        System.out.println(student.getAge());
    }

}
