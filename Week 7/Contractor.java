package cspracticeweek7;

public class Contractor extends Employee {
    private int workingHours;
    
    public Contractor(String id, 
            String name, 
            int paymentPerHour, 
            int workingHours) {
        super(id, name, paymentPerHour);
        this.workingHours = workingHours;
    }
    
    @Override
    public int calculateSalary() {
        return getPaymentPerHour() * workingHours;
    }
}
