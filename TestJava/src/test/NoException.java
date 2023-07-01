package test;

public class NoException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {10,20,30};
		int a=10,b=50;
		try
		{
		System.out.println("After Calculation Value is: "+(ar[2])/0);
		}
		catch(Exception eob)
		{
			System.out.println(eob.getMessage());
		}
		System.out.println("B Value is: "+b);
		
	}

}

/*
			try
			{
			
			}
			catch ()
			 {
			   message
			 }

*/