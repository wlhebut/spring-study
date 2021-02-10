package com.ta.pojo;

import java.util.List;

public class Hello {
    private String str;
    private List<String> list;

    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }


    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                ", list=" + list +
                '}';
    }
}
