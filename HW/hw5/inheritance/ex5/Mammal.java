package hw5.inheritance.ex5;

public class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Mamaml[" + super.toString() + "]";
    }
}
