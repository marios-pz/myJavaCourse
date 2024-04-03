/**
 * Main
 */
public class Main {
  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();
    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
    weatherData.setMeasurements(80, 65, 30.4f);
    weatherData.setMeasurements(80, 65, 30.4f);
    weatherData.setMeasurements(80, 65, 30.4f);
  }
}
