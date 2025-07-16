package facade.pattern;


public class Facade {

    private ConcreteActionOne one;
    private ConcreteActionTwo two;

    public Facade() {
        System.out.println("This is the FACADE pattern...");
        // create actions
        // TODO
    }

    public void doSomethingInOne() {
        System.out.println("Calling doSomething in action ONE:");
        // TODO
    }

    public void doSomethingInOTwo() {
        System.out.println("Calling doSomething in action TWO:");
        // TODO
    }

    public void doSomethingInOneAndTwo() {
        System.out.println("Calling doSomething in action ONE and TWO:");
        // TODO
    }
}
