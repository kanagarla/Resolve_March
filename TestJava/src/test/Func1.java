package test;

import java.util.Scanner;

public class Func1 {
     
	    static public boolean pub_votePR(byte age) // public method
	     {
	    	 if(age>=18)
	    		 return true;
	    	 else
	    		 return false;
	     }
	
	static boolean  defa_voteR() // default
	{
		byte age;

		  System.out.println("Function without parameters and with Return Value");
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Age:");
		age=input.nextByte();
		  if(age>=18)
		  {
			 return true; 
		  }
		  else
		  {
		     return false;
		  }
	}
	static private void priv_vote() // Private Method
	{
		byte age;
		 
		  System.out.println("Function without parameters and Return Value");
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Age:");
		age=input.nextByte();
		  if(age>=18)
		  {
			 
			  System.out.println("Congrats you are elligible for voting");
		  }
		  else
		  {
			  System.out.println("Sorry your are not elligible for voting.");
			  
		  }
	}
	
	static void vote(byte age)
	{
		if(age>=18)
		  {
			 
			  System.out.println("Congrats you are elligible for voting");
		  }
		  else
		  {
			  System.out.println("Sorry your are not elligible for voting.");
			  
		  }
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte age;
	
	   Scanner input=new Scanner(System.in);
		System.out.println("Enter Age:");
		age=input.nextByte();
		boolean result=votePR(age);
		System.out.print(result);
	}

}
