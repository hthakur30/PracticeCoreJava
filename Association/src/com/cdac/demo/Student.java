package com.cdac.demo;

public class Student {

	String sName;
	double phoneNumber;
	
	Address address;
	
	public Student(String Name,double phone, Address addrDetails) {
		this.sName = Name;
		this.phoneNumber = phone;
		this.address = addrDetails;		
	}
	
	public void studentDetails()
	{
		System.out.println(sName + " " + phoneNumber + " " + address );
	}
	
	

	@Override
	public String toString() {
		return "Student [sName=" + sName + ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address adr1 = new Address(10, "Shree Shakti", "Baliapur", "Dhanbad", "Jharkhand", "India", "828201");
		
		Student stud1 = new Student ("Hemant Thakur",8782828,adr1);
		stud1.studentDetails();
		
		stud1.toString();
	}

}
