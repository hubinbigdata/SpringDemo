package cn.xiaohu.aop;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

public class CalculatorProxy {

	private CalculatorImpl calculator;

	public CalculatorProxy(CalculatorImpl calculator) {
		this.calculator = calculator;
	}

	public Calculator getProxy() {
		ClassLoader loader = calculator.getClass().getClassLoader();
		Class<?>[] interfaces = calculator.getClass().getInterfaces();
		InvocationHandler h = new InvocationHandler() {

			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String methodName = method.getName();
				System.out.println("方法开始了:"+methodName+"参数"+Arrays.asList(args));
				Object result = method.invoke(proxy, args);
				System.out.println("方法执行结束,结果:"+result);
				return proxy;
			}
		};

		return (Calculator) Proxy.newProxyInstance(loader, interfaces, h);
	}
	
}
