package com.xxx.chronic.serive;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.xxx.chronic.mapper.SickMapper;
import com.xxx.chronic.pojo.Sick;

/**
 * @author zhengxin
 * @since 2023/3/6 9:38
 */
@Service
public class SickService {

    @Resource
    private SickMapper sickMapper;


    public int deleteByPrimaryKey(Integer id) {
        return sickMapper.deleteByPrimaryKey(id);
    }


    public int insert(Sick record) {
        return sickMapper.insert(record);
    }


    public int insertSelective(Sick record) {
        return sickMapper.insertSelective(record);
    }


    public Sick selectByPrimaryKey(Integer id) {
        return sickMapper.selectByPrimaryKey(id);
    }


    public int updateByPrimaryKeySelective(Sick record) {
        return sickMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Sick record) {
        return sickMapper.updateByPrimaryKey(record);
    }

}

