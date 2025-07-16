/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author QuanThaiHa
 */
import java.util.*;

public class Polynomial {

    private static final int MAXSIZE = 1;
    private int degree = 0;
    private int[] arr = new int[MAXSIZE];

    // Tạo đa thức có bậc degree, có các hệ số mặc định là 1
    public Polynomial(int degree) {
        // TODO
    }

    // Tạo đa thức có các hệ số theo mảng arr
    public Polynomial(int[] arr) {
        // TODO
    }

    @Override
    public String toString() {
        // TODO
        return null;
    }

    // In ra đa thức
    public void print() {
        // TODO
    }

    // Kiểm tra xem đa thức có suy biến không
    public boolean isEmpty() {
        // TODO
        return false;
    }

    // Lấy bậc của đa thức
    public int degree() {
        // TODO
        return 0;
    }

    // Lấy các hệ số đa thức lưu trong array 
    public int[] toArray() {
        // TODO
        return null;
    }

    // Lấy ra hệ số đa thức ở vị trí term
    public int getCoefficient(int term) throws IndexOutOfBoundsException {
        // TODO
        return 0;
    }

    // Đặt hệ số đa thức ở phần tử thứ term giá trị value
    public void setCoefficient(int term, int value) throws IndexOutOfBoundsException {
        // TODO
    }

    // Đặt các hệ số đa thức theo array
    public void setCoefficients(int[] coefs) throws IndexOutOfBoundsException {
        // TODO
    }

    // Thêm vào đa thức phần tử ở vị trí thứ term với hệ số là coef
    public void addTerm(int term, int coef) throws IndexOutOfBoundsException {
        // TODO
    }

    // Bỏ đi phần tử thứ term của đa thức
    public void removeTerm(int term) throws IndexOutOfBoundsException {
        // TODO
    }

    // Cộng hai đa thức
    public Polynomial add(Polynomial other) {
        // TODO
        return null;
    }

    // Trừ hai đa thức
    public Polynomial subtract(Polynomial other) {
        // TODO
        return null;
    }

    // Nhân hai đa thức
    public Polynomial multiply(Polynomial other) throws IndexOutOfBoundsException {
        // TODO
        return null;
    }

    // Tính giá trị đa thức khi x = value
    public double evaluate(double value) {
        // TODO
        return 0.0;
    }
}
