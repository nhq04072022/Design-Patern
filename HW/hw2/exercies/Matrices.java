package hw2.exercies;

public class Matrices {
    // Method signatures
    public static void print(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void print(double[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Co cung kich thuoc(cung co row and col) -> Used in add(), subtract()
    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        return (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length);
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        return (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length);
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        if (!haveSameDimension(matrix1, matrix2)) {
            System.out.println("Matrix add error");
            return null;
        }

        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        if (!haveSameDimension(matrix1, matrix2)) {
            System.out.println("Matrix add error");
            return null;
        }

        double[][] result = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        if (!haveSameDimension(matrix1, matrix2)) {
            System.out.println("Matrix subtract error");
            return null;
        }

        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        if (!haveSameDimension(matrix1, matrix2)) {
            System.out.println("Matrix subtract error");
            return null;
        }

        double[][] result = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // nhân ma trận chỉ có thể thực hiện được khi ma trận thứ nhất có số cột bằng số
    // hàng của ma trận thứ hai.
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            System.out.println("Matrix multiply error");
            return null;
        }

        int[][] result = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            System.out.println("Matrix multiply error");
            return null;
        }
        // row = matrix.length & col = matrix[0].length
        double[][] result = new double[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    public static void main() {
        int x[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int y[][] = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };

        int add[][] = add(x, y);
        int subtract[][] = subtract(x, y);
        int multiply[][] = multiply(x, y);

        print(x);
        print(y);
        System.out.println("Add Matrix Int: ");
        print(add);
        System.out.println("Subtract Matrix Int : ");
        print(subtract);
        System.out.println("Multiply Matrix Int : ");
        print(multiply);
    }

}
