package test;

import java.util.Scanner;

public class Loops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tno,no;
		Scanner input =new Scanner(System.in);
		System.out.print("Enter Table Number: ");
			tno=input.nextInt();
		for(no=1;no<=10;no++)
		{
			System.out.println(tno+" * "+no+" = "+(no*tno));
		}
		
	}

}
