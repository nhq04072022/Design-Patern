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
public class Poly {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[][] polys = readData("poly.inp");
        
        int[] sumPolynomial = sumPolys(polys);
        
        int[] multPolynomial = multiplyPolys(polys);
    }
    
    /* 
     * Đọc dữ liệu từ tệp tin có tên là filename	
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
            int firstPower = Integer.parseInt(fileReader.nextLine().trim());
            if (firstPower < 0) {
                fileReader.close();
                return null;
            }

            if (!fileReader.hasNextLine()) {
                fileReader.close();
                return null;
            }
            String[] firstPolyString = fileReader.nextLine().split(" ");
            if ((firstPolyString == null) || (firstPolyString.length == 0)) {
                fileReader.close();
                return null;
            }

            if (!fileReader.hasNextLine()) {
                fileReader.close();
                return null;
            }
            int secondPower = Integer.parseInt(fileReader.nextLine().trim());
            if (secondPower < 0) {
                fileReader.close();
                return null;
            }

            if (!fileReader.hasNextLine()) {
                fileReader.close();
                return null;
            }
            String[] secondPolyString = fileReader.nextLine().split(" ");
            if ((secondPolyString == null) || (secondPolyString.length == 0)) {
                fileReader.close();
                return null;
            }
            
            fileReader.close();

            int[][] polys = new int[2][];
            polys[0] = new int[firstPolyString.length];
            for (int j = 0; j < firstPolyString.length; j++) {
                polys[0][j] = Integer.parseInt(firstPolyString[j]);
            }

            polys[1] = new int[secondPolyString.length];
            for (int j = 0; j < secondPolyString.length; j++) {
                polys[1][j] = Integer.parseInt(secondPolyString[j]);
            }
            
            return polys;
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage() + " in the specified directory.");
            return null;
        }
    }

    /* 
    * Cộng hai đa thức có hệ số đã cho
    * Trả ra hệ số của đa thức tổng
    */
    public static int[] sumPolys(int[][] polys) {
        if (polys == null) {
            return null;
        }
        
        if (polys.length != 2) {
            return null;
        }
        
        if ((polys[0] == null) || (polys[1] == null)) {
            return null;
        }
        
        int maxPower = Math.max(polys[0].length, polys[1].length);
        int minPower = Math.min(polys[0].length, polys[1].length);
        
        int[] sumPoly = new int[maxPower];
        
        for (int i = 0; i < maxPower; i++) {
            if (i < minPower) {
                sumPoly[i] = polys[0][i] + polys[1][i];
            } else {
                if (polys[0].length > polys[1].length) {
                    sumPoly[i] = polys[0][i];
                } else {
                    sumPoly[i] = polys[1][i];
                }
            }
        }
        
        return sumPoly;
    }

    /* 
    * Nhân hai đa thức có hệ số đã cho
    * Trả ra hệ số của đa thức nhân
    */
    public static int[] multiplyPolys(int[][] polys) {
        if (polys == null) {
            return null;
        }
        
        if (polys.length != 2) {
            return null;
        }
        
        if ((polys[0] == null) || (polys[1] == null)) {
            return null;
        }
        
        int firstPolyPower = polys[0].length;
        int secondPolyPower = polys[1].length;
        int multPolyPower = firstPolyPower + secondPolyPower - 1;
        
        int[] multPoly = new int[multPolyPower];
 
        for (int i = 0; i < firstPolyPower; i++) {
            for (int j = 0; j < secondPolyPower; j++) {
                multPoly[i + j] += polys[0][i]*polys[1][j];
            }
        }
        
        return multPoly;
    }
}
