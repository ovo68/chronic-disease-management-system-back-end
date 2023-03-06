package com.xxx.chronic.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxx.chronic.mapper.DoctorMapper;
import com.xxx.chronic.pojo.Doctor;
import com.xxx.chronic.service.DoctorService;
/**
 * @author zhengxin
 * @since 2023/3/6 10:27
 */
@Service
public class DoctorServiceImpl extends ServiceImpl<DoctorMapper, Doctor> implements DoctorService{

}
