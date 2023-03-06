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
@TableName(value = "recommendation")
public class Recommendation {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 建议内容
     */
    @TableField(value = "content")
    private String content;
}