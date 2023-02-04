
package constructorStudy;



public class Animals {

	   String name;
	   float age;
	   char gender;
	   int serialNum;
	   
	   public Animals()// zero parameter constructor
	   {
	      name= "Tiger";
	      age=3.2f;
	      gender='M';
	      serialNum=007;
	   }
	   
	   public Animals(String mypet,float old,char gen,int cageNum)
	   {
		   name=mypet;
		   age=old;
		   gender=gen;
		   serialNum=cageNum;
		   
	   }
			   
	      
	
	
	public static void main(String[] args)
	{
       Animals cat=new Animals();//use of default constructor
       cat.animalInfo();
       
       Animals zebra=new Animals("Zebra",9.5f,'F',21);
       zebra.animalInfo();
       
       Animals lion=new Animals("king lion",11f,'M',12);
       lion.animalInfo();
       

	}
	
	public void animalInfo()
	{
		System.out.println("Animal name is "+name);
		System.out.println("Animal age is " +age);
		System.out.println("Animal gender is " +gender);
		System.out.println("Animal serial number is " +serialNum);
		System.out.println("=======================================");
	}
	
	

}
