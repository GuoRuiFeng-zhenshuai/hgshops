package com.bawei.hgshop.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.bawei.hgshop.config.AdminProperties;
import com.bawei.hgshop.service.UserService;

/**
 * 
 * @author zhuzg
 *
 */
@Service(interfaceClass=UserService.class,version="1.0.0")
public class UserServiceImpl implements UserService{
	
	// 得到管理员的信息
	@Autowired
	AdminProperties adminPro;

	@Override
	public boolean login(String userName, String passWord) {
		
		// TODO Auto-generated method stub
		//判断用户和密码是否与配置文件一致
		return (adminPro.getAdminName().equals(userName) 
				&& adminPro.getPassword().equals(passWord));
		
		
	}

}
