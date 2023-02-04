package inheritance_study;

public class MultiLevelInheritance {

	public static void main(String[] args)
	{
	  GrandFather g= new GrandFather();
	  g.experience();
	  GrandFather.stories();
	  System.out.println("=====================");
	  
	  Father f=new Father();
	  f.home();// calling owm property  
	  f.experience();//calling super class property
	   
	  
	  Father.farm();//calling own static method
	  Father.stories();//calling super class static method
	  System.out.println("===================================");
	  
	  
	  Child c=new Child();//created object of sub class
	  
	  c.mobile();// calling own propery
	  
	  
	  c.home();//calling super class property
	  c.experience();//calling super super class property
	  
	  
	  Child.laptop();// calling own property
	  Child.farm();//calling super class property
	  Child.stories();//calling super super class property
	  System.out.println("====================================");
	  
	                  
	        
	  

	}

}
