/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceweek123;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author quanthaiha
 */
public class Arr {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] arr = readData("arr.inp");
        
        printArray(arr);
        
        boolean ok = checkIncreasing(arr);
    }
    
    /**
     * Khai báo số phần từ của mảng n, mảng array Khai báo biến kiểu Scanner đọc
     * dữ liệu từ tệp filename Đọc n và mảng Trả về mảng
     */
    public static int[] readData(String textFile) {
        try {
            File file = new File(textFile);
            Scanner fileReader = new Scanner(file);

            // Read the first line
            if (!fileReader.hasNextLine()) {
                fileReader.close();
                return null;
            }
            int length = Integer.parseInt(fileReader.nextLine().trim());

            // Read the second line
            if (!fileReader.hasNextLine()) {
                fileReader.close();
                return null;
            }
            String[] elements = fileReader.nextLine().split(" ");
            if ((elements == null) || (elements.length == 0)) {
                fileReader.close();
                return null;
            }

            fileReader.close();

            int[] numbers = new int[elements.length];
            for (int i = 0; i < elements.length; i++) {
                numbers[i] = Integer.parseInt(elements[i]);
            }
            return numbers;

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage() + " in the specified directory.");
            return null;
        }
    }
    
    /*
    * In mảng, mỗi phần tử cách nhau một dấu cách
    */
    public static void printArray(int[] array) {
        if (array == null) {
            return;
        }
        
        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
    
    /*
    * Kiểm tra dãy tăng, nếu đúng trả về true, nếu không trả về false
    */
    public static boolean checkIncreasing(int[] array) {
        if (null == array) {
            return false;
        }
        
        if (array.length == 1) {
            return true;
        }
        
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                return false;
            }
        }
        
        return true;
    }
}
