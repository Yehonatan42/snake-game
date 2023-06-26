import java.awt.*;

interface GameBoardInterface {
public char[][] getBoard();
public void setCell(Point point, char symbol);
public boolean isOutOfBounds(Point head);
}