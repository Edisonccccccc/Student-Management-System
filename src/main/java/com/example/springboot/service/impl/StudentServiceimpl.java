package com.example.springboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot.Dao.StudentDao;
import com.example.springboot.domain.R;
import com.example.springboot.domain.Student;
import com.example.springboot.service.StudentService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class StudentServiceimpl extends ServiceImpl<StudentDao,Student> implements StudentService {
    @Resource
    StudentService studentService;
    @Override
    public IPage getQueryPage(IPage page, Student student) {
        LambdaQueryWrapper<Student> lambdaQueryWrapper=new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like(Strings.isNotEmpty(student.getNo()),Student::getNo,student.getNo());
        lambdaQueryWrapper.like(Strings.isNotEmpty(student.getName()),Student::getName,student.getName());
        lambdaQueryWrapper.like(Strings.isNotEmpty(student.getCollage()),Student::getCollage,student.getCollage());
        IPage iPage=studentService.page(page,lambdaQueryWrapper);
        return iPage;
    }
}