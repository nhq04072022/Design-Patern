package hw3.classes.ex4;

public class TestMain {
    public static void main() {
        // test constructors and toString()
        Employee employee1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(employee1);

        // test setter and getter
        employee1.setSalary(999);
        System.out.println(employee1);
        System.out.println("id is: " + employee1.getId());
        System.out.println("firstname is: " + employee1.getFirstName());
        System.out.println("lastname is: " + employee1.getLastName());
        System.out.println("salary is: " + employee1.getSalary());

        System.out.println("name is: " + employee1.getName());
        System.out.println("annual salary is: " + employee1.getAnnualSalary());

        // test raiseSalary
        System.out.println(employee1.raiseSalary(10));
        System.out.println(employee1);
    }
}
