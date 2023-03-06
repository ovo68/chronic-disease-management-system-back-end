package com.xxx.chronic.pojo;

import lombok.Data;

/**
 * @author zhengxin
 * @since 2023/3/6 9:40
 */
@Data
public class Sick {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 男：1；女：0
     */
    private Integer sex;

    /**
     * 志愿者：1；非志愿者：0
     */
    private Integer isVolunteer;

    /**
     * 手机号码；登录账号
     */
    private String phone;

    /**
     * 地址
     */
    private String address;

    /**
     * 用药信息
     */
    private String drugInfo;

    /**
     * 医嘱信息
     */
    private String doctorAdvice;

    /**
     * 过往病史
     */
    private String pastMedical;

    /**
     * 体检信息
     */
    private String examInfo;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 病人：0；医生：1
     */
    private Integer role;
}