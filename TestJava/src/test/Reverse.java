package test;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int no=58987, rev=0;
   	while(no!=0) 
   	{
		int rem=no%10;
		rev=rev*10+rem;
		no=no/10;
	}
   	System.out.print("Reverse number:"+rev);
	
  }
}
