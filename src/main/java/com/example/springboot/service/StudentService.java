package com.example.springboot.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springboot.domain.R;
import com.example.springboot.domain.Student;

import java.util.List;

public interface StudentService extends IService<Student> {
    public IPage getQueryPage(IPage page,Student student);
}
