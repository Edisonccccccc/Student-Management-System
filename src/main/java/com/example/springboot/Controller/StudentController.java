package com.example.springboot.Controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springboot.domain.R;
import com.example.springboot.domain.Student;
import com.example.springboot.service.StudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Resource
    StudentService studentService;

    @PostMapping
    public R insert(@RequestBody Student student){
        boolean flag= studentService.save(student);
        return new R(flag,"添加成功");
    }

    @DeleteMapping("{No}")
    public R delete(@PathVariable String No){
        QueryWrapper<Student> queryWrapper=new QueryWrapper<Student>();
        queryWrapper.eq("No",No);
        return new R(studentService.remove(queryWrapper));
    }
    @GetMapping({"{No}"})
    public R query(@PathVariable String No){
        return new R(true,studentService.getById(No));
    }
    @PutMapping
    public R update(@RequestBody Student student){
        return new R(studentService.updateById(student));
    }
    @GetMapping
    public R getAll(){
        return new R(true,studentService.list());
    }



    @GetMapping("{cur}/{size}")
    public R getStuPgae(@PathVariable int cur,@PathVariable int size,Student student){
         IPage page=new Page(cur,size);
         IPage iPage=studentService.getQueryPage(page,student);
         //用于解决当前页面大于总页面数的情况
         if (iPage.getCurrent()>iPage.getPages()){
             if (iPage.getRecords().isEmpty()){
                 return new R(false,iPage);
             }
             else {
                 IPage page1 = new Page(iPage.getPages(), size);
                 iPage = studentService.page(page1, null);
             }
         }
         return new R(true,iPage);
    }
}
