package com.protect.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NonOwnser implements InvocationHandler{
	 PersonBean per;
	 public NonOwnser(PersonBean per) {
		// TODO Auto-generated constructor stub
		 this.per=per;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		try {
			if (method.getName().startsWith("get")) {
				System.out.println("���÷���");
				return method.invoke(per, args);
			}else if (method.getName().startsWith("set")) {
				System.out.println("���쳣");
				throw new IllegalAccessException();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}
