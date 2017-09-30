package com.template.service;

import com.template.mapper.StudentMapper;
import com.template.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hr on 2017/9/30.
 */
@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentMapper studentMapper;


    public List<Student> findStudentList() {
        return studentMapper.findStudentList();
    }
}
