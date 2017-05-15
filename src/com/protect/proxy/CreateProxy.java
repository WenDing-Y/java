package com.protect.proxy;

import java.lang.reflect.Proxy;

public class CreateProxy {
  public  static PersonBean getPersonBean(PersonBean per) {
	return (PersonBean) Proxy.newProxyInstance(
			per.getClass().getClassLoader(), 
			per.getClass().getInterfaces(),
			new OwnInvocationHander(per));
}
  public  static PersonBean getNonPersonBean(PersonBean per) {
		return (PersonBean) Proxy.newProxyInstance(
				per.getClass().getClassLoader(), 
				per.getClass().getInterfaces(),
				new NonOwnser(per));
	}
}
