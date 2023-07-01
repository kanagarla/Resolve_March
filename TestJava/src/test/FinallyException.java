package test;

import java.io.File;
import java.io.FileInputStream;

public class FinallyException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[2];
	      try {
	         System.out.println("Access element :" + a[2]);
	      } catch (ArrayIndexOutOfBoundsException e) {
	         System.out.println("Exception thrown :" + e);
	      } 
	      finally 
	      {
	         a[0] = 6;
	         System.out.println("First element value: " + a[0]);
	         System.out.println("The finally statement is executed");
	      }
	}

}
