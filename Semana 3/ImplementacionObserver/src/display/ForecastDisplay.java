package display;

import observer.Observer;
import subject.Subject;

public class ForecastDisplay implements Observer, DisplayElement {
	
	private float lastPressure, currentPressure;
	
	public ForecastDisplay(Subject station) {
		station.registerObserver(this);
	}
	
	public void update(float temperature, float humidity, float pressure) {
		lastPressure = currentPressure;
		currentPressure = pressure;
	}
	public void display() {
		System.out.println();
		System.out.println("-|---- Weather Forecast ----|-");
		if (currentPressure > lastPressure) {
			System.out.println("\tPrediction: We are having a better weather");
		} else if (currentPressure < lastPressure) {
			System.out.println("\tPrediction: Take a look at gray clouds: may be we are having a "
					+ "rainy weather");
		} else {
			System.out.println("\tPrediction: Same weather, not much more");
			}
	}
	
}
