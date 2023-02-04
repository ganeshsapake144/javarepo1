package inheritance_study;

public class SingleLevelInheritance {

	public static void main(String[] args)
	{
	Mother m= new Mother();
	Son s=new Son();
	
	m.nature();//calling super class method using super class object
	
	Mother.habbit();// calling static method  from mother class
	
	
	s.laptop();//calling subclass method using subclass object
	s.nature();//calling superclass method using subclass object
	
	Son.bike();//calling static method from subclass,using subclass
	Son.habbit();//calling static method from superclass,using subclass
	

	}

}
