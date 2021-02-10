package com.ta.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Student {

    private String name;

    @Autowired // 默认是bytype
//    @Resource // 默认byname ，name没有，通过bytype
//    都可以放到//属性上实现自动装配
    private Dog dog;




}
