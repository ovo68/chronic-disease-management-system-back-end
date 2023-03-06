package com.xxx.chronic.controller;
import com.xxx.chronic.pojo.Doctor;
import com.xxx.chronic.serive.DoctorService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
* (doctor)表控制层
*
* @author xxxxx
*/
@RestController
@RequestMapping("/doctor")
public class DoctorController {
/**
* 服务对象
*/
@Resource
private DoctorService doctorService;

/**
* 通过主键查询单条数据
*
* @param id 主键
* @return 单条数据
*/
@GetMapping("selectOne")
public Doctor selectOne(Integer id) {
return doctorService.selectByPrimaryKey(id);
}

}
