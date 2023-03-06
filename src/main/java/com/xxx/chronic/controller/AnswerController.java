package com.xxx.chronic.controller;

import com.xxx.chronic.pojo.Answer;
import com.xxx.chronic.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: hc
 * @Date: Create in  2023-03-06 10:44
 * @Modified by:
 */
@RestController
@RequestMapping("/answer")
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    /**
     * 查询所有问题
     *
     * @return
     */
    @GetMapping("/")
    public Map<String, Object> allAnswer() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("data", answerService.list());
        result.put("msg", "success");
        return result;
    }

    /**
     * 保存问题
     * @param answer
     * @return
     */
    @PostMapping("/")
    public Map<String, Object> saveAnswer(@RequestBody Answer answer) {
        HashMap<String, Object> result = new HashMap<>();
        answerService.save(answer);
        result.put("msg", "success");
        return result;
    }


}
