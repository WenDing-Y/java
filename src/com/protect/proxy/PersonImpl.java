package com.protect.proxy;

public class PersonImpl implements PersonBean{
    String name;
    int age;
    public PersonImpl(String name,int age) {
		// TODO Auto-generated constructor stub
    	this.name=name;
    	this.age=age;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		System.out.println("调用真正使用的方法");
		return age;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}

	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		this.age=age;
	}
  
   
}
