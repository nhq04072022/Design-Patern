package hw6.ex3;

public class TestMain {
    public static void main() {
        Movable m1 = new MovablePoint(5, 6, 10, 10); // upcast
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        m1.moveDown();
        System.out.println(m1);
        m1.moveRight();
        System.out.println(m1);
        m1.moveUp();
        System.out.println(m1);
    }
}
