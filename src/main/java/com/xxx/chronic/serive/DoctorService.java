package com.xxx.chronic.serive;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.xxx.chronic.mapper.DoctorMapper;
import com.xxx.chronic.pojo.Doctor;

/**
 * @author zhengxin
 * @since 2023/3/6 9:38
 */
@Service
public class DoctorService {

    @Resource
    private DoctorMapper doctorMapper;


    public int deleteByPrimaryKey(Integer id) {
        return doctorMapper.deleteByPrimaryKey(id);
    }


    public int insert(Doctor record) {
        return doctorMapper.insert(record);
    }


    public int insertSelective(Doctor record) {
        return doctorMapper.insertSelective(record);
    }


    public Doctor selectByPrimaryKey(Integer id) {
        return doctorMapper.selectByPrimaryKey(id);
    }


    public int updateByPrimaryKeySelective(Doctor record) {
        return doctorMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Doctor record) {
        return doctorMapper.updateByPrimaryKey(record);
    }

}

