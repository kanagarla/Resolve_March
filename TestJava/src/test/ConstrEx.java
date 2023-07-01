package test;

import java.util.Scanner;

class Test1
{
	static int a;
	static int b;
	static int c;
	Test1() //Constructor
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter 3 Value:");
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
	}
	 Test1(int x)//Parameterized Constructor
	 {
		 a=x;
	 }
		
	void evenorodd() 
	{
		if(a%2==0)
			System.out.println(a+" Even");
		else
			System.out.println(a+" Odd");
	}	
	void out()
	{
		System.out.println("B Value is:"+b);
		System.out.println("C Value is:"+c);
	}
}
public class ConstrEx {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a=50,b=100,c=500;
		Test1 obj=new Test1();// Calling non-parameterized constructor
	//	Test1 obj=new Test1(45);// Calling parameterized constructor
		
		
		//obj.evenorodd();
		obj.evenorodd();
		
		
		//Test1 obj1=new Test1();
		
	}

}
