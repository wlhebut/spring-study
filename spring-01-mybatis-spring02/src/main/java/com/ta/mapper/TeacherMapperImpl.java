package com.ta.mapper;

import com.ta.pojo.Teacher;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class TeacherMapperImpl implements TeacherMapper {

    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<Teacher> selectTeachers() {
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teachers = mapper.selectTeachers();
        return teachers;
    }

    public List<Teacher> selectTeachers1(int id) {
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teachers = mapper.selectTeachers1(id);
        return teachers;
    }

    public List<Teacher> selectTeachers2(int id) {
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teachers = mapper.selectTeachers2(id);
        return teachers;
    }

    public Teacher selectById() {
        return null;
    }
}
