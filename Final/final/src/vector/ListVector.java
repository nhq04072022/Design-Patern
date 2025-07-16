package vector;

import java.util.ArrayList;
import java.util.List;

public class ListVector implements IVector {
    private List<Double> data;

    public ListVector() {
        this.data = new ArrayList<>();
    }

    public ListVector(List<Double> data) {
        this.data = new ArrayList<>(data);
    }

    @Override
    public void append(double value) {
        this.data.add(value);
    }

    @Override
    public void insert(double value, int index) {
        this.data.add(index, value);
    }

    @Override
    public void remove(int index) {
        this.data.remove(index);
    }

    @Override
    public int length() {
        return this.data.size();
    }

    @Override
    public double magnitude() {
        double sum = 0;
        for (double element : this.data) {
            sum += element * element;
        }
        return Math.sqrt(sum);
    }

    public double distanceTo(ListVector another) {
        if (this.length() != another.length()) {
            throw new IllegalArgumentException("Vectors must have the same length.");
        }
        double sum = 0;
        for (int i = 0; i < this.length(); i++) {
            double diff = this.data.get(i) - another.data.get(i);
            sum += diff * diff;
        }
        return Math.sqrt(sum);
    }

    @Override
    public double[] elements() {
        double[] elementsArray = new double[this.data.size()];
        for (int i = 0; i < this.data.size(); i++) {
            elementsArray[i] = this.data.get(i);
        }
        return elementsArray;
    }

    @Override
    public double element(int index) {
        return this.data.get(index);
    }


    public ListVector minus(ListVector another) {
        if (this.length() != another.length()) {
            throw new IllegalArgumentException("Vectors must have the same length.");
        }
        List<Double> result = new ArrayList<>();
        for (int i = 0; i < this.length(); i++) {
            result.add(this.data.get(i) - another.data.get(i));
        }
        return new ListVector(result);
    }

    public ListVector plus(ListVector another) {
        if (this.length() != another.length()) {
            throw new IllegalArgumentException("Vectors must have the same length.");
        }
        List<Double> result = new ArrayList<>();
        for (int i = 0; i < this.length(); i++) {
            result.add(this.data.get(i) + another.data.get(i));
        }
        return new ListVector(result);
    }

    public ListVector scale(double factor) {
        List<Double> result = new ArrayList<>();
        for (int i = 0; i < this.length(); i++) {
            result.add(this.data.get(i) * factor);
        }
        return new ListVector(result);
    }

    public double dot(ListVector another) {
        if (this.length() != another.length()) {
            throw new IllegalArgumentException("Vectors must have the same length.");
        }
        double sum = 0;
        for (int i = 0; i < this.length(); i++) {
            sum += this.data.get(i) * another.data.get(i);
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.length(); i++) {
            sb.append(this.data.get(i));
            if (i < this.length() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

