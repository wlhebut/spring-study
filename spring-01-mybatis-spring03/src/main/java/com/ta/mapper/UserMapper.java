package com.ta.mapper;

import com.ta.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserMapper {
    List<User> select();

    int insert(User user);


     List<User> selectByName(Map<String,Object> map);
}
