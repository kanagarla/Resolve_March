package test;

import java.util.Scanner;

public class NestedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("please provide number for the starting table number :");
		int x=sc.nextInt();
		System.out.println("please provide number for the ending table number :");
		int y=sc.nextInt();
		
		for (int a=x; a<=y; a++)
		{
			for (int no=1; no<=10; no++) 
			{
				System.out.println(a + " * " + no + " = " + a*no);
			}
			
		}
		
		
		
		

	}

}
