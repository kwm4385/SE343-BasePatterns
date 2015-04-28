package vehicleExample;
public class NullEngine implements Engine 
{
	public NullEngine()
	{
		
	}
	
	public void turnOn()
	{
		System.out.println("This engine doesn't exist. What did you expect was going to happen?");
	}
}
