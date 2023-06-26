import java.awt.*;

public class GameBoard implements GameBoardInterface{
    private static final String ANSI_CLEAR_SCREEN = "\u001b[H\u001b[2J";
    private final int width;
    private final int height;
    private final char[][] board;
    public GameBoard(int height, int width){
        this.width = width;
        this.height = height;
        board = new char[height][width];
        initializeBoard();
    }
    public char[][] getBoard(){
        return board;
    }
    public void setCell(Point point, char symbol){
        board[point.y][point.x] = symbol;
        System.out.print("\u001b[" + (point.y + 1) + ";" + (point.x + 1) + "H" + symbol);
    }
    public boolean isOutOfBounds(Point head){
        return head.x <= 0 || head.x >= width - 1 || head.y <= 0 || head.y >= height - 1;
    }
    private void initializeBoard(){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    board[i][j] = '#';
                } else {
                    board[i][j] = ' ';
                }
            }
        }
    }
}
