package com.xxx.chronic.pojo;

import lombok.Data;

/**
 * @author zhengxin
 * @since 2023/3/6 9:40
 */
@Data
public class Recommendation {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 建议内容
     */
    private String content;
}