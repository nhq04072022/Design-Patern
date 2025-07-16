package hw3.classes.ex8;

public class TestMain {
    public static void main() {
        // test constructors and toString()
        Time time1 = new Time(1, 2, 3);
        System.out.println(time1);

        // test setter and getter
        time1.setHour(4);
        time1.setMinute(5);
        time1.setSecond(6);
        System.out.println(time1);
        System.out.println("Hour: " + time1.getHour());
        System.out.println("Minute: " + time1.getMinute());
        System.out.println("Second: " + time1.getSecond());

        // Test setTime()
        time1.setTime(23, 59, 58);
        System.out.println(time1);

        // test nextSecond()
        System.out.println(time1.nextSecond());
        System.out.println(time1.nextSecond().nextSecond());

        // test previousSecond()
        System.out.println(time1.previousSecond());
        System.out.println(time1.previousSecond().previousSecond());
    }
}
