package decorator.pattern;


public class ConcreteComponent implements Component {

    @Override
    public void doOperation() {
        System.out.println("Concrete Component doing operation");
    }

}
