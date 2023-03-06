package com.xxx.chronic.serive;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.xxx.chronic.mapper.RecommendationMapper;
import com.xxx.chronic.pojo.Recommendation;

/**
 * @author zhengxin
 * @since 2023/3/6 9:38
 */
@Service
public class RecommendationService {

    @Resource
    private RecommendationMapper recommendationMapper;


    public int deleteByPrimaryKey(Integer id) {
        return recommendationMapper.deleteByPrimaryKey(id);
    }


    public int insert(Recommendation record) {
        return recommendationMapper.insert(record);
    }


    public int insertSelective(Recommendation record) {
        return recommendationMapper.insertSelective(record);
    }


    public Recommendation selectByPrimaryKey(Integer id) {
        return recommendationMapper.selectByPrimaryKey(id);
    }


    public int updateByPrimaryKeySelective(Recommendation record) {
        return recommendationMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Recommendation record) {
        return recommendationMapper.updateByPrimaryKey(record);
    }

}

