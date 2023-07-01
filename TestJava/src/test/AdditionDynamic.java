package test;

import java.util.Scanner;

public class AdditionDynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1,no2,q,r;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter No1: ");
		//name="Ram"; //Static Approach
		no1=input.nextInt();
		System.out.println("Enter No2: ");
		no2=input.nextInt();
		q=no1/no2;
		r=no1%no2;
		System.out.println("After Division of 2 Numbers. Quotient is: "+q+" Reminder is: "+r);
		
	}

}
