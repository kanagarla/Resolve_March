package test;

import java.util.Scanner;

public class Array0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= new int[5];
		int i,e=0,o=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter 5 numbers:");
		for(i=0;i<=4;i++)
		{			
		num[i]=input.nextInt();
		if(num[i]%2==0)
			e++;
		else
			o++;
		
		}
		System.out.println("Total Even Numbers:"+e );

		System.out.println("Total Odd Numbers:"+o );
		/*for(i=0;i<=4;i++)
		{
		System.out.println(num[i]);
		}*/
	}

}
