package com.ta.mapper;

import com.ta.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;
import java.util.Map;

public class UserMapperImpl implements UserMapper {

    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> select() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.select();
    }

    public int insert(User user) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int insert = mapper.insert(user);

         int m = 1/0;
        return insert;
    }

    public List<User> selectByName(Map<String,Object> map) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectByName(map);
        return users;
    }
}
