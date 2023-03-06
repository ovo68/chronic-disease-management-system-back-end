package com.xxx.chronic.controller;

import com.xxx.chronic.pojo.Sick;
import com.xxx.chronic.service.SickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhengxin
 * @since 2023/3/6 12:43
 */
@RestController
@RequestMapping("/sick")
public class SickController {


    @Autowired
    private SickService sickService;

    @GetMapping("/{id}")
    public Map<String, Object> getSickInfoById(@PathVariable Integer id) {
        HashMap<String, Object> result = new HashMap<>();
        result.put("data", sickService.getById(id));
        result.put("msg", "success");
        result.put("code", 10001);
        return result;
    }

    @GetMapping("/volunteer/{id}")
    public Map<String, Object> beVolunteer(@PathVariable Integer id) {
        HashMap<String, Object> result = new HashMap<>();
        Sick sick = sickService.getById(id);
        sick.setIsVolunteer(1);
        sickService.updateById(sick);
        result.put("msg", "success");
        result.put("code", 10001);
        return result;
    }


}
