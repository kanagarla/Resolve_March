package test;

class StdMarks // default
{
	static int m1;
	static int m2;
	static int m3;
	static int total;
	static float avg;
	public static void grade()
	{
		m1=50;
		m2=80;
		m3=60;
		total=(m1+m2+m3);
		avg=total/3.0f;
		System.out.println("Total Marks:"+total);
		System.out.println("Average is:"+avg);
	}
}
private class Stdinfo
{
	 String name="Ravi";	
}
public class MultipleClass_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//Creating object
				StdMarks sm=new StdMarks();//sm is a object
				sm.grade();	
				Stdinfo si=new Stdinfo();
				System.out.println("Name is:"+si.name);	
	}
}
