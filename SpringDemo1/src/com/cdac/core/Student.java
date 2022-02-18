package com.cdac.core;

public class Student {

	String sName;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	@Override
	public String toString() {
		return "Student [sName=" + sName + "]";
	}

	public void displayName()
	{
        System.out.println("Hi "+sName);
    }
}
