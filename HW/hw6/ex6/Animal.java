package hw6.ex6;

abstract public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract public void greeting();

}
