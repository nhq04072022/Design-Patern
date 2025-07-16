package hw6.ex6;

public class TestMain {
    public static void main() {
        Cat cat1 = new Cat("cat");
        cat1.greeting();
        Dog dog1 = new Dog("Dog");
        dog1.greeting();
        BigDog bigDog1 = new BigDog("BigDog");
        bigDog1.greeting();

        Animal animal1 = new Cat("nau");
        animal1.greeting();
        Animal animal2 = new Dog("den");
        animal2.greeting();
        Animal animal3 = new BigDog("vang");
        animal3.greeting();

        Dog dog2 = (Dog) animal2;
        BigDog bigDog2 = (BigDog) animal3;
        Dog dog3 = (Dog) animal3;

        dog2.greeting(dog3);
        dog3.greeting(dog2);
        dog2.greeting(bigDog2);
        bigDog2.greeting(dog2);
        bigDog2.greeting(bigDog1);

        bigDog1.greeting(bigDog2);
    }
}
