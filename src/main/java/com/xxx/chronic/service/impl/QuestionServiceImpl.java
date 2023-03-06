package com.xxx.chronic.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxx.chronic.pojo.Question;
import com.xxx.chronic.mapper.QuestionMapper;
import com.xxx.chronic.service.QuestionService;
/**
 * @author zhengxin
 * @since 2023/3/6 10:27
 */
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question> implements QuestionService{

}
