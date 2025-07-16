package hw6.ex8;

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

        Movable m2 = new MovableCircle(2, 1, 2, 2, 20); // upcast
        System.out.println(m2);
        m2.moveLeft();
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
        m2.moveDown();
        System.out.println(m2);
        m2.moveUp();
        System.out.println(m2);

        Movable m3 = new MovableRectangle(0, 0, 50, 50, 10, 10); // upcast
        System.out.println(m3);
        m3.moveLeft();
        System.out.println(m3);

        Movable m4 = new MovableRectangle(20, 20, 80, 80, 5, 5); // upcast
        System.out.println(m4);
        m4.moveRight();
        System.out.println(m4);
    }
}
