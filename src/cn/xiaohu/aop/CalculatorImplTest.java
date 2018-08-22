package cn.xiaohu.aop;


import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

import org.junit.Test;

public class CalculatorImplTest {

	@Test
	public void test() {
		Calculator Calculator = new CalculatorProxy(new CalculatorImpl()).getProxy();
		System.out.println(Calculator.add(10, 2));
		
	}
}
