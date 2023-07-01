package test;

import java.util.Scanner;

public class Switfch_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int no1,no2;
			Scanner input= new Scanner(System.in);
		System.out.println("Calculator");
		System.out.println("Enter 2 numbers for calculation:");
		 no1=input.nextInt();
		 no2=input.nextInt();
		System.out.println("1 - Add 	2-Sub	 3- Mul");
		System.out.println("Please enter your option");
	
		byte option=input.nextByte();
	
		switch(option)
		{

		case 1:		
					System.out.println("Sum of 2 number:"+(no1+no2));
		break;
		
		case 2: 	
					System.out.println("Substraction of 2 number:"+(no1-no2));
		break;
		case 3: 
		
					System.out.println("Multiplication of 2 number:"+(no1*no2));
		break;
		default: System.out.println("You have selected wrong option so please choose right option");
		} // End Of Switch
		
		
		System.out.println("Other Statements or other logic's");
	}

}
