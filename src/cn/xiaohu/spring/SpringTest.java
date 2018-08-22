package cn.xiaohu.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	ApplicationContext cpx = new ClassPathXmlApplicationContext("applicationContext.xml");

	@Test
	public void test1() {

		User bean = (User) cpx.getBean("User");
		bean.sayHello();
	}

	@Test
	public void test2() {
		Person bean = cpx.getBean("Person", Person.class);
		System.out.println(bean);
	}
}
