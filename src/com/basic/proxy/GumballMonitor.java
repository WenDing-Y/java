package com.basic.proxy;

public class GumballMonitor {
  GumballMachine machine;
  public GumballMonitor(GumballMachine machine) {
	// TODO Auto-generated constructor stub
	  this.machine=machine;
}
  public void report()
  {
	  System.out.println(machine.getLocation());
	  System.out.println(machine.getCount());
  }
}
