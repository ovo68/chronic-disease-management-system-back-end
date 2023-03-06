package com.xxx.chronic.mapper;

import com.xxx.chronic.pojo.Doctor;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhengxin
 * @since 2023/3/6 9:40
 */
@Mapper
public interface DoctorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Doctor record);

    int insertSelective(Doctor record);

    Doctor selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Doctor record);

    int updateByPrimaryKey(Doctor record);
}