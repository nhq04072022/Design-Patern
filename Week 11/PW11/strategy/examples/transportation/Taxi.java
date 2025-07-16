package strategy.examples.transportation;


public class Taxi implements TransportationMode {

    @Override
    public String travel() {
        return "Traveling to Airport in: Taxi";
    }

}
