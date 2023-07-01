apackage test;

import java.util.Scanner;

public class EX3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		// name=input.next().charAt(0);
		
		System.out.println("Enter Name");
		String name=input.next();
		System.out.println("Enter Age");
		byte age= input.nextByte();
		System.out.println("Enter Height");
		float ht=input.nextFloat();
		//ht=(float) 6.5;
		
		System.out.println("My self "+name);
		System.out.println("Age is :"+age);
		System.out.println("My Height is :"+ht);
		System.out.println("Welcome "+name+" How r u where are you from.");
		System.out.println(name+" Had ur Dinner.");
		System.out.println(name+" can we go out side.");
	}

}
