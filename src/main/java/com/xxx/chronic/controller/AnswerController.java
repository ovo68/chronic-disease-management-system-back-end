package com.xxx.chronic.controller;
import com.xxx.chronic.pojo.Answer;
import com.xxx.chronic.serive.AnswerService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
* (answer)表控制层
*
* @author xxxxx
*/
@RestController
@RequestMapping("/answer")
public class AnswerController {
/**
* 服务对象
*/
@Resource
private AnswerService answerService;

/**
* 通过主键查询单条数据
*
* @param id 主键
* @return 单条数据
*/
@GetMapping("selectOne")
public Answer selectOne(Integer id) {
return answerService.selectByPrimaryKey(id);
}

}
