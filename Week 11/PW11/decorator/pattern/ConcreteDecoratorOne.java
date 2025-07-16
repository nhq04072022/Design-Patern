package decorator.pattern;


public class ConcreteDecoratorOne extends Decorator {

    public ConcreteDecoratorOne(Component component) {
        super(component);
    }

    @Override
    public void doOperation() {
        super.doOperation();
        doAdditionalOperation();
    }

    public void doAdditionalOperation() {
        System.out.println("Doing additional operation concrete decorator ONE.");
    }

}
