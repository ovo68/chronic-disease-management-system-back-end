package com.xxx.chronic.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxx.chronic.mapper.SickMapper;
import com.xxx.chronic.pojo.Sick;
import com.xxx.chronic.service.SickService;
/**
 * @author zhengxin
 * @since 2023/3/6 10:27
 */
@Service
public class SickServiceImpl extends ServiceImpl<SickMapper, Sick> implements SickService{

}
