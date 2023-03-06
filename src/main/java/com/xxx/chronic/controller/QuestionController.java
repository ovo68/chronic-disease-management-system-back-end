package com.xxx.chronic.controller;
import com.xxx.chronic.pojo.Question;
import com.xxx.chronic.serive.QuestionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
* (question)表控制层
*
* @author xxxxx
*/
@RestController
@RequestMapping("/question")
public class QuestionController {
/**
* 服务对象
*/
@Resource
private QuestionService questionService;

/**
* 通过主键查询单条数据
*
* @param id 主键
* @return 单条数据
*/
@GetMapping("selectOne")
public Question selectOne(Integer id) {
return questionService.selectByPrimaryKey(id);
}

}
