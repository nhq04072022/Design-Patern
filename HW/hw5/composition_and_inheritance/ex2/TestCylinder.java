package hw5.composition_and_inheritance.ex2;

public class TestCylinder {
        public static void main() {
                Cylinder c1 = new Cylinder();
                System.out.println("Cylinder: height=" + c1.getHeight() + " base area="
                                + c1.getArea() + " volume=" + c1.getVolume());

                Cylinder c2 = new Cylinder(10.0);
                System.out.println("Cylinder:  height=" + c2.getHeight() + " base area="
                                + c2.getArea() + " volume=" + c2.getVolume());

                Cylinder c3 = new Cylinder(2.0, 10.0);
                System.out.println("Cylinder: height=" + c3.getHeight() + " base area="
                                + c3.getArea() + " volume=" + c3.getVolume());
        }
}