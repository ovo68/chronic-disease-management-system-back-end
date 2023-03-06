package com.xxx.chronic.controller;
import com.xxx.chronic.pojo.Sick;
import com.xxx.chronic.serive.SickService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
* (sick)表控制层
*
* @author xxxxx
*/
@RestController
@RequestMapping("/sick")
public class SickController {
/**
* 服务对象
*/
@Resource
private SickService sickService;

/**
* 通过主键查询单条数据
*
* @param id 主键
* @return 单条数据
*/
@GetMapping("selectOne")
public Sick selectOne(Integer id) {
return sickService.selectByPrimaryKey(id);
}

}
