package test;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value[]= new int[2];
		value[0]=100;
		value[1]=200;
	try
	{
		int result=value[1]/0;
		System.out.println("Result is:"+result);
	}
	catch(Exception ex)
	{
		System.out.println(ex.getMessage());
		
	}
	
		System.out.println("Given Value are:"+value[0]+","+value[1]);
		
	}

}
