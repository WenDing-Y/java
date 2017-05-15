package com.basic.proxy;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          GumballMachine gumballMachine=new GumballMachine("beijing", 100);
          GumballMonitor gumballMonitor=new GumballMonitor(gumballMachine);
          System.out.println(gumballMachine.getCount());
          System.out.println(gumballMachine.getLocation());
        		  
	} 

}
