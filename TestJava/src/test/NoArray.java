package test;

import java.util.Scanner;

public class NoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		int i;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter 4 numbers:");
		for(i=1;i<=4;i++)
		{
		num=input.nextInt();
		
		}
		System.out.println("4 Numbers Are:");
		for(i=1;i<=4;i++)
		{
		System.out.println(num);
		}
	}

}
