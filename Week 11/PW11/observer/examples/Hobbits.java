package observer.examples.weather;


public class Hobbits implements WeatherObserver {

  @Override
  public void update(WeatherType currentWeather) {
    System.out.printf("The hobbits are facing " + currentWeather.getDescription() + " weather now");
  }
}
