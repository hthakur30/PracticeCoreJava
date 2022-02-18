package com.cdac;

public class Main {

	//final int y = 10;
	int y = 100;
	String fName = "Hemant";
	String lName = "Thakur";
	
	static void readMe() {
		System.out.println("Inside static readMe Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main obj1 = new Main();
		Main obj2 = new Main();
		Second ob3 = new Second();
		System.out.println("First "+ obj1);
		System.out.println("Second "+obj2);
		System.out.println("Second class + " +ob3);
		System.out.println("Second class + " +ob3.x);
		System.out.println("Local variable "+obj1.y );
		obj1.y = 20;
		System.out.println("Changed value of y "+obj1.y);
		System.out.println("Second object value "+obj2.y);
		System.out.println("FULL NAME "+obj1.fName+ " " +obj1.lName);
		
		//System.out.println("Calling : "obj1.readMe());		--> wrong way to call method... will give compilation error
		//obj1.readMe();	// --> wrong way to call static method .. no object is needed
		
		readMe();
		
		ob3.sendMe();
		ob3.valueMe(60);
	
 
	}

}
