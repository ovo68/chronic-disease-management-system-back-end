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
@TableName(value = "sick")
public class Sick {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Integer id;

    /**
     * 姓名
     */
    @TableField(value = "`name`")
    private String name;

    /**
     * 年龄
     */
    @TableField(value = "age")
    private Integer age;

    /**
     * 男：1；女：0
     */
    @TableField(value = "sex")
    private Integer sex;

    /**
     * 志愿者：1；非志愿者：0
     */
    @TableField(value = "is_volunteer")
    private Integer isVolunteer;

    /**
     * 手机号码；登录账号
     */
    @TableField(value = "phone")
    private String phone;

    /**
     * 地址
     */
    @TableField(value = "address")
    private String address;

    /**
     * 用药信息
     */
    @TableField(value = "drug_info")
    private String drugInfo;

    /**
     * 医嘱信息
     */
    @TableField(value = "doctor_advice")
    private String doctorAdvice;

    /**
     * 过往病史
     */
    @TableField(value = "past_medical")
    private String pastMedical;

    /**
     * 体检信息
     */
    @TableField(value = "exam_info")
    private String examInfo;

    /**
     * 登录密码
     */
    @TableField(value = "`password`")
    private String password;

    /**
     * 病人：0；医生：1
     */
    @TableField(value = "`role`")
    private Integer role;
}