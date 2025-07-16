import java.io.File;

public class Poly {

	/* 
	* Đọc dữ liệu từ tệp tin có tên là filename	
	*/
	public static int[][] readData(String filename) {
	
		// TODO
	
		return;
	}

	/* 
	* Ghi dữ liệu vào tệp tin có tên là filename	
	*/
	public static void writeData(String filename) {

        // TODO

	}

    /* 
	* Cộng hai đa thức có hệ số đã cho
	* Trả ra hệ số của đa thức tổng
	*/
	public static int[] sumPolys(int[][] polyCoefs) {

		// TODO

	}

    /* 
	* Nhân hai đa thức có hệ số đã cho
	* Trả ra hệ số của đa thức nhân
	*/
	public static int[] multiplePolys(int[][] polyCoefs) {

		// TODO

	}

	public static void main(String[] args) {

		String input = "ARRAY.INP";
		String output = "ARRAY.OUT";

        int[][] polyCoefs = readData(input);

        int[] sumPoly = sumPolys(polyCoefs);
        int[] multiplePoly = multiplePolys(polyCoefs);

		// TODO
	}
}
