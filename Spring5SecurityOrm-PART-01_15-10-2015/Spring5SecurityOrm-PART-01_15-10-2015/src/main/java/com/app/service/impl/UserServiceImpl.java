package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IUserDao;
import com.app.model.User;
import com.app.service.IUserService;
@Service
// TxManagement + logics + calculation
public class UserServiceImpl 
	implements IUserService
{
	@Autowired
	private IUserDao dao;

	@Transactional
	public Integer saveUser(User user) {
		return dao.saveUser(user);
	}
	
	
	
	
	
}
