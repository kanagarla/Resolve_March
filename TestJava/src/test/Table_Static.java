package test;

import java.util.Scanner;

public class Table_Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tb,en;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Table Number: ");
		tb=input.nextInt();
		System.out.println("Enter Ending Number: ");
		en=input.nextInt();
		for(int no=1; no<=en;no++)
		{
		
		System.out.println(tb+ "* "+no+" = "+(tb*no));
	}
	}

}
