package Observer2;

public class WeatherStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData weatherdata = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherdata);
		
		
		weatherdata.setMeasurements(80, 65, 30.4f);
	}	

}
