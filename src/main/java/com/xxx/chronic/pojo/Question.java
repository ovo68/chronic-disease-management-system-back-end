package com.xxx.chronic.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author zhengxin
 * @since 2023/3/6 10:27
 */
@Data
@TableName(value = "question")
public class Question {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    /**
     * 问题描述
     */
    @TableField(value = "description")
    private String description;
}