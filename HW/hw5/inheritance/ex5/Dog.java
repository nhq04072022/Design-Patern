package hw5.inheritance.ex5;

public class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Woooooof");
    }

    @Override
    public String toString() {
        return "Dog[" + super.toString() + "]";
    }
}
