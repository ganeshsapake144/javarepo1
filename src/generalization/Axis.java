package generalization;

public class Axis implements RBI
{

	@Override
	public void deposite() 
	{
	 System.out.println("Axis deposite method");
	 
		
	}

	@Override
	public void withDrawal() 
	{
		System.out.println("Axis withDrawal method");
		
	}

	@Override
	public void loan() 
	{
		System.out.println("Axis loan method");
		
	}

	@Override
	public void transfer()
	{
		System.out.println("Axis transfer method");
		
	}
	public void axisMobileBanking()
	{
		System.out.println("Axis mobie Banking own method");
	}

}
