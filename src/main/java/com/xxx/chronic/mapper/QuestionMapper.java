package com.xxx.chronic.mapper;

import com.xxx.chronic.pojo.Question;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhengxin
 * @since 2023/3/6 9:40
 */
@Mapper
public interface QuestionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Question record);

    int insertSelective(Question record);

    Question selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Question record);

    int updateByPrimaryKey(Question record);
}