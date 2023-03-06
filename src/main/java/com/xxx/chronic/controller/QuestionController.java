package com.xxx.chronic.controller;

import com.xxx.chronic.pojo.Question;
import com.xxx.chronic.service.QuestionService;
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
 * @Date: Create in  2023-03-06 11:00
 * @Modified by:
 */
@RestController
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    /**
     * 查询所有问题
     *
     * @return
     */
    @GetMapping("/all")
    public Map<String, Object> allQuestion() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("data", questionService.list());
        result.put("code", 10001);
        result.put("msg", "success");
        return result;
    }

    /**
     * 保存问题
     * @param question
     * @return
     */
    @PostMapping("/save")
    public Map<String, Object> saveQuestion(@RequestBody Question question) {
        HashMap<String, Object> result = new HashMap<>();
        questionService.save(question);
        result.put("msg", "success");
        result.put("code", 10001);
        return result;
    }
}
