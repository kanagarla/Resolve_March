package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		byte exp;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please Enter Name:");//input is a object. You can give any name
	    name=input.next();
		System.out.println("Please Enter your Work Exp:");//input is a object. You can give any name
	    exp=input.nextByte();
		System.out.println(name +" is a good boy");
		System.out.println(name+" is working in ABC company");
		System.out.print(name+" is having " +exp+ " yrs exp");
	}

}
