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
 * @author zhengxin
 * @since 2023/3/6 12:49
 */

@RestController
@RequestMapping("/index")
public class LoginController {

    @Autowired
    private SickService sickService;

    @Autowired
    private DoctorService doctorService;


    @PostMapping("/login")
    public Map<String, Object> login(@RequestParam("phone") String phone, @RequestParam("password") String password) {
        HashMap<String, Object> result = new HashMap<>();
        Doctor doctorDB = doctorService.getOne(new QueryWrapper<Doctor>().eq("phone", phone));
        if (doctorDB == null) {
            Sick sickDB = sickService.getOne(new QueryWrapper<Sick>().eq("phone", phone));
            if (sickDB == null) {
                result.put("code", 10002);
                result.put("msg", "账号不存在");
                return result;
            } else {
                if (!sickDB.getPassword().equals(password)) {
                    result.put("code", 10002);
                    result.put("msg", "密码错误");
                    return result;
                } else {
                    result.put("code", 10001);
                    result.put("data", sickDB);
                    result.put("msg", "登录成功");
                    return result;
                }
            }

        } else {
            if (!doctorDB.getPassword().equals(password)) {
                result.put("code", 10002);
                result.put("msg", "密码错误");
                return result;
            } else {
                result.put("code", 10001);
                result.put("msg", "登录成功");
                result.put("data", doctorDB);
                return result;
            }
        }
    }


    @PostMapping("/register")
    public Map<String, Object> register(@RequestBody Doctor doctor) {
        HashMap<String, Object> result = new HashMap<>();
        Doctor doctorDB = doctorService.getOne(new QueryWrapper<Doctor>().eq("phone", doctor.getPhone()));
        if (doctorDB != null) {
            result.put("code", 10002);
            result.put("msg", "账号已存在");
            return result;
        }

        doctorService.save(doctor);
        result.put("code", 10001);
        result.put("msg", "注册成功");
        return result;

    }


}
