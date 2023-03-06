package com.xxx.chronic.pojo;

import lombok.Data;

/**
 * @author zhengxin
 * @since 2023/3/6 9:40
 */
@Data
public class Doctor {
    /**
     * id
     */
    private Integer id;

    /**
     * 医生名字
     */
    private String name;

    /**
     * 手机号；登录账号
     */
    private String phone;
}