package com.xxx.chronic.mapper;

import com.xxx.chronic.pojo.Sick;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhengxin
 * @since 2023/3/6 9:40
 */
@Mapper
public interface SickMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Sick record);

    int insertSelective(Sick record);

    Sick selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Sick record);

    int updateByPrimaryKey(Sick record);
}