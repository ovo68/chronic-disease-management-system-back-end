package com.xxx.chronic.pojo;

import lombok.Data;

/**
 * @author zhengxin
 * @since 2023/3/6 9:40
 */
@Data
public class Answer {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 回答问题id
     */
    private Integer questionId;

    /**
     * 问题描述
     */
    private String description;

    /**
     * 回答内容
     */
    private String content;
}