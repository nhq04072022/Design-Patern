package facade.pattern;


public class ConcreteActionOne implements Action {
    @Override
    public void doSomething() {
        System.out.println("\tDoing something in action One");
    }
}
