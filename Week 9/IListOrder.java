package edu.hus.sc;

public interface IListOrder {
    public boolean checkCustomerId(String id);
    public String generateCustomerId();
    public boolean checkOrderCustomerId(String id);
    public boolean checkOrderId(String id);
    public String getDate();
    public void addOrder(Store store);
    public void printByCustomerId(Store store, String id);
    public void printByOrderId(Store store, String id);
    public void print();
}
