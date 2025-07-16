package hw2.sort_and_search;

public class RecursiveBinarySearch {
    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
        int middle = (fromIdx + toIdx) / 2;

        if (toIdx < fromIdx) {
            return false;
        }

        if (key < array[middle]) {
            return binarySearch(array, key, fromIdx, middle - 1);
        } else if (key > array[middle]) {
            return binarySearch(array, key, middle + 1, toIdx);
        } else if (key == array[middle]) {
            return true;
        }

        return false;
    }

    public static boolean binarySearch(int[] array, int key) {
        return binarySearch(array, key, 0, array.length - 1);
    }

    public static void main() {
        int[] array = { 11, 14, 16, 18, 20, 25, 28, 30, 34, 40, 45 };
        int key = 100;

        System.out.println(binarySearch(array, key));
    }
}
