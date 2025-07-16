package strategy.examples.transportation;


public class Traveler {

    private String name;
    private TransportationMode transportationMode;

    public Traveler() {}

    public Traveler(String name) {
        // TODO
    }

    public void setTransportationMode(TransportationMode transportationMode) {
        // TODO
    }

    public TransportationMode getTransportationMode() {
        // TODO
    }

    public void travelToAirport() {
        System.out.println(this.toString() + getTransportationMode().travel());
    }


    public String getName() {
        // TODO
    }

    public void setName(String name) {
        // TODO
    }

    @Override
    public String toString() {
        return "I am " + getName() + ". ";
    }
}
