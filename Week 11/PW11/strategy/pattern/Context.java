package strategy.pattern;


public class Context {

    private Strategy strategy;

    public Context() {}

    public void setStrategy(Strategy behavior) {
        this.strategy = behavior;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void executeStrategy() {
        System.out.println(strategy.doSomething());
    }
}
