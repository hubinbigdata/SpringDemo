package cn.xiaohu.aop;

import org.springframework.beans.factory.annotation.Autowired;

public class CalculatorImpl implements Calculator{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int mut(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int div(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
    
	
}
