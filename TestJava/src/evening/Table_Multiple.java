package evening;

import java.util.Scanner;

public class Table_Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,st,et,t;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter starting table Number:");
		st=input.nextInt();
		System.out.print("Enter ending table Number:");
		et=input.nextInt();
		
		for(t=st;t<=et;t++)
		{
			for(i=1;i<=10;i++)
			{
				System.out.println(t +" * "+i+" = "+(t*i));
			}
			System.out.println(" ");
		}
		
		
		
		
	}

}
