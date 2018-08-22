package cn.xiaohu.spring;

public class Person {
	private User user;
	private String age;

	public void setUser(User user) {
		this.user = user;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [user=" + user + ", age=" + age + "]";
	}

}
