import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        SnakeGameController controller = null;
        try {
            controller = new SnakeGameController(20, 30);
            controller.startGame();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}