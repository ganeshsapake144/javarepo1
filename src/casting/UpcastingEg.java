package casting;

public class UpcastingEg {

	public static void main(String[] args)
	{
		Father f=new Father();
		f.bike();
		f.car();
		System.out.println("==========================");
		
		Son s=new Son();
		s.bike();
		s.car();
		s.degree();
		System.out.println("============================");
		
		Father sf=new Son();
		
		sf.bike();
		sf.car();
        
	}

}
