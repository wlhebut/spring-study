package com.ta.mapper;

import com.ta.pojo.Blog;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface BlogMapper {

     void addBlog(Blog blog);

     Blog queryBlogIf(Map<String,String> map);




}
