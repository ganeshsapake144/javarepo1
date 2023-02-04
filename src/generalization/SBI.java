package generalization;

public class SBI  implements RBI
{

	@Override
	public void deposite()
	{
	System.out.println("SBI's deposite method ");
		
	}

	@Override
	public void withDrawal()
	{
		System.out.println("SBI's withDrawa method ");
		
	}

	@Override
	public void loan()
	{
		System.out.println("SBI's  loan method ");
		
	}

	@Override
	public void transfer()
	{
		System.out.println("SBI's transfer method ");
		
	}
	  public void yono()
	  {
		  System.out.println("SBI's own yono method");
		  
	  }

}
