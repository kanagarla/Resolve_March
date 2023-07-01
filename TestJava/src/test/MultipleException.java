package test;

public class MultipleException {
	public static void main(String[] args) {  
        
        try{    
             int a[]=new int[5];    
             a[6]=30/0;
             System.out.println(a[6]);
             
            }    
            
            catch(ArrayIndexOutOfBoundsException e)  
               {  
                System.out.println("ArrayIndexOutOfBounds Exception occurs");  
               }    
        catch(ArithmeticException e)  
        {  
         System.out.println("Arithmetic Exception occurs");  
        }   
            catch(Exception e)  
               {  
                System.out.println("Parent Exception occurs");  
               }             
            System.out.println("Other logic");    
 }  

}
