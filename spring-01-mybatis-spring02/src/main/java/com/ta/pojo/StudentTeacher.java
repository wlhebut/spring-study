package com.ta.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentTeacher {

    private int id;
    private String studentName;
    private String teacherName;

}
