/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceweek123;

/**
 *
 * @author quanthaiha
 */
public class Car {
    private String id;
    private String name;
    private String manufacturer;
    private int quantity;
    private double price;
    private double weight;
    private String manufactureDate;
    
    public Car() {
        init("", "", "", 0, 0.0, 0.0, "");
    }
    
    public Car(String id,
            String name,
            String manufacturer,
            int quantity,
            double price,
            double weight,
            String manufactureDate) {
        init(id, name, manufacturer, quantity, price, weight, manufactureDate);
    }
    
    private void init(String id,
                      String name,
                      String manufacturer,
                      int quantity,
                      double price,
                      double weight,
                      String manufactureDate) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.quantity = quantity;
        this.price = price;
        this.weight = weight;
        this.manufactureDate = manufactureDate;
    }
    
    public String id() {
        return this.id;
    }
    
    public String name() {
        return this.name;
    }
    
    public String manufacturer() {
        return this.manufacturer;
    }
    
    public int quantity() {
        return this.quantity;
    }
    
    public double price() {
        return this.price;
    }
    
    public double weight() {
        return this.weight;
    }
    
    public String manufactureDate() {
        return this.manufactureDate;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    
    @Override
    public String toString() {
        String carInfo = this.id + " " + this.name + " " + this.manufacturer + " " 
                         + this.price + " " + this.weight + " " + this.manufactureDate;
        return carInfo;
    }
    
    public void printCar() {
        System.out.println(this);
    }
}
