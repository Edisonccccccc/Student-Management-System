package com.example.springboot.domain;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Student {
    @TableId
    private String No;
    private String name;
    private String collage;
    private Integer age;


}
