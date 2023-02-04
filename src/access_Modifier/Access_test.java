package access_Modifier;

public class Access_test {//created class in same package
	

	public static void main(String[] args) 
	{
		 Private_use p=new Private_use();// creating object of other class
		 
		 p.sub();// calling public methode of other class within same package--allowed in project
		 p.add();//calling private methode of other class within same package--not allowed in other class
		 p.mul();//calling default method of other class within same package --allowed within package
		 Private_use.display();//calling protected methode of other class within same package--allowed in samepackage/need inheritance to call in another package
		 System.out.println("value of a is "+p.a);
		// System.out.println("value of a is "+p.sub();
		 System.out.println("value of c is "+p.c);
		 System.out.println("value of d is "+p.d);
		 
		 

	}

}
