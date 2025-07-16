// Fraction class, using 2 integers as the data members

class Fraction {

    /**
     * ************ Data members *********************
     */
    private int numer;
    private int denom;

    /**
     * ************ Constructors *********************
     */
    // Hàm dựng mặc định để tạo phân số 1/1
    public Fraction() {
        this(1, 1);
    }

    // Tạo phân số với tử số numer và mẫu số denom
    public Fraction(int numer, int denom) {
        // TODO
    }

    /**
     * ************** Accessors **********************
     */
    // Lấy giá trị tử số
    public int getNumer() {
        // TODO
        return 0;
    }

    // Lấy giá trị mẫu số
    public int getDenom() {
        // TODO
        return 0;
    }

    /**
     * ************** Mutators ***********************
     */
    // Gán giá trị cho tử số
    public void setNumer(int numer) {
        // TODO
    }

    // Gán giá trị cho mẫu số
    public void setDenom(int denom) {
        // TODO
    }

    /**
     * *************** Other methods *****************
     */
    // Tính ước số chung lớn nhất của hai số a và b
    // Phương thức private nên không thể được truy cập từ các client
    private static int gcd(int a, int b) {
        // TODO
        return 0;
    }

    // Returns simplified fraction
    // Rút gọn phân số về phân số tối giản
    public Fraction simplify() {
        // TODO
        return null;
    }

    // Cộng hai phân số, trả lại phân số kết quả tối giản
    public Fraction add(Fraction f) {
        // TODO
        return null;
    }

    // Trừ hai phân số, trả lại phân số kết quả tối giản
    public Fraction minus(Fraction f) {
        // TODO
        return null;
    }

    // Nhân hai phân số, trả lại phân số kết quả tối giản
    public Fraction times(Fraction f) {
        // TODO 
        return null;
    }

    /**
     * *************** Overriding methods *****************
     */
    // Overriding phương thức toString để in ra phân số
    @Override
    public String toString() {
        // TODO
        return null;
    }

    // Overriding phương thức equals để so sánh hai phân số
    @Override
    public boolean equals(Object obj) {
        // TODO
        return false;
    }
}
