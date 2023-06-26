import java.awt.*;
import java.util.Iterator;

public class SnakeGameModel {
    private Snake snake;
    private Food food;
    private GameBoard gameBoard;
    private boolean gameOver;
    private SnakeGameView view;

    public boolean isGameOver() {
        return gameOver;
    }

    public SnakeGameModel(int height, int width) {
        gameBoard = new GameBoard(height, width);
        snake = new Snake(height / 2, width / 2);
        gameBoard.setCell(new Point(width / 2, height / 2), snake.getSymbol());
        food = new Food(height, width);
        generateFood();
        gameOver = false;
    }

    public char[][] getBoard() {
        return gameBoard.getBoard();
    }

    public char[][] update() {
        Point newHead = snake.moveSnake();

        if (newHead == null || gameBoard.isOutOfBounds(newHead)) {
            gameOver = true;
            return gameBoard.getBoard();
        }

        if (newHead.equals(food.getLocation())) {
            generateFood();
        } else {
            Point tail = snake.removeTail();
            gameBoard.setCell(tail, ' ');
        }

        drawSnake();
        return gameBoard.getBoard();
    }
    private void drawSnake(){
        Iterator<Point> snakeIterator = snake.getSnake();
        char Symbol = snake.getSymbol();
        while (snakeIterator.hasNext()){
            gameBoard.setCell(snakeIterator.next(), Symbol);
        }
    }

    public void setDirection(Direction direction) {
        if (direction == null){
            return;
        }

        snake.setDirection(direction);
    }

    public void generateFood() {
        Point newFood = food.generateFood();
        while (snake.isSnakePoint(newFood)) {
            newFood = food.generateFood();
        }
        gameBoard.setCell(newFood, food.getSymbol());
    }
}
