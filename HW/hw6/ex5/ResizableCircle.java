package hw6.ex5;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        radius *= percent / 100.0;
    }

    public String toString() {
        return "ResizableCircle[ " + super.toString() + "]";
    }
}