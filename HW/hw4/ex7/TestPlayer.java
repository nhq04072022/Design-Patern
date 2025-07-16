package hw4.ex7;

public class TestPlayer {
    public static void main() {
        Player player1 = new Player(1, 0, 0);
        System.out.println(player1);

        Player player2 = new Player(2, 20, 10);
        System.out.println(player2);

        Ball ball = new Ball(0, 0, 0);

        System.out.println(ball + "\nNumber 1 kick the ball");
        while (player1.near(ball)) {
            player1.kick(ball);
            System.out.println(ball);
        }
        System.out.println("Number 2 follow the ball");
        while (!player2.near(ball)) {
            player2.move(ball.getX(), ball.getY());
            player2.jump(ball.getZ());
            System.out.println(player2);
            System.out.println(ball);
        }
        System.out.println("Number 2 kick the ball");
        player2.kick(ball);
        System.out.println(ball);

    }
}
