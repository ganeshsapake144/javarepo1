package controlStatements;

public class NestedIfElse {

	public static void main(String[] args) 
	{

		// i want to login email
		//please enter UN, if UN is correct then ender password
		// if password is correct  then login success
		//else-->incorrect password --> please check your password
		//else incorrect UN please check UN
		
		
		
		  String UN="velocity";
		  String PWD="velocity@123";
		    
		  if(UN=="velocity1");
		  {
			  System.out.println("UN is correct,please enter password");
			  
			  if (PWD=="velocity@13");
			  {
				  System.out.println("correct password!!!....login success");
			  }
			//  else
			  {
				  System.out.println("incorrect password,please check again");
				  
			  }
		  }
		  //else
		  {
			  System.out.println("incorrect UN,pleace check UN");
		  }
		
		
	}

}
