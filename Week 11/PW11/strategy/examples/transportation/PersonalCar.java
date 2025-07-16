package strategy.examples.transportation;


public class PersonalCar implements TransportationMode {

    @Override
    public String travel() {
        return "Traveling to Airport in: PersonalCar";
    }

}
