package test;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		a=20;
		b=0;
		try
		{
			c=a/b;
			System.out.println("After Division the Value is:"+c);
		}
		catch(ArithmeticException ex)
		{
			//System.out.println(ex.getMessage());
			System.out.println("Non divisible by zero. Please change the value");
		}
	
		System.out.println("A Value is:"+a);
		System.out.print("B Value is:"+b);
	}

}
