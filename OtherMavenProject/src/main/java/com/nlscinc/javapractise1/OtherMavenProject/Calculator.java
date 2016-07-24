package com.nlscinc.javapractise1.OtherMavenProject;



public class Calculator {

	
	public int add(int a, int b)
	{
		return a+b;

	}
	
	public int sub(int a, int b)
	{
		return a-b;
	}
	
	public int mul(int a, int b)
	{
		return a*b;
	}
	
	public int div(int a, int b)
	{
		return a/b;
	}
	
	public void ifElse(int a, int b)
	{
		if(a<b)
			System.out.println("A is smaller");
		else if(a>b)
			System.out.println("A is larger");
		else
			System.out.println("A ==B");
		
		
	}

	
	public void infinite()
	{
		while(true);
	}
	

}
