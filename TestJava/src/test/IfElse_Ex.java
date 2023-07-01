package test;

import java.util.Scanner;

public class IfElse_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner input = new Scanner(System.in);
		byte age;
		System.out.println("Enter your Age:");
		age=input.nextByte();
				
		  if(age>=18)
		  {
			 
			  System.out.print("Congrats you are elligible for voting");
		  }
		  else
		  {
			 // System.out.print("Sorry your are not elligible for voting.");
			 System.out.print("Sorry your are not elligible for voting. Please wait for "
			 +(18-age)+  " years");
			  
		  }
	}

}
