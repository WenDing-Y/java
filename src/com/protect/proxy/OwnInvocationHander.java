package com.protect.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OwnInvocationHander implements InvocationHandler {
     PersonBean per;
	 public OwnInvocationHander(PersonBean per) {
		// TODO Auto-generated constructor stub
		 this.per=per;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		try {
			if (method.getName().startsWith("get")) {
				System.out.println("调用方法");
				return method.invoke(per, args);
			}else if (method.getName().startsWith("set")) {
				return method.invoke(per, args);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
