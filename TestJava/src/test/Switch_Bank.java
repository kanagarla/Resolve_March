package test;

import java.util.Scanner;

public class Switch_Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println(" Welcome To ABC bank\n"
				+ "1- Balance Transfer\n"
				+ "2- Cash Withdraw\n"
				+ "3- Mini Statement");
		
	System.out.println("Please choose your option: ");
	byte choice=input.nextByte();
	
	switch(choice)
	{
	case 1: System.out.println("Balance Transfer Success");
	break;
	case 2: System.out.println("Cash Withdrawel Success");
	break;
	case 3: System.out.println("Mini Statment Generated Successfully");
	break;
	default: System.out.println("Sorry wrong option has been selected");
	}
	
		
	}

}
