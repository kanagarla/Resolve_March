package test;

public class Function_Task {
	
	public static int add(int a,int b)
	{
		System.out.println("Addition of 2 Numbers:"+(a+b));
	 return (a+b);	
	}
	public static int add(int a,int b,int c)
	{
		System.out.println("Addition of 3 Numbers:"+(a+b+c));
	 return (a+b);	
	}
	public static void eod(int result)
	{
		if(result%2==0)
			System.out.print("Even");
		else
			System.out.print("Odd");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		a=50;
		b=40;
		int result=add(a,b);
		eod(result);

	}

}
