package test;

import java.util.Scanner;

public class Vowel_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		char name;
		System.out.println("Enter Character:");
		name=input.next().charAt(0);
		
		if(name=='a'||name=='e'||name=='i'||name=='o'||name=='u')
		{
			System.out.println("Its a Vowel");
		}
		else
		{
			System.out.println("Its a Consonent");
	}
		
	}

}
