import java.awt.*;
import java.util.Random;
public class Food implements FoodInterface {
    private Random random = new Random();
    private int boardHeight;
    private int boardWidth;
    private Point location;
    private char symbol = '@';
    public Point getLocation() {
        return location;
    }
    public char getSymbol() {
        return symbol;
    }
    public Food(int height, int width) {
        this.boardHeight = height;
        this.boardWidth = width;
        location = new Point();
    }
    public Point generateFood(){
        location.setLocation(random.nextInt(boardWidth - 2) + 1, random.nextInt(boardHeight - 2) + 1);
        return location;
    }
}
