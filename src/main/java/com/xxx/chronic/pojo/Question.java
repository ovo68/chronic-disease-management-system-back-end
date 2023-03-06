package com.xxx.chronic.pojo;

import lombok.Data;

/**
 * @author zhengxin
 * @since 2023/3/6 9:40
 */
@Data
public class Question {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 问题描述
     */
    private String description;
}