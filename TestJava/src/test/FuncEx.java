package test;

import java.util.Scanner;

public class FuncEx {
	public static void vote() // defining function
	{		
		byte age;

		 // System.out.println("Function without parameters and with Return Value");
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Age:");
		age=input.nextByte();
		  if(age>=18)
		  {
			 System.out.println("Congrats u can vote");
			 
		  }
		  else
		  {
				 System.out.println("Sorry u can't vote");  
		  }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//call function
		vote();
		vote();
	}

}
