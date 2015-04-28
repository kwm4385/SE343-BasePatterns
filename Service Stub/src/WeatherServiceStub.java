
public class WeatherServiceStub implements WeatherService {

	@Override
	public String getWeather(String city) {
		if(city.equalsIgnoreCase("Rochester")) {
			return "Cloudy";
		}
		else if(city.equalsIgnoreCase("Miami")) {
			return "Sunny";
		}
		else {
			return "Doesn't matter";
		}
	}

}
