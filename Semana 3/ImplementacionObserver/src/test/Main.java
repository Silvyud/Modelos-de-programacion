package test;

import java.util.Scanner;

import display.CurrentConditionsDisplay;
import display.ForecastDisplay;
import display.PressureDisplay;
import display.StatisticsDisplay;
import subject.WeatherData;

public class Main {
	
	public static void main(String[] args) {
		
        WeatherData station = new WeatherData();
        Scanner scn = new Scanner(System.in);
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(station);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(station);
        ForecastDisplay forecastDisplay = new ForecastDisplay(station);
        PressureDisplay pressureDisplay = new PressureDisplay(station);
        int option = 7;
        
        System.out.println("-|---- Weather Station (Observer pattern implementation test) ----|-\n");
        
        while (option != 6) {
            System.out.println("\n---- Menu ----\n1. Current Conditions\n2. Statistics\n3. Forecast"
            		+ "\n4. Pressure\n5. Update Weather\n6. Exit");
            System.out.print("Select an option: ");
            option = scn.nextInt();
            
            switch (option) {
                case 1:
                    currentDisplay.display();
                    break;
                case 2:
                    statisticsDisplay.display();
                    break;
                case 3:
                    forecastDisplay.display();
                    break;
                case 4:
                    pressureDisplay.display();
                    break;
                case 5:
                	System.out.println("New weather conditions:");
                    System.out.print("Temperature (°C): ");
                    float temp = scn.nextFloat();
                    System.out.print("Humidity (%): ");
                    float hum = scn.nextFloat();
                    System.out.print("Pressure (mb): ");
                    float press = scn.nextFloat();
                    station.measurementsChanged(temp, hum, press);
                    System.out.println("Weather updated! All observers notified.");
                    break;
                case 6:
                	System.out.println("Good bye! Have a nice day");
                    break;
                default:
                    System.out.println("You've selected an invalid option");
            }
            
        }
        
        
    }

}
