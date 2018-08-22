package cn.xiaohu.anotation.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.xiaohu.anotation.bean.User;
import cn.xiaohu.anotation.service.UserService;

public class SpringTest {
	ApplicationContext cpx = new ClassPathXmlApplicationContext("anotation.xml");
	@Test
	public void test() {
		UserService userService = (UserService) cpx.getBean("userServiceImpl");
		userService.save(new User());
	}

}
