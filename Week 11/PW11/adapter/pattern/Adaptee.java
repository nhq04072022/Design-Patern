package adapter.pattern;

public class Adaptee {

    private String name;

    public Adaptee(String name){
        // TODO
    }

    public void specificRequest() {
        System.out.println("Called specific request on Adaptee " + name);
    }
}
