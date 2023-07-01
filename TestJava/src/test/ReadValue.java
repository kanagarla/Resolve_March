package test;

import java.util.Scanner;

public class ReadValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		byte age;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter Name: ");
		//name="Ram"; //Static Approach
		name=input.next();
		System.out.println("Enter Age: ");
		age=input.nextByte();
		System.out.println("Your entered details are");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		
	}

}
