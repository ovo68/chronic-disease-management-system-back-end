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
@TableName(value = "answer")
public class Answer {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 回答问题id
     */
    @TableField(value = "question_id")
    private Integer questionId;

    /**
     * 问题描述
     */
    @TableField(value = "description")
    private String description;

    /**
     * 回答内容
     */
    @TableField(value = "content")
    private String content;
}