package com.nanjiqie.mall.service;

import com.nanjiqie.mall.mapper.AdminMapper;
import com.nanjiqie.mall.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;

public interface AdminLoginService {

    public Admin findAdmin(String username,String password);

}
