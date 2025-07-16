package cspracticeweek7;

import java.time.LocalDate;

public abstract class Employee {
    private String id;
    private String name;
    private LocalDate startWorkingDate;
    private int paymentPerHour;

    public Employee(String id, String name, int paymentPerHour) {
        
    }
    
    public String getId() {
        // TODO
        return null;
    }

    public void setId(String id) {
        // TODO
    }

    public String getName() {
        // TODO
        return null;
    }

    public void setName(String name) {
        // TODO
    }

    public LocalDate getStartWorkingDate() {
        // TODO
        return null;
    }

    public void setStartWorkingDate(LocalDate date) {
        // TODO
    }
    
    public int getPaymentPerHour() {
        // TODO
        return 0;
    }

    public void setPaymentPerHour(int paymentPerHour) {
        // TODO
    }
    
    public abstract int calculateSalary();
}