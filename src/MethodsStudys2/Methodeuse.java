package MethodsStudys2;

public class Methodeuse {

	public static void main(String[] args) 
	{

		 // how to call static regular method from same class 
		//just call with methodName(); in main methode
		addition();//calling static regular methode from same class
		   subtraction();
		   
		
		
	}	
		
         public static void addition() //static regular complete methode
         {   
         int a=10;
         int b=20;
         
         int sum=a+b;
         System.out.println("Addition is "+sum);
         }     
         public static void subtraction()
         {
        	 
        	 System.out.println(" HI HOW ARE YOU");
        	 
         }
}