import java.io.IOException;

public class SnakeGameController {
    private InputReceive input = new InputReceive(this);
    private SnakeGameModel model;
    private SnakeGameView view;
    private boolean directionChanged = false;

    public SnakeGameController(int height, int width) throws IOException {
        model = new SnakeGameModel(height, width);
        view = new SnakeGameView(model.getBoard());
    }
    public void startGame() throws IOException {
        while (!model.isGameOver()){
            view.draw();
            model.update();
            directionChanged = false;
            try {
                Thread.sleep(180);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        view.endGame();
        System.exit(0);
    }
    public void changeDirection(Direction direction){
        if (!directionChanged) {
            model.setDirection(direction);
            directionChanged = true;
        }
    }
}

