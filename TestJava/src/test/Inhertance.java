package test;

class StdMarks1
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
class Stdinfo1 extends StdMarks1  //inheritance
{
	 String name="Ravi";	
}
public class Inhertance extends StdMarks1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating object
		Inhertance inh=new Inhertance();
		Stdinfo1 si=new Stdinfo1();
		System.out.println("Value is:"+inh.m1);
		si.
		
		
	}
}
