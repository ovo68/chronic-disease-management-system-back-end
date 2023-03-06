package com.xxx.chronic.controller;

import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhengxin
 * @since 2023/3/6 9:50
 */
@RestController
@RequestMapping("/login")
public class LoginController {


    @PostMapping("/")
    public Map<String, Object> login() {
        HashMap<String, Object> result = new HashMap<>();


        return result;
    }

}
