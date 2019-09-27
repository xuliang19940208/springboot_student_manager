package com.qianfeng.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author xuliang
 * @Date 2019-9-26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)//开启链式编程
@TableName("t_student")
public class Student implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private Integer age;
}
