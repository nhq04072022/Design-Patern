package hw6.ex6;

public class TestMain {
    public static void main(String[] args) {

        Cat cat1 = new Cat("cat");
        cat1.greeting();
        Dog dog1 = new Dog("Dog");
        dog1.greeting();

        Animal animal1 = new Cat("nau");
        animal1.greeting();
        Animal animal2 = new Dog("den");
        animal2.greeting();

    }
}
