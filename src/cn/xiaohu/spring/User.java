package cn.xiaohu.spring;

public class User {
    private String name;

	public void setName(String name) {
		this.name = name;
	}
    
	public void sayHello() {
		System.out.println("hello:"+name);
	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}
	
}
