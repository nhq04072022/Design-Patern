package decorator.pattern;


public class ConcreteDecoratorTwo extends Decorator {

    public ConcreteDecoratorTwo(Component component) {
        super(component);
    }

    @Override
    public void doOperation() {
        super.doOperation();
        doAdditionalOperation();
    }

    public void doAdditionalOperation() {
        System.out.println("Doing additional operation concrete decorator TWO.");
    }

}
