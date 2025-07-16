/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cspracticeweek1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author QuanThaiHa
 */
public class Matrix {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input = "matrix.inp";
        String output = "matrix.out";
        int matrix[][] = readData(input);
        
        printMatrix(matrix);

        // Ghi kết quả ra file
        Formatter format = null;
        try {
            format = new Formatter(new File(output));
            format.format(findMaxRow(matrix, 1) + "\n");
            format.format(computeSumOfCol(matrix, 1) + "\n");
            if (checkZero(matrix)) {
                format.format("YES" + "\n");
            } else {
                format.format("NO" + "\n");
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage() + " in the specified directory.");
        } finally {
            if (format != null) {
                format.close();
            }
        }
    }
    
    /* Đọc dữ liệu từ tệp tin có tên là filename và trả về mảng hai chiều
    * Khai báo biến kiểu Scanner
    * Khai báo kích thước của mảng matrix là n, đọc n từ tệp tin
    * Khai báo mảng hai chiều matrix, đọc dữ liệu từ tệp tin
    * Trả về mảng hai chiều matrix
    */
    public static int[][] readData(String textFile) {
        try {
            File file = new File(textFile);
            Scanner fileReader = new Scanner(file);

            // Read the first line
            if (!fileReader.hasNextLine()) {
                fileReader.close();
                return null;
            }
            int size = Integer.parseInt(fileReader.nextLine().trim());

            if (size <= 0) {
                fileReader.close();
                return null;
            }
            
            int[][] matrix = new int[size][];

            for (int i = 0; i < size; i++) {
                if (!fileReader.hasNextLine()) {
                    fileReader.close();
                    return null;
                }
                String[] elements = fileReader.nextLine().split(" ");
                if ((elements == null) || (elements.length == 0)) {
                    fileReader.close();
                    return null;
                }

                matrix[i] = new int[elements.length];
                for (int j = 0; j < elements.length; j++) {
                    matrix[i][j] = Integer.parseInt(elements[j]);
                }
            }
            
            fileReader.close();
            return matrix;
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage() + " in the specified directory.");
            return null;
        }
    }
    
    /*
    *Hàm in ma trận theo đúng định dạng, sinh viên không cần sửa gì thêm
    */
    public static void printMatrix(int[][] matrix) {
        if (matrix == null) {
            return;
        }
        
        for (int[] row : matrix) {
            if (row == null) {
                return;
            }
            
            for (int j : row) {
                System.out.print(j + " ");
            }
            
            System.out.println();
        }
    }
    
    /*
    * Tìm và trả về phần tử lớn nhất của hàng thứ row
    */
    public static int findMaxRow(int matrix[][], int row) {
        if (matrix == null) {
            return Integer.MIN_VALUE;
        }
        
        if ((row < 0) || (row >= matrix.length)) {
            return Integer.MIN_VALUE;
        }
        
        if (matrix[row] == null) {
            return Integer.MIN_VALUE;
        }
        
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix[row].length; i++) {
            if (matrix[row][i] > max) {
                max = matrix[row][i];
            }
        }
        
        return max;
    }
    
    /*
    * Tính và trả về tổng của cột thứ col
     */
    public static int computeSumOfCol(int[][] matrix, int col) {
        if (matrix == null) {
            return Integer.MIN_VALUE;
        }
        
        if ((col < 0) || (col >= matrix.length)) {
            return Integer.MIN_VALUE;
        }
        
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][col];
        }
        
        return sum;
    }

    /*
    * Kiểm tra trong ma trận có hàng nào có toàn số 0 hay không, nếu có trả về true, không trả về false
    */
    public static boolean checkZero(int[][] matrix) {
        if (matrix == null) {
            return false;
        }
        
        for (int i = 0; i < matrix.length; i++) {
            if (checkZero(matrix, i)) {
                return true;
            }
        }
        
        return false;
    }
    
    private static boolean checkZero(int[][] matrix, int row) {
        if (matrix == null) {
            return false;
        }
        
        if ((row < 0) || (row > matrix.length)) {
            return false;
        }
        
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[row][i] != 0) {
                return false;
            }
        }
        return true;
    }
}
