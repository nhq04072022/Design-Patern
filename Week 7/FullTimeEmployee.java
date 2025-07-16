/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cspracticeweek7;

/**
 *
 * @author QuanThaiHa
 */
public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String id, String name, int paymentPerHour) {
        super(id, name, paymentPerHour);
    }
    
    @Override
    public int calculateSalary() {
        return getPaymentPerHour() * 8;
    }
}