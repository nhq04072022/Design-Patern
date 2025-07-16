import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Matrix {

	/* Đọc dữ liệu từ tệp tin có tên là filename và trả về mảng hai chiều
		Khai báo biến kiểu Scanner
		Khai báo kích thước của mảng matrix là n, đọc n từ tệp tin
		Khai báo mảng hai chiều matrix, đọc dữ liệu từ tệp tin
		Trả về mảng hai chiều matrix
	*/
	public static int[][] readFile(String filename) {
		Scanner s;
		int matrix[][] = null;
		int n = 0;

		// TODO

		return matrix;
	}

	// Hàm in ma trận theo đúng định dạng, sinh viên không cần sửa gì thêm
	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}

			System.out.println();
		}
	}

	// Tìm và trả về phần tử lớn nhất của hàng thứ row
	public static int findMaxRow(int matrix[][], int row) {
		int max = null;
		
        // TODO

		return max;
	}
	
	
	// Tính và trả về tổng của cột thứ col
	public static int computeSumofCol(int matrix[][], int col) {
			int sum = 0;
			
			// TODO

			return sum;
	}

	// Kiểm tra trong ma trận có hàng nào có toàn số 0 hay không, nếu có trả về true, không trả về false
	public static boolean checkZero(int matrix[][]) {
		
		// TODO

		return true;
	}

	// Sinh viên không cần chỉnh sửa hàm main
	public static void main(String[] args) {
		String input = "MATRIX.INP";
		String output = "MATRIX.OUT";
		int matrix[][] = readFile(input);
		printMatrix(matrix);

		// Ghi kết quả ra file
		Formatter format = null;
		try {
			format = new Formatter(new File(output));
			format.format(findMaxRow(matrix, 1) + "\n");
			format.format(computeSumofCol(matrix, 1) + "\n");
			if (checkZero(matrix)) {
				format.format("YES" + "\n");
			} else {
				format.format("NO" + "\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			format.close();
		}
	}
}
