package com.ta.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sun.management.counter.perf.PerfInstrumentation;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog implements Serializable {
    private static final long serialVersionUID = -2347454269018419848L;

//    id	varchar(50)
//    title	varchar(100)
//    author	varchar(30)
//    create_time	datetime
//    views	int(30)


    private String id;
    private String title;
    private String author;
    private Date createTime;
    private Integer views;

}
