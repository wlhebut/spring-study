package com.ta.mapper;

import com.ta.pojo.Teacher;

import java.util.List;

public interface TeacherMapper {
    List<Teacher> selectTeachers();
    List<Teacher> selectTeachers1(Integer id);
    List<Teacher> selectTeachers2(int id);

    Teacher selectById();

}
