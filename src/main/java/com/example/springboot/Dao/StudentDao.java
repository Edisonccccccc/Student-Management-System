package com.example.springboot.Dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot.domain.Student;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface StudentDao extends BaseMapper<Student> {

}
