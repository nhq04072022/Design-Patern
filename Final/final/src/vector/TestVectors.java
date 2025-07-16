package vector;

import java.util.Arrays;
import java.util.List;

public class TestVectors {
    public static void main(String[] args) {
        ArrayVector arrayVector0 = new ArrayVector();
        arrayVector0.append(2);
        arrayVector0.insert(3, 1);
        arrayVector0.insert(5, 2);
        System.out.println("arrayVector0: " + arrayVector0);

        ArrayVector arrayVector1 = new ArrayVector(new double[]{5, 6, 8, 9});
        System.out.println("arrayVector1: " + arrayVector1);
        arrayVector1.remove(3);
        System.out.println("arrayVector1 after remove element at index 3:" + arrayVector1);
        System.out.println("arrayVector1: " + arrayVector1);
        System.out.println("length of arrayVector0: " + arrayVector0.length());
        System.out.println("length of arrayVector1: " + arrayVector1.length());

        System.out.println("magnitude of arrayVector0: " + arrayVector0.magnitude());
        System.out.println("distance between arrayVector0 and arrayVector1: " + arrayVector0.distanceTo(arrayVector1));
        System.out.println("elements of arrayVector1: " + Arrays.toString(arrayVector1.elements()));
        System.out.println("arrayVector1 minus with arrayVector0: " + arrayVector1.minus(arrayVector0));
        System.out.println("arrayVector1 plus with arrayVector0: " + arrayVector1.plus(arrayVector0));
        System.out.println("arrayVector1 scale with 2: " + arrayVector1.scale(2));
        System.out.println("arrayVector1 dot with arrayVector0: " + arrayVector1.scale(2));

        System.out.println();

        ListVector listVector0 = new ListVector();
        listVector0.append(2);
        listVector0.insert(3, 1);
        listVector0.insert(5, 2);
        System.out.println("listVector0: " + listVector0);

        ListVector listVector1 = new ListVector(List.of(5D, 6D, 8D, 9D));
        System.out.println("listVector1: " + listVector1);

        listVector1.remove(3);
        System.out.println("listVector1 after remove element at index 3:" + listVector1);

        System.out.println("length of listVector0: " + listVector0.length());
        System.out.println("length of listVector1: " + listVector1.length());

        System.out.println("magnitude of listVector0: " + listVector0.magnitude());
        System.out.println("distance between listVector0 and listVector1: " + listVector0.distanceTo(listVector1));
        System.out.println("elements of listVector1: " + Arrays.toString(listVector1.elements()));
        System.out.println("listVector1 minus with listVector0: " + listVector1.minus(listVector0));
        System.out.println("listVector1 plus with listVector0: " + listVector1.plus(listVector0));
        System.out.println("listVector1 scale with 2: " + listVector1.scale(2));
        System.out.println("listVector1 dot with listVector0: " + listVector1.scale(2));

    }
}
