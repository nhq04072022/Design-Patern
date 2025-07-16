package decorator.pattern;


public class Client {

    public static void main(String[] args) {

        Component component = new ConcreteDecoratorOne(new ConcreteComponent());
        component.doOperation();
        System.out.println("Adding concrete component two...");
        component = new ConcreteDecoratorOne(new ConcreteDecoratorTwo(new ConcreteComponent()));
        component.doOperation();
    }

}
