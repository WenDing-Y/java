package com.Remote.proxy;

import java.rmi.Naming;

public class MyRemoteClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new MyRemoteClient().go();
	}

	private void go() {
		// TODO Auto-generated method stub
		try {
			MyRemote service=(MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
			System.out.println(service.sayHello());
					
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
