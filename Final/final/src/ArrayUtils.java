import java.util.*;

public class ArrayUtils {


    public static int[][] inputMatrix(Scanner reader){
		
		/*
		     Sử dụng biến reader ở trên để đọc dữ liệu từ bàn phím (không tạo biến Scanner mới)
		     Hàm thực hiện đọc số nguyên dương n, m từ bàn phím
		     Tạo ma trận mat với kích thước nxm
		     nhập vào n, m là kích thước hàng, cột trong ma trận
		     trả lại ma trận mat
		*/
        int n = reader.nextInt();
        int m = reader.nextInt();
        int[][] mat = new int[n][m];
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                mat[row][col] = reader.nextInt();
            }
        }
        return mat;
    }

    /*
        Hàm trả về giá trị lớn nhất trong ma trận mat.
    */
    public static int findMax(int[][] mat){
        int max = mat[0][0];
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                if (mat[row][col] > max) {
                    max = mat[row][col];
                }
            }
        }
        return max;
    }

    /*
        Hàm trả về một mảng chỉ số các hàng có tổng lớn thứ hai trong ma trận.
        Nếu không tồn tại hàng nào trả về giá trị null.
    */
    public static int[] findRows(int[][] mat) {
        if (mat.length < 2 || findSum(mat) == -1) {
            return null;
        }
        int count = 0;
        for (int row = 0; row < mat.length; row++) {
            int sum = 0;
            for (int col = 0; col < mat[0].length; col++) {
                sum += mat[row][col];
            }
            if (sum == findSum(mat)) {
                count++;
            }
        }
        int[] rowArr = new int[count];
        int i = 0;
        for (int row = 0; row < mat.length; row++) {
            int sum = 0;
            for (int col = 0; col < mat[0].length; col++) {
                sum += mat[row][col];
            }
            if (sum == findSum(mat)) {
                rowArr[i] = row;
                i++;
            }
        }
        return rowArr;
    }

    public static int findSum(int[][] mat) {
        int[] sumArr = new int[mat.length];
        for (int row = 0; row < mat.length; row++) {
            int sum = 0;
            for (int col = 0; col < mat[0].length; col++) {
                sum += mat[row][col];
            }
            sumArr[row] = sum;
        }
        Arrays.sort(sumArr);
        for (int i = mat.length - 2; i >=0 ; i--) {
            if (sumArr[i] != sumArr[mat.length - 1]) {
                return sumArr[i];
            }
        }
        return -1;
    }

    /*
        Hàm in ma trận mat
        Hàm này sinh viên không cần thay đổi
    */
    public static void printMatrix(int[][] mat) {
        if(mat == null) {
            System.out.println("NULL");
            return;
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[][] mat = inputMatrix(reader);
        printMatrix(mat);
        System.out.println(findSum(mat));
        int[] result = findRows(mat);
        for (int x: result
             ) {
            System.out.print(x+" ");
        }

    }

}