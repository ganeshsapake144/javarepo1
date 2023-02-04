package variableTypes;

public class Pune 
{
    int p= 120;// non static global variable
    static int q=130;//static global variable
    
	
	
	public static void main(String[] args)
	{
		Pune pu=new Pune ();//created object of a class
		pu.demo();//calling non static method from same class
		demo1();//calling static method from same class
		System.out.println("===========================================");
		System.out.println("global value of p is "+pu.p);//calling non static global variable from same class in main method
		System.out.println("global value pf q is "+q);//calling static global variable from same class in main method
		System.out.println("===============================================");
		  int div=120/pu.p;//usage of non static global variable from same class
		  int mul=100*q;//usage of static global variable from same class
		  System.out.println("================================================");
		  System.out.println("div is "+div);
		  System.out.println("multiplication is "+mul);
		  System.out.println("===================================================");
		  //==========================================================
		  //using global variable from another class
		  
		  // to call non static global variable from another class-->> need to create object of that class
		  
		  Mumbai mum=new Mumbai();//created object of another class
		  System.out.println("=====================================================");
		  System.out.println("value of M from mumbai class is "+mum.m);//calling non static variable from another class
		  System.out.println("value of N from mumbai class is "+Mumbai.n);//calling static variable from another class
		  System.out.println("======================================================");
		  int sum=100+Mumbai.n;// used static variable from another class
		  int sub=100-mum.m;// used to non static  variable from another class
		  System.out.println("=======================================================");
		  System.out.println("sum from another class is "+sum);
		  System.out.println("sub from another class is "+sub);
		  System.out.println("=========================================================");
	
	}
	  public void demo()// non static method
	  {
		  int p=190;// local variable
		  //static int x=100;//static variable should be always global variable
		  int mul=p*100;
		  System.out.println("multiplication is "+mul);
		  
	  }
	  public static void demo1()
	  {
		  int m=10;
		  int sum=m+100;
		  System.out.println("sum is "+sum);
	  }

}
