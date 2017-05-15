package com.protect.proxy;

public class TestProxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        PersonBean per=new PersonImpl("lei", 20);
       /* PersonBean ownser=CreateProxy.getPersonBean(per);
        ownser.setAge(22);
        System.out.println(ownser.getAge());*/
        PersonBean nonser=CreateProxy.getNonPersonBean(per);
        nonser.setAge(20);
        System.out.println(nonser.getAge());
	}

}
