package observer.examples.weather;


public class Orcs implements WeatherObserver {

  @Override
  public void update(WeatherType currentWeather) {
    System.out.printf("The orcs are facing " + currentWeather.getDescription() + " weather now");
  }
}
