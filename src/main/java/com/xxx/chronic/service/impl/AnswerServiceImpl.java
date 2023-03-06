package com.xxx.chronic.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxx.chronic.mapper.AnswerMapper;
import com.xxx.chronic.pojo.Answer;
import com.xxx.chronic.service.AnswerService;
/**
 * @author zhengxin
 * @since 2023/3/6 10:27
 */
@Service
public class AnswerServiceImpl extends ServiceImpl<AnswerMapper, Answer> implements AnswerService{

}
