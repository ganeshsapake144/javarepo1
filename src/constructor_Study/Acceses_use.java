package constructor_Study;

import access_Modifier.Private_use;

public class Acceses_use extends  Private_use {//created class in another package
	

	public static void main(String[] args) 
	{
		 Private_use ps=new Private_use();// created object of super class
		 ps.sub();//calling public methode of another class in other package-- allowed in project
		 ps.add();//calling private methode of other class in other package --not allowed in other class
		 //ps.mul();// calling default methode of other class in other package--allowed within package
		 Private_use.display();//calling protected methode of other class within same package --allowed in same package/need inheritance to call in another package
		// System.out.println("value of a is "+ps.a);
		// System.out.println("value of b is "+ps.sub();
		 System.out.println("value of c is "+ps.c);
		 System.out.println("value of d is "+Private_use.d);

	}

}
