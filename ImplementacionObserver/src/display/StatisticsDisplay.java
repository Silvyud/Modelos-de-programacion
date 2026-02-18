package display;

import observer.Observer;
import subject.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {
	
	private float maxTemperature = 0, minTemperature = 100, avgTemperature = 0;
    private int total = 0;
    
    public StatisticsDisplay(Subject station) {
        station.registerObserver(this);
    }
    
    public void update(float temperature, float humidity, float pressure) {
        if (temperature > maxTemperature) {maxTemperature = temperature;}
        if (temperature < minTemperature) {minTemperature = temperature;}
        avgTemperature = (avgTemperature * total + temperature) / (total + 1);
        total++;
    }
    
    public void display() {
        System.out.println();
        System.out.println("-|---- Temperature Statistics ----|-");
        System.out.println("\tMaximum: " + String.valueOf(maxTemperature) + " °C");
        System.out.println("\tMinimum: " + String.valueOf(minTemperature) + " °C");
        System.out.println("\tAverage: " + String.valueOf(avgTemperature) + " °C");
    }

}
