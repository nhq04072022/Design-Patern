package hw5.inheritance.ex5;

public class TestAnimal {
    public static void main() {
        // Using the subclasses
        Cat cat1 = new Cat("Pu");
        cat1.greets();
        System.out.println(cat1);
        Dog dog1 = new Dog("Po");
        dog1.greets();

        Animal animal1 = new Dog("PIPI");
        Dog dog2 = (Dog) animal1;
        dog2.greets(dog1);

        Mammal[] list = new Mammal[200];
        for (int i = 0; i < 100; i++) {
            list[i] = new Cat("Ti" + i);
            list[i + 100] = new Dog("To" + i);
        }
    }
}
