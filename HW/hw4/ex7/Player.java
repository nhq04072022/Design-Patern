package hw4.ex7;

public class Player {
    private int number;
    private float x;
    private float y;
    private float z;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
        this.z = 0.0f;
    }

    public void move(float xDisp, float yDisp) {
        x = (xDisp + x) / 2;
        y = (yDisp + y) / 2;
    }

    public void jump(float zDisp) {
        z = (zDisp + z) / 2;
    }

    public boolean near(Ball ball) {
        return Math.sqrt((x - ball.getX()) * (x - ball.getX()) + (y - ball.getY()) * (y - ball.getY())
                + (z - ball.getZ()) * (z - ball.getZ())) < 8;
    }

    public void kick(Ball ball) {
        ball.setXYZ(ball.getX() + 5, ball.getY() + 5, ball.getZ() + 5);
    }

    public String toString() {
        return "(number: " + number + ", " + x + ", " + y + ", " + z + ")";
    }
}
