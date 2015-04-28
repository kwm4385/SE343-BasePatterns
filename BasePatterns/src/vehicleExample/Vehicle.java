package vehicleExample;

public class Vehicle 
{
	private Engine engine;
	
	public Vehicle()
	{
		this("");
	}
	
	public Vehicle(String type)
	{
		//Seperated intance pattern where vehicle knows only the definition
		//of the interface and is completely unaware of the implementation
		if(type.equals("jet"))
		{
			engine = new JetEngine();
		}
		else if(type.equals("car"))
		{
			engine = new NormalEngine();
		}
		else
		{
			//Special Case pattern still returns an engine object for the vehicle that adheres to the
			//engine interface
			engine = new NullEngine();
		}
	}
	
	public void start()
	{
		engine.turnOn();
	}
	
	public static void main(String[] args)
	{
		System.out.println("Starting a normal vehicle...");
		Vehicle car = new Vehicle("car");
		car.start();
		
		System.out.println("\nStarting a jet...");
		Vehicle jet = new Vehicle("jet");
		jet.start();
		
		System.out.println("\nStarting a non-existant vehicle...");
		Vehicle nullVehicle = new Vehicle("sdklsdfsdfhklshko");
		nullVehicle.start();
	}
}
