package com.xxx.chronic.mapper;

import com.xxx.chronic.pojo.Recommendation;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhengxin
 * @since 2023/3/6 9:40
 */
@Mapper
public interface RecommendationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Recommendation record);

    int insertSelective(Recommendation record);

    Recommendation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Recommendation record);

    int updateByPrimaryKey(Recommendation record);
}