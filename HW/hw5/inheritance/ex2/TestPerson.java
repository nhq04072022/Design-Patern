package hw5.inheritance.ex2;

public class TestPerson {
    public static void main() {
        Person person1 = new Person("Thuy", "BG");
        System.out.println(person1);
        person1.setAddress("HN");
        System.out.println(person1 + "\n");

        Person person2 = new Student("Chi", "HN", "BA", 2021, 1000);
        System.out.println(person2);
        Student std2 = (Student) person2;
        std2.setFee(800);
        System.out.println(person2);
        System.out.println("Program of p2: " + std2.getProgram() + "\n");

        Person person3 = new Staff("ABC", "HN", "KHTN", 1500);
        System.out.println(person3);
        Staff staff = (Staff) person3;
        staff.setSchool("BK");
        System.out.println(person3);
        System.out.println("Pay of p3: " + staff.getPay());

    }
}
