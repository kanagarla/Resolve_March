package test;

public class NestedIf {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marks=50;

		if(marks>=35)
		{
			System.out.println("Pass");
			
			if(marks>=80)
			{
				System.out.print("A Grade");
			}
			else if (marks>=50)
			{
				System.out.print("B Grade");
			}
			else
			{
				System.out.print("C Grade");
				
			}
					
					
		}
		else 
		{
			System.out.println("Fail");
		}
	}


}
