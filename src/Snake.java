import java.awt.*;
import java.util.*;

public class Snake implements SnakeInterface {
    private Deque<Point> snakeQueue = new LinkedList<>();
    private HashSet<Point> snakeMap = new HashSet();
    private Direction direction = Direction.RIGHT;
    private char symbol = 'O';

    public char getSymbol() {
        return symbol;
    }
    private Direction getDirection() {
        return direction;
    }
    public void setDirection(Direction direction) {
        this.direction = direction;
    }
    public Snake (int y, int x){
        Point point = new Point(x, y);
        snakeQueue.add(point);
        snakeMap.add(point);
    }

    public Point removeTail(){
        Point tail = snakeQueue.pollLast();
        snakeMap.remove(tail);
        return tail;
    }

    public boolean isSnakePoint(Point point){
        return snakeMap.contains(point);
    }
    public Point moveSnake(){
        Point head = snakeQueue.peekFirst();
        Point newHead = new Point(head.x, head.y);

        switch (getDirection()) {
            case UP:
                newHead.y--;
                break;
            case DOWN:
                newHead.y++;
                break;
            case LEFT:
                newHead.x--;
                break;
            case RIGHT:
                newHead.x++;
                break;
        }
        snakeQueue.addFirst(newHead);

        if (snakeMap.contains(newHead)){
            return null;
        }
        snakeMap.add(newHead);

        return newHead;
    }
    public Iterator<Point> getSnake(){
        return snakeQueue.iterator();
    }
}
