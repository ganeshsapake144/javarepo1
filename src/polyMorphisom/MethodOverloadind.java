package polyMorphisom;

public class MethodOverloadind {

	public static void main(String[] args) 
	{
		MethodOverloadind mo=new MethodOverloadind();
		 
		mo.addition();
		mo.addition(10,13);

		
		
	}
      
	   public void addition()
	   {
		   int a=10;
		   int b=20;
		   int sum=a+b;
				   System.out.println("addition is "+sum);
		   
	   }
	    public void addition(int a, int b)
	    {
	    	int sum=a+b;
	    	System.out.println("addition is "+sum);
	    	
	    	
	    }
	     public void addition(int c,float d)
	     {
	    	 float sum=c+d;
	    	 System.out.println("addition is "+sum);
	     }
}
