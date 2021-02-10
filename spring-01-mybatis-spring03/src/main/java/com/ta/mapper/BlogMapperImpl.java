package com.ta.mapper;

import com.ta.pojo.Blog;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BlogMapperImpl implements BlogMapper {

    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public void addBlog(Blog blog) {
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        mapper.addBlog(blog);
    }

    public Blog queryBlogIf(Map<String, String> map) {
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Blog blogs = mapper.queryBlogIf(map);

        return blogs;
    }

}
