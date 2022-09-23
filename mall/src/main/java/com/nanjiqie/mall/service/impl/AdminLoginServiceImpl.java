package com.nanjiqie.mall.service.impl;

import com.nanjiqie.mall.mapper.AdminMapper;
import com.nanjiqie.mall.pojo.Admin;
import com.nanjiqie.mall.service.AdminLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//标记该层为服务层
@Service
public class AdminLoginServiceImpl implements AdminLoginService {

    @Autowired
    AdminMapper adminMapper;

    @Override
    public Admin findAdmin(String username,String password) {
        return adminMapper.findAdmin(username,password);
    }
}
