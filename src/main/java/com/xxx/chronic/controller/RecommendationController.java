package com.xxx.chronic.controller;

import com.xxx.chronic.pojo.Recommendation;
import com.xxx.chronic.service.RecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: hc
 * @Date: Create in  2023-03-06 10:32
 * @Modified by:
 */

@RestController
@RequestMapping("/recommendation")
public class RecommendationController {

    @Autowired
    private RecommendationService recommendationService;


    /**
     * 查询所有建议
     *
     * @return
     */
    @GetMapping("/")
    public Map<String, Object> allRecommendation() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("data", recommendationService.list());
        result.put("msg", "success");
        return result;
    }

    /**
     * 保存
     * @param recommendation
     * @return
     */
    @PostMapping("/")
    public Map<String, Object> saveRecommendation(@RequestBody Recommendation recommendation) {
        HashMap<String, Object> result = new HashMap<>();
        recommendationService.save(recommendation);
        result.put("msg", "success");
        return result;
    }
}
