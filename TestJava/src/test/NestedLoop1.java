package test;

public class NestedLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,c;
		
		
		for(r=1;r<=5;r++)
		{
			for(c=1;c<=r;c++)
			{
				System.out.print(r);
				
			}
			System.out.print("\r");
		}

	}

}
