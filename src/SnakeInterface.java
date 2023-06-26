import java.awt.*;
import java.util.Iterator;

interface SnakeInterface {
    public char getSymbol();
    public void setDirection(Direction direction);
    public Point removeTail();
    public boolean isSnakePoint(Point point);
    public Point moveSnake();
    public Iterator<Point> getSnake();
}