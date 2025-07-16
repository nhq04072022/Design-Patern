package vector;

import java.util.Arrays;

public class ArrayVector implements IVector {
    private double[] data;
    private int length;

    public ArrayVector() {
        data = new double[1];
    }

    public ArrayVector(double[] coefficients) {

        data = coefficients;
        length = coefficients.length;
    }

    /*
     * Hàm tăng số phần tử của mảng lên gấp đôi.
     * Do mảng không thay đổi được số phần tử sau khi đã cấp phát, nên để tăng
     * số phần tử của mảng, cần phải cấp phát lại mảng khác có số phần tử gấp đôi,
     * sau đó copy những phần tử của mảng cũ sang mảng mới.
     */
    private void extend() {

        data = Arrays.copyOf(data, data.length * 2);
    }

    /*
     * Hàm thêm một phần tử vào cuối vector.
     * Kiểm tra xem mảng còn chỗ để thêm phần tử mới không, nếu không còn chỗ
     * thì cần phải cấp phát một mảng lớn hơn.
     */
    @Override
    public void append(double value) {

        if (length == data.length) {
            extend();
        }
        data[length++] = value;
    }

    /*
     * Hàm thêm một phần tử vào vector ở vị trí index.
     * Kiểm tra xem mảng còn chỗ để thêm phần tử mới không, nếu không còn chỗ
     * thì cần phải cấp phát một mảng lớn hơn.
     */
    @Override
    public void insert(double value, int index) {

        if (index < 0 || index > length) {
            System.out.println("Can't insert to index " + index);
            return;
        }
        if (length == data.length) {
            extend();
        }
        for (int i = length; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = value;
        length++;
    }

    /*
     * Hàm xóa một phần tử của vector ở vị trí index.
     */
    @Override
    public void remove(int index) {

        if (index < 0 || index > length) {
            System.out.println("Can't remove at index " + index);
            return;
        }
        for (int i = index; i < length - 1; i++) {
            data[i] = data[i + 1];
        }
        length--;
    }

    @Override
    public int length() {

        return length;
    }

    @Override
    public double magnitude() {

        double d = 0;
        for (int i = 0; i < length; i++) {
            d += element(i) * element(i);
        }
        return Math.sqrt(d);
    }

    public double distanceTo(ArrayVector another) {
        if (this.length != another.length) {
            throw new IllegalArgumentException("Vectors must have the same length.");
        }
        double sum = 0;
        for (int i = 0; i < this.length; i++) {
            double diff = this.data[i] - another.data[i];
            sum += diff * diff;
        }
        return Math.sqrt(sum);
    }

    @Override
    public double[] elements() {

        return Arrays.copyOf(this.data, this.length);
    }

    @Override
    public double element(int index) {

        if (index < 0 || index > length) {
            return 0;
        }
        return data[index];
    }

    public ArrayVector minus(ArrayVector another) {
        if (this.length != another.length) {
            throw new IllegalArgumentException("Vectors must have the same length. ");
        }
        double[] result = new double[this.length];
        for (int i = 0; i < this.length; i++) {
            result[i] = this.data[i] - another.data[i];
        }
        return new ArrayVector(result);
    }

    public ArrayVector plus(ArrayVector another) {
        if (this.length != another.length) {
            throw new IllegalArgumentException("Vectors must have the same length.");
        }
        double[] result = new double[this.length];
        for (int i = 0; i < this.length; i++) {
            result[i] = this.data[i] + another.data[i];
        }
        return new ArrayVector(result);
    }

    public ArrayVector scale(double factor) {
        double[] result = new double[this.length];
        for (int i = 0; i < this.length; i++) {
            result[i] = this.data[i] * factor;
        }
        return new ArrayVector(result);
    }

    public double dot(ArrayVector another) {
        if (this.length != another.length) {
            throw new IllegalArgumentException("Vectors must have the same length.");
        }
        double sum = 0;
        for (int i = 0; i < this.length; i++) {
            sum += this.data[i] * another.data[i];
        }
        return sum;
    }

    /*
     * Hàm trả ra format của vector dạng: [a1, a2, ..., an].
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.length; i++) {
            sb.append(this.data[i]);
            if (i < this.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
