package com.xxx.chronic.serive;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.xxx.chronic.mapper.AnswerMapper;
import com.xxx.chronic.pojo.Answer;

/**
 * @author zhengxin
 * @since 2023/3/6 9:38
 */
@Service
public class AnswerService {

    @Resource
    private AnswerMapper answerMapper;


    public int deleteByPrimaryKey(Integer id) {
        return answerMapper.deleteByPrimaryKey(id);
    }


    public int insert(Answer record) {
        return answerMapper.insert(record);
    }


    public int insertSelective(Answer record) {
        return answerMapper.insertSelective(record);
    }


    public Answer selectByPrimaryKey(Integer id) {
        return answerMapper.selectByPrimaryKey(id);
    }


    public int updateByPrimaryKeySelective(Answer record) {
        return answerMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(Answer record) {
        return answerMapper.updateByPrimaryKey(record);
    }

}


