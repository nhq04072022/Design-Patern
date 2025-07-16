package hw5.inheritance.ex3;

public class TestPoint2D {
    public static void main() {
        Point2D point2d1 = new Point2D();
        point2d1.setXY(1, 2);
        System.out.println(point2d1);

        Point2D point2d2 = new Point2D(1.2f, 2.3f);
        System.out.println(point2d2);
        point2d2.setX(6.7f);
        point2d2.setY(7.8f);
        System.out.println("Test setX and setY: " + point2d2);

        Point2D point3d1 = new Point3D();
        Point3D pt3d1 = (Point3D) point3d1;
        pt3d1.setXYZ(7, 8, 9);
        System.out.println(pt3d1);

        Point2D point3d2 = new Point3D(5.5f, 9.9f, 8.9f);
        Point3D pt3d2 = (Point3D) point3d2;
        System.out.println(pt3d2);
        pt3d2.setX(6.7f);
        pt3d2.setY(7.8f);
        pt3d2.setZ(8.9f);
        System.out.println("Test setX, setY, setZ: " + pt3d2);
    }
}
