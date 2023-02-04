package methodsPractice;

public class puneUniversity {

	public static void main(String[] args) 
	{
		puneUniversity pu=new puneUniversity();
		pu.studentInformation();
		studentsResult();
	}
	
	
	  public void studentInformation()
	  {
		 String name="velocity";
		 String dept="IT";
		 float age=12.1f;
		 String gender="m";
		 int prnNum=1234;
		 System.out.println("=====================");
		 System.out.println("student nameis" +name);
		 System.out.println("student dept is +dept");
		 System.out.println("student age is +age ");
		 System.out.println("student gender is +gender");
		 System.out.println("student PRN num is+prnNum");
		 System.out.println("==========================");
				 
	  }
	  public static void studentsResult() 
	  {
		     
		  int sub1Marks=80;
		  int sub2Marks=99;
		  int sub3Marks=77;
		  
		  float result=((sub1Marks+sub2Marks+sub3Marks)*100f/300);
		  System.out.println("students result is"+result+"%");
		  
	  }
		  
	  
	  
	  

	
	
	
	
}
