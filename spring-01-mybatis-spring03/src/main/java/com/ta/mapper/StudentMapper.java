package com.ta.mapper;

import com.ta.pojo.Student;

import java.util.List;

public interface StudentMapper {

    List<Student> selectStudents();

    Student selectById();


    List<Student> selectStudents2();


}
