package com.basic.proxy;

public class GumballMachine {
    String location;;
    int count;
    public GumballMachine(String location,int count) {
		// TODO Auto-generated constructor stub
    	this.count=count;
    	this.location=location;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
    
}
