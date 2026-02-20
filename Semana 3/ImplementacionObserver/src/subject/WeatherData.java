package subject;

import java.util.ArrayList;

import observer.Observer;

public class WeatherData implements Subject {
	
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private float temp, humid, press;

	public void registerObserver(Observer ob) {
		this.observers.add(ob);
	}
	
	public void removeObserver(Observer ob) {
		this.observers.remove(ob);
	}
	
	public void notifyObserver() {
		for(int i = 0 ; i <= this.observers.size() ; i++) {
			observers.get(i).update(temp, humid, press);
		}
	}
	
	public float getTemperature() {
		return this.temp;
	}
	
	public float getHumidity() {
		return this.humid;
	}
	
	public float getPresure() {
		return this.press;
	}
	
	public void measurementsChanged(float temperature, float humidity, float pressure) {
		this.temp = temperature;
        this.humid = humidity;
        this.press = pressure;
        notifyObserver();
	}
	
}
