
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class Array {
	
	// Khai báo số phần từ của mảng n, mảng array
	// Khai báo biến kiểu Scanner đọc dữ liệu từ tệp filename
	// Đọc n và mảng 
	// Trả về mảng
	public static int[] readFile(String filename) {
		
		int n;
		int array[] = null;
		
		return array;
	}
	
	// In mảng, mỗi phần tử cách nhau một dấu cách
	public static void printArray(int array[]) {
		for (int i = 0; i < array.length; i ++) {
			System.out.print(array[i] + " ");
		}

		System.out.println();
	}
	
	// Kiểm tra dãy tăng, nếu đúng trả về true, nếu không trả về false
	public static boolean checkIncrease(int array[]) {
		
		// TODO
		
		return true;
	}
	
	// Tính tổng: array[0] - array[1] + array[2] - array[3] + ...
	// Trả về tổng vừa tính
	public static int computeSum(int array[]) {
		int sum = 0;
		
		// TODO
		
		return sum;
	}
	
	// Hàm main không cần chỉnh sửa gì thêm
	public static void main(String[] args) {
		String input = "ARRAY.INP";
		String output = "ARRAY.OUT";
		int array[] = readFile(input);
		printArray(array);
		
		// Ghi kết quả ra file
		Formatter format = null;
		try {
			format = new Formatter(new File(output));
			if (checkIncrease(array)) {
				format.format("YES" + "\n");
			} else {
				format.format("NO" + "\n");
			}

			format.format(Integer.toString(computeSum(array)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			format.close();
		}
	}
}