/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceweek123;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 *
 * @author quanthaiha
 */
public class CarTest {
    public static void main(String[] args) {
        String textFile = "CAR.INP";
        Car[] readCars = readData(textFile);
        
        int numberOfCars = 0;
        for (Car car : readCars) {
            if (car == null) {
                break;
            }
            
            numberOfCars++;
        }
        
        Car[] cars = new Car[numberOfCars];
        for (int i = 0; i < numberOfCars; i++) {
            cars[i] = readCars[i];
        }
        
        writeData("CAR.OUP", cars);
    }
    
    private static Car readACar(Scanner scanner) {
        if (scanner == null) {
            return null;
        }
        
        // read Id
        if (!scanner.hasNextLine()) {
            scanner.close();
            return null;
        }
        String carId = scanner.nextLine().trim();
        
        // read Name
        if (!scanner.hasNextLine()) {
            scanner.close();
            return null;
        }
        String carName = scanner.nextLine().trim();
        
        // read Manufacturer
        if (!scanner.hasNextLine()) {
            scanner.close();
            return null;
        }
        String carManufacturer = scanner.nextLine().trim();
        
        // read Quantity
        if (!scanner.hasNextLine()) {
            scanner.close();
            return null;
        }
        int carQuantity = Integer.parseInt(scanner.nextLine().trim());
        
        // read Price
        if (!scanner.hasNextLine()) {
            scanner.close();
            return null;
        }
        double carPrice = Double.parseDouble(scanner.nextLine().trim());
        
        // read Weight
        if (!scanner.hasNextLine()) {
            scanner.close();
            return null;
        }
        double carWeight = Double.parseDouble(scanner.nextLine().trim());
        
        // read manufacture date
        if (!scanner.hasNextLine()) {
            scanner.close();
            return null;
        }
        String carManufactureDate = scanner.nextLine().trim();
        
        Car newCar = new Car(carId, carName, carManufacturer, carQuantity, 
                             carPrice, carWeight, carManufactureDate);
        
        return newCar;
    }
    
    public static Car[] readData(String fileName) {
        try {
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);

            Car[] cars = new Car[30];
            Car aCar = null;
            int index = 0;
            do {
                aCar = readACar(fileReader);
                if (aCar != null) {
                    cars[index] = aCar;
                    index++;
                }
            } while (aCar != null);
            return cars;
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage() + " in the specified directory.");
            return null;
        }
    }
    
    public static void writeData(String fileName, Car[] cars) {
        if (cars == null) {
            return;
        }
        
        if (cars.length == 0) {
            return;
        }
        
        try {
            File outputFile = new File(fileName);
	    FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
	    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream));
            for (Car car : cars) {
                if (car == null) {
                    break;
                }
                
                bufferedWriter.write(car.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static Car[] searchByManufacturer(String manu, Car cars[]) {
        if (cars == null) {
            return null;
        }
        
        if (cars.length == 0) {
            return null;
        }
        
        int numberOfManuCars = 0;
        for (Car car : cars) {
            if (car == null) {
                break;
            }
            
            if (car.manufacturer().equalsIgnoreCase(manu)) {
                numberOfManuCars++;
            }
        }
        
        Car[] manuCars = new Car[numberOfManuCars];
        int index = 0;
        for (Car car : cars) {
            if (car == null) {
                break;
            }
            
            if (car.manufacturer().equalsIgnoreCase(manu)) {
                manuCars[index] = car;
                index++;
            }
        }
        return manuCars;
    }
    
    public static int maxQuantity(Car[] cars) {
        if (cars == null) {
            return 0;
        }
        
        if (cars.length == 0) {
            return 0;
        }
        
        int max = 0;
        for (Car car : cars) {
            if (car == null) {
                break;
            }
            
            if (car.quantity() > max) {
                max = car.quantity();
            }
        }
        
        return max;
    }
    
    public static Car[] maxQuantityCars(Car cars[]) {
        if (cars == null) {
            return null;
        }
        
        if (cars.length == 0) {
            return null;
        }
        
        int maxQuantityValue = maxQuantity(cars);
        
        int numberOfMaxQualityCars = 0;
        for (Car car : cars) {
            if (car == null) {
                break;
            }
            
            if (car.quantity() == maxQuantityValue) {
                numberOfMaxQualityCars++;
            }
        }
        
        Car[] maxQuantityCars = new Car[numberOfMaxQualityCars];
        int index = 0;
        for (Car car : cars) {
            if (car == null) {
                break;
            }
            
            if (car.quantity() == maxQuantityValue) {
                maxQuantityCars[index] = car;
                index++;
            }
        }
        
        return maxQuantityCars;
    }
    
    public static void sortByPrice(Car[] cars) {
        if (cars == null) {
            return;
        }
        
        if (cars.length == 0) {
            return;
        }
        
        for (int i = 0; i < cars.length; i++) {
            for (int j = i; j < cars.length; j++) {
                if (cars[i].price() > cars[j].price()) {
                    Car temp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = temp;
                }
            }
        }
    }
    
    public static Car[] secondWeight(Car[] cars) {
        if (cars == null) {
            return null;
        }
        
        if (cars.length == 0) {
            return null;
        }
        
        double maxWeight = 0.0;
        for (Car car : cars) {
            if (car == null) {
                break;
            }
            
            if (car.weight() > maxWeight) {
                maxWeight = car.weight();
            }
        }
        
        double secondWeight = 0.0;
        for (Car car : cars) {
            if (car == null) {
                break;
            }
            
            if ((secondWeight < maxWeight) && (car.weight() > secondWeight)) {
                secondWeight = car.weight();
            }
        }
        
        int numberOfSecondWeightCars = 0;
        for (Car car : cars) {
            if (car == null) {
                break;
            }
            
            if (car.weight() == secondWeight) {
                numberOfSecondWeightCars++;
            }
        }
        
        if (numberOfSecondWeightCars == 0) {
            return null;
        }
        
        Car[] secondWeightCars = new Car[numberOfSecondWeightCars];
        int index = 0;
        for (Car car : cars) {
            if (car == null) {
                break;
            }
            
            if (car.weight() == secondWeight) {
                secondWeightCars[index] = car;
                index++;
            }
        }
        return secondWeightCars;
    }
}
