package test;

import java.util.Scanner;

public class MyFunc {
	
	static  int voting(String name,int age )
    {
		
	   System.out.println("Hi "+name+" So ur Age is "+age);
   	   
		if(age>=18)
		{
			System.out.println("Please Vote");
		}
		else
		{
			System.out.println("Sorry you cant vote");
			return 18-age;
		}
		return 0;
		
    }   


	public static void main(String[] args) {
	
		   String name;
			int age;
			Scanner input=new Scanner(System.in);
			System.out.println("Enter your Name:");
			name=input.next();
			System.out.println("Enter your Age:");
			age=input.nextByte();
			int result=voting(name,age);
			if(result!=0)
			{
			System.out.print("Waiting period:"+result+" Yrs");
			}
		
	}

}
