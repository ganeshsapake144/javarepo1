package stringStudy;

public class StringMethodUse
{


	public static void main(String[] args )
	{
		//length() method use
		String a="Velocity";
		System.out.println(a.length());
		
		
		
		String a1="pune  ";
		System.out.println(a1.length());
		//directly printing-->we cant reuse
		String a2=" ";
		System.out.println(a2.length());
		//storing in ref variable-->can reuse the value
		int lengthOfA2=a2.length();
		System.out.println(lengthOfA2);
		 System.out.println("================END=====================");
				
		
		// topUppercase() method use
		
		String b="velocity";
		
		System.out.println(b.toUpperCase());
		
		   String b1=b.toUpperCase();
		   System.out.println("Upper case of"+b+" is "+b1);
		   System.out.println("================END=====================");
		
		//toLowercase()method use
		String c="VELOCITY";
	     System.out.println(c.toLowerCase());
	     
	     String c1=c.toLowerCase();
	     
	     System.out.println(c1);
	     System.out.println(c1.toUpperCase());
	     System.out.println(c1.length());
	     System.out.println("================END=====================");
	     
           //equals()method use
	     
	     String d1="pune";
	     String d2="pune";
	     String d3=new String("pune");
	     String d4=new String("pune");
	     String d5="pune";
	     
	     System.out.println(d1=d2);
	     
	     System.out.println(d2=d3);
	     System.out.println(d3=d4);
	     System.out.println("================END=====================");
	     System.out.println(d1.equals(d2));
	     System.out.println(d1.equals(d4));
	     System.out.println(d3.equals(d4));
	     System.out.println(d1==d5);
	     
	     System.out.println(d1.equals(d5));
	     
	     System.out.println("================END=====================");
	     
	     //equalsIgnoreCase()method use
	     
	     String e1="pune";
	     String e2="pune";
	     
	     String e3=new String("pune");
	     
	     String e4=new String("pune");
	     
	     System.out.println(e1.equalsIgnoreCase(e2));
	     System.out.println(e2.equals(e3));
	     System.out.println(e2.equalsIgnoreCase(e3));
	     System.out.println(e3.equals(e4));
	     
	     System.out.println(e3.equalsIgnoreCase(e4));
	     System.out.println("================END=====================");
	     
		//contains()method use
	     
	     String f1="Velocity";
	     
	     System.out.println(f1.contains("ve"));
	     System.out.println(f1.contains("city"));
	     System.out.println(f1.contains("elo"));
	     System.out.println("================END=====================");
	     
	     //isEmpty()method use
	     
	     String i1="Katraj";
	     
	     System.out.println(i1.isEmpty());
	     boolean result=i1.isBlank();
	     System.out.println(result);
	     
	     String i2=" ";
	     System.out.println(i2.isEmpty());
	     System.out.println(i2.isBlank());
	     
	     String i3="";
	     
	     System.out.println(i3.isEmpty());
	     System.out.println(i3.isBlank());
	     System.out.println("================END=====================");
	    		 
	     //charAt()method use
	     
	     String g1="Happy";
	     
	     char myChar =g1.charAt(3);
	     
	     System.out.println("Char At 3 is "+myChar);
	     
	     System.out.println(g1.charAt(1));
	     System.out.println("================END=====================");
	     //endsWith()method use
	     
	     String j2="Mumbai";
	     
	     System.out.println(j2.startsWith("Mum"));
	     
	     System.out.println(j2.startsWith("mbai"));
	     System.out.println(j2.startsWith("M"));
	     System.out.println("================END=====================");
	     //subString()method use
	     
	     String k1="Velocity";
	     
	     String myString=k1.substring(4);
	     
	     System.out.println(myString);
	     
	     System.out.println(k1.substring(7));
	     
	     System.out.println(k1.substring(2,5));
	     
	     String k2="Maharashtra";
	     
	     System.out.println(k2.substring(4,8));
	     System.out.println("================END=====================");
	     //concat()method use
	     
	     String l1="Velocity";
	     String l2="pune";
	     
	     String myString1=l1.concat(l2);
	     System.out.println(myString1);
	     
	     System.out.println(l1.concat("Katraj").concat(l2));
	     
	     System.out.println(12+12+" HI ");
	     System.out.println(" Hi "+12+13);
	     
	     System.out.println(12+" Hi "+12);
	     System.out.println("================END=====================");
	     //indexOf() method use
	     
	     String m="Bharat";//Bharat//
	     
	     System.out.println(m.indexOf('a'));
	     
	     System.out.println(m.lastIndexOf('a'));
	     
	     String m1="Mahabharat";
	     
	     System.out.println(m1.indexOf('a',2));
	     System.out.println("================END=====================");
	     //replace()method use
	     
	     String n="eye";
	     
	    System.out.println(n.replace('e',' '));
	    
	    String n1="Mahabharat";
	    System.out.println(n1.replace("ha","xy"));
	     
	    System.out.println("================END=====================");
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	    
	}	
		
		

	

	
	

}
