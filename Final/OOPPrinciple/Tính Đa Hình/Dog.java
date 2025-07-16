package hw6.ex6;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);

    }

    @Override
    public void greeting() {
        System.out.println("Woof!");
    }

}