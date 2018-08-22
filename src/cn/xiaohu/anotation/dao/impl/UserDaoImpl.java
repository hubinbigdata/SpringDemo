package cn.xiaohu.anotation.dao.impl;

import org.springframework.stereotype.Repository;

import cn.xiaohu.anotation.bean.User;
import cn.xiaohu.anotation.dao.UserDao;

@Repository
public class UserDaoImpl implements UserDao{
   public UserDaoImpl() {
		System.out.println("UserDaoImpl...");
	}
	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("正在插入");
	}

}
