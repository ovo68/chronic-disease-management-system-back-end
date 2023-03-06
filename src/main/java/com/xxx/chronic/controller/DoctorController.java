package com.xxx.chronic.controller;

import com.xxx.chronic.pojo.Doctor;
import com.xxx.chronic.pojo.Sick;
import com.xxx.chronic.service.DoctorService;
import com.xxx.chronic.service.SickService;
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
 * @Date: Create in  2023-03-06 11:06
 * @Modified by:
 */
@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private SickService sickService;
    @Autowired
    private DoctorService doctorService;

    /**
     * 医生注册
     * @param doctor
     * @return
     */
    @PostMapping("/")
    public Map<String, Object> saveSick(@RequestBody Doctor doctor) {
        HashMap<String, Object> result = new HashMap<>();
        doctorService.save(doctor);
        result.put("msg", "success");
        return result;
    }

    /**
     * 查询所有病人诊断记录
     *
     * @return
     */
    @GetMapping("/")
    public Map<String, Object> allSick() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("data", sickService.list());
        result.put("msg", "success");
        return result;
    }

    /**
     * 新增病人
     * @param sick
     * @return
     */
    @PostMapping("/")
    public Map<String, Object> saveSick(@RequestBody Sick sick) {
        HashMap<String, Object> result = new HashMap<>();
        sickService.save(sick);
        result.put("msg", "success");
        return result;
    }
}
