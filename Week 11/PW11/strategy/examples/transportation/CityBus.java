package strategy.examples.transportation;


public class CityBus implements  TransportationMode {

    @Override
    public String travel() {
        return "Traveling to Airport in: CityBus";
    }

}
