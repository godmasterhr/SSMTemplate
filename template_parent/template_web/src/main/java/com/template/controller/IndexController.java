package com.template.controller;

import com.template.pojo.Student;
import com.template.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by hr on 2017/9/30.
 */
@Controller
public class IndexController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/index")
    public String toHome(){
        List<Student> studentList = studentService.findStudentList();
        System.out.println(studentList);
        return "home";
    }

    @RequestMapping("/hr")
    public String toHr(){
        return "hr";
    }
}
