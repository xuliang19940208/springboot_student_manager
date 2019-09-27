package com.qianfeng.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qianfeng.dao.StuMapper;
import com.qianfeng.entity.Student;
import com.qianfeng.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author xuliang
 * @Date 2019-9-26
 */
@Service
public class StuServiceImpl extends ServiceImpl<StuMapper,Student> implements IStuService {

    @Autowired
    private StuMapper stuMapper;

}
