package com.xxx.chronic.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xxx.chronic.pojo.Doctor;
import com.xxx.chronic.pojo.Sick;
import com.xxx.chronic.service.DoctorService;
import com.xxx.chronic.service.SickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
     *
     * @param doctor
     * @return
     */
    @PostMapping("/register")
    public Map<String, Object> saveSick(@RequestBody Doctor doctor) {
        HashMap<String, Object> result = new HashMap<>();
        Doctor doctorDB = doctorService.getOne(new QueryWrapper<Doctor>().eq("phone", doctor.getPhone()));
        if (doctorDB != null) {
            result.put("code", 10002);
            result.put("msg", "账号已存在");
            return result;
        }
        doctor.setRole(1);
        doctorService.save(doctor);
        result.put("code", 10001);
        result.put("msg", "success");
        return result;
    }

    @GetMapping("/test")
    public Map<String, Object> test() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("msg", "success");
        return result;
    }

    /**
     * 查询所有病人诊断记录
     *
     * @return
     */
    @GetMapping("/allSick")
    public Map<String, Object> allSick() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("data", sickService.list());
        result.put("code", 10001);
        result.put("msg", "success");
        return result;
    }

    /**
     * 新增病人
     *
     * @param sick
     * @return
     */
    @PostMapping("/saveSick")
    public Map<String, Object> saveSick(@RequestBody Sick sick) {
        HashMap<String, Object> result = new HashMap<>();
        try {
            Sick sickDB = sickService.getOne(new QueryWrapper<Sick>().eq("phone", sick.getPhone()));
            if (sickDB != null) {
                result.put("code", 10002);
                result.put("msg", "已有患者信息");
                return result;
            }
            sick.setPassword(sick.getPhone());
            sick.setIsVolunteer(0);
            sickService.save(sick);
            result.put("code", 10001);
            result.put("msg", "success");
            return result;
        } catch (Exception e) {
            result.put("code", 10002);
            result.put("msg", "添加失败");
            return result;

        }
    }

    @GetMapping("/nameLikeSick")
    public Map<String, Object> nameLikeSick(@RequestParam("keyword") String keyword) {
        HashMap<String, Object> result = new HashMap<>();
        result.put("data", sickService.list(new QueryWrapper<Sick>().like("name", keyword)));
        result.put("code", 10001);
        result.put("msg", "success");
        return result;
    }

}
