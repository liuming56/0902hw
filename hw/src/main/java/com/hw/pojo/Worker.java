package com.hw.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("worker")
public class Worker {
    @TableId( value = "wid",type = IdType.AUTO)
    private Integer wid;
    private String wname;
    private String wsex;
    private String wtel;
    private Integer deptid;
    private String wimg;
}
