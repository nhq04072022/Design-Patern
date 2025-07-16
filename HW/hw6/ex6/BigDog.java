package hw6.ex6;

public class BigDog extends Dog {
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greeting() {
        System.out.println("Wooow!");
    }

    @Override
    public void greeting(Dog another) {
        System.out.println("Woooooow!");
    }

    public void greeting(BigDog another) {
        System.out.println("Woooooow!");
    }
}