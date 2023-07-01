package evening;

public class AddFunc {
	
	public static int add() // Function define
	{
		int a,b,c;
		a=10;
		b=20;
		c=a+b;
		System.out.println("Result:"+c);
		return c;
	}
	public static void evenodd(int no)
	{
		if(no%2==0)
			System.out.print("Even Number");
		else

			System.out.print("Odd Number");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value=add();// Function calling 
		evenodd(value);

	}

}
