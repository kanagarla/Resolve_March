package test;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no;
	    int st[][]=new int[3][3];// to create array
	
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter 5 Number:");
	
		for(no=0;no<=2;no++)
		{
			for(int c=0; c<=2;c++)
			{
			st[no][c]=input.nextInt();			
			}
		}
		
		for(no=0;no<=2;no++)
		{
			for(int c=0; c<=2;c++)
			{
			System.out.println(st[no][c]);
			}
		}
	}

}
