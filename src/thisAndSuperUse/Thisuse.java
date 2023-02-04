package thisAndSuperUse;

public class Thisuse {

	 int a=90;//non-static global variable
	 int b=80;
	 
	 static int c=100;//static global variable
	
	
	public static void main(String[] args) 
	{
	  Thisuse tu=new Thisuse();
	  tu.addition();

	}
	public void addition()
	{
		int a=9;//local value of a
		int b=1;
		
		int sum=a+b;//calling local value of a
		System.out.println("addtion is "+sum);
		int sum1=this.a+b;//calling global value of a
		System.out.println("addition is "+sum1);
		
		
	}
	 public static void sub()
	 {
		 //static int d=100;we should not created any static local variable
	 }

}
