package variableTypes;

public class TypesOfvariable {

	int c=180;// global variable of a class
	int d=120;//non-static global variable
	static int e=100;//static global variable
	
	
	
	public static void main(String[] args)
	{
		TypesOfvariable to=new TypesOfvariable();
		to.addition();
		to.subtraction();
		System.out.println("Non static global value of d is "+to.d);// calling non static global variable from same class
		System.out.println("static global variable value e is "+e);//calling static global variable from same class
		System.out.println("====================================================================");
		

	}
	
	 public void addition()
	 {
		 int a=10;//local variable a
		 int sum=a+d;
		 System.out.println("Local value of a is from addition method is "+a);
		 System.out.println("value of c is "+c);
		 System.out.println("======================================================");
		 
	 }
	   public void subtraction()
	   {
		   int a=90;//local variable a
		   System.out.println("local value of a  from subtraction method is "+a);
		   System.out.println("value of c is "+c);
		   System.out.println("=====================================================");
	   }

}
