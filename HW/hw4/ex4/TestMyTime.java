package hw4.ex4;

public class TestMyTime {
    public static void main() {
        // test constructors and toString()
        MyTime time1 = new MyTime(1, 2, 3);
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

        System.out.println("Test nextSecond() and previousSecond() ");
        // test nextSecond()
        System.out.println(time1.nextSecond());
        System.out.println(time1.nextSecond().nextSecond());

        // test previousSecond()
        System.out.println(time1.previousSecond());
        System.out.println(time1.previousSecond().previousSecond());

        System.out.println("Test nextMinute() and previousMinute() ");
        // test nextMinute()
        System.out.println(time1.nextMinute());

        // test previousMinute()
        System.out.println(time1.previousMinute());

        System.out.println("Test nextHour() and previousHour() ");
        // test nextHour()
        System.out.println(time1.nextHour());

        // test previousHour()
        System.out.println(time1.previousHour());
    }
}
