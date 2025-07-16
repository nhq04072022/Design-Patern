package decorator.pattern;


public abstract class Decorator implements Component {

    protected Component component;

    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void doOperation() {
        component.doOperation();
    }
}
