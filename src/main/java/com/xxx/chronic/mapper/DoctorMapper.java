package com.xxx.chronic.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xxx.chronic.pojo.Doctor;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhengxin
 * @since 2023/3/6 10:27
 */
@Mapper
public interface DoctorMapper extends BaseMapper<Doctor> {
}