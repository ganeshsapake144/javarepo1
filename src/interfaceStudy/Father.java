package interfaceStudy;

public interface Father 
{
    void money();
    void nature();
    // if you are writting method body-->there are two options 
    //1.make it default or 2 make it static
     default void test()
     {
    	 System.out.println("This is fathers test method");
    	 
     }
     static void demo()
     {
    	 System.out.println("fathers static Demo method");
    	 
     }
	
	
	
	
}
