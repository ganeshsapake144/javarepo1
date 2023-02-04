package interfaceStudy;

public interface Mother 
{
  void love();
  void cooking();
  //if you are writting method body-->there are two options
  //1.make it default or 2 make it static
    default void test()
    {
    	System.out.println("This is mothers test methods");
    	
    }
     static void demo()
     {
    	 System.out.println("Mothers static demo methods");
    	 
     }
  
	
	
	
}
