package test;

public class FunEx_New {
	
	public static void add()
	{
		int a,b;
		a=10;
		b=20;
		System.out.println("Addition of 2 numbers:"+(a+b));
	}
	public static void sub(int a, int b)
	{
		System.out.println("Substraction of 2 numbers:"+(a-b));
	}
	public static int mul()
	{
		int a,b,c;
		a=10;
		b=20;
		c=a*b;
		System.out.println("Multiplication of 2 numbers:"+c);
		return c;
		
	}
	
	public static int div(int a,int b)
	{
		int result= a/b; 
		
		System.out.print("Division is:"+result);
		return result;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=50,b=30;
	add();
	sub(a,b);
	int result=mul();
	if(result%2==0)
		System.out.print("Even");
	else

		System.out.print("Even");
	System.out.print("Division is: " +div( a,b));
	
	

	}

}
