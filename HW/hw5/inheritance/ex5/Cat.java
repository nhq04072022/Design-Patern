package hw5.inheritance.ex5;

public class Cat extends Mammal {
    public Cat(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Meoww");
    }

    @Override
    public String toString() {
        return "Cat[" + super.toString() + "]";
    }
}
