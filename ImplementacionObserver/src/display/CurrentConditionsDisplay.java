package display;

import observer.Observer;
import subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
	
	private float temperature, humidity, pressure;
	
	public CurrentConditionsDisplay(Subject station) {
        station.registerObserver(this);
    }
    
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }
    
    public void display() {
        System.out.println();
        System.out.println("-|---- Current Conditions ----|-");
        System.out.println("\tTemperature: " + String.valueOf(temperature) + " °C");
        System.out.println("\tHumidity: " + String.valueOf(humidity) + " %");
        System.out.println("\tPressure: " + String.valueOf(pressure) + " mb");
    }

}
