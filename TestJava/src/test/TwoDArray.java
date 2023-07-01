package test;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int r,c,d;
	    int st[][]=new int[2][2];
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter 4 Numbers:");
	
		for(r=0;r<=1;r++)
		{
			 for(c=0;c<=1;c++)
				 {
					 st[r][c]=input.nextInt();
		         }
		    
		}
			for(r=0;r<=1;r++)
			{
				for(c=0;c<=1;c++)
				{
					System.out.print(" " +st[r][c]);
					   
				 }
								
				System.out.println("");
			}
	
	}
}
