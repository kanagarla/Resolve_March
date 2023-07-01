package test;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r,c;
	    int st[][]=new int[2][2];// to create array
	
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter 4 Number:");
	
		for(r=0;r<=1;r++)
		{
			for(c=0;c<=1;c++)
			st[r][c]=input.nextInt();			
		}
		
		for(r=0;r<=1;r++)
		{
			for(c=0;c<=1;c++)
			{
			System.out.print(st[r][c]+" ");		
			}
			System.out.println();
		}
	}

}
