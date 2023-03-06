package com.xxx.chronic.controller;
import com.xxx.chronic.pojo.Recommendation;
import com.xxx.chronic.serive.RecommendationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
* (recommendation)表控制层
*
* @author xxxxx
*/
@RestController
@RequestMapping("/recommendation")
public class RecommendationController {
/**
* 服务对象
*/
@Resource
private RecommendationService recommendationService;

/**
* 通过主键查询单条数据
*
* @param id 主键
* @return 单条数据
*/
@GetMapping("selectOne")
public Recommendation selectOne(Integer id) {
return recommendationService.selectByPrimaryKey(id);
}

}
