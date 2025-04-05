package Inheritance_Java;

import seleniumbasics.Orange;

public class ChildClass_new extends Orange 

{
	public static void main(String[] args) 
	{
		
		ChildClass_new c1 = new ChildClass_new();
		
		login();
		logout();
		c1.sensitiveinfo();
		
		
		
		
	}

}

//inheriting the properties of parent class which is in different package.
//child class to orange class in Seleniumbasics package
//As Orange is from different package we need to import Selenium basics package here.
