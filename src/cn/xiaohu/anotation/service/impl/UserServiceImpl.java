package cn.xiaohu.anotation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xiaohu.anotation.bean.User;
import cn.xiaohu.anotation.dao.UserDao;
import cn.xiaohu.anotation.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	public UserServiceImpl() {
		System.out.println("UserServiceImpl...");
	}
	@Autowired
	private UserDao userDao;

	@Override
	public void save(User user) {
		userDao.insert(user);

	}

}
