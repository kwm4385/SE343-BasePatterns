import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) {	
		WeatherService ws = new WeatherServiceStub();
		String city = getCity();	
		System.out.println("The weather is: " + ws.getWeather(city));
	}
	
	private static String getCity() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter city: ");
        try {
			return br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}
}
