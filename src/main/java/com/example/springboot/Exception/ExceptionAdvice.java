package com.example.springboot.Exception;

import com.example.springboot.domain.R;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {
    @ExceptionHandler
    public R doHandler(Exception e){
         e.printStackTrace();
         return new R("请检查该学号是否已被注册或者有其他不合法的行为");
    }
}
