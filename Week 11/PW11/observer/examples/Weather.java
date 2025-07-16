package observer.examples.weather;

import java.util.ArrayList;
import java.util.List;


/**
 * Weather can be observed by implementing {@link WeatherObserver} interface and registering as
 * listener.
 */
public class Weather {

  private WeatherType currentWeather;
  private final List<WeatherObserver> observers;

  public Weather() {
    observers = new ArrayList<>();
    currentWeather = WeatherType.SUNNY;
  }

  public void addObserver(WeatherObserver observer) {
    // TODO
  }

  public void removeObserver(WeatherObserver observer) {
    // TODO
  }

  /**
   * Makes time pass for weather.
   */
  public void timePasses() {
    WeatherType enumValues = WeatherType.values();
    currentWeather = enumValues[(currentWeather.ordinal() + 1) % enumValues.length];
    System.out.printf("The weather changed to {}.", currentWeather);

    // notify observers
    // TODO
  }

  private void notifyObservers() {

    // notify observers in the list "observers"
    // TODO
  }
}
