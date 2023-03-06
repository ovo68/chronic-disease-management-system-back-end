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
@TableName(value = "doctor")
public class Doctor {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 医生名字
     */
    @TableField(value = "`name`")
    private String name;

    /**
     * 手机号；登录账号
     */
    @TableField(value = "phone")
    private String phone;


    /**
     * 密码
     */
    @TableField(value = "password")
    private String password;


    /**
     * 病人：0；医生：1
     */
    @TableField(value = "`role`")
    private Integer role;

}