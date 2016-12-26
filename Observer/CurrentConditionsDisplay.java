package Observer;

public class CurrentConditionsDisplay implements Observer,DisplayElement{
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		// TODO Auto-generated constructor stub
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	@Override
	public void update(float temperature, float humidity, float pressure) {
		// TODO Auto-generated method stub
		System.out.println("Current conditions: " + temperature + "F degrees and" + humidity + "% humidity");
	}
	
}
