package com.calculation;

public class Calculation {
int a=5,b=10;

	
	public void add() {
		
int c = a+b;
System.out.println(c);
	}
	
	static {
		System.out.println("welcome");
	}
	static {
		System.out.println("welcome.......");
	}
	{
	  	
		 System.out.println("lets go...");
	}
	{
	  	
		 System.out.println("lets........ go...");
	}
	
	public Calculation() {
		System.out.println("welcome to constructor");
	}
	
	
	public static void main(String[] args) {
		
		Calculation c = new Calculation();
		c.add();
	}

}
