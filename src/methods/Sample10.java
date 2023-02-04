package methods;

public class Sample10 {

	public static void main(String[] args) 
	{
		studentInfo("ganesh",200,'A',65.5f);
		studentInfo("mahesh",300,'A',66.5f);
		
		
		
		
		
	}
	  public static void studentInfo(String name,int RollNo,char grade,float per)
	  {
		  System.out.println("=======studentInfo==========");
		  System.out.println("student name:ganesh:"+name); 
		  System.out.println("student RollNo:"+RollNo);
		  System.out.println("student grade:"+grade);
		  System.out.println("student percentage:"+per);
	  }

}
