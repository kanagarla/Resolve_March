package test;

import java.util.Scanner;

public class Array2_length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= new int[50];
		int i,temp=0;
		for(i=0;i<=49;i++)
		{
			if(i%2==0)
			{
				num[temp]=i;
				temp++;
			}
		
		}
		System.out.println("Total Values stored in Array: "+temp);
		System.out.println("Even Numbers from 0 to 50 Are:");
		for(i=0;i<temp;i++)
		{
		System.out.println(num[i]);
		}
	}

}
