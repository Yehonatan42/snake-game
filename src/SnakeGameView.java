public class SnakeGameView {
    private static final String ANSI_CURSOR_HOME = "\u001b[H";
    private static final String ANSI_HIDE_CURSOR = "\u001b[?25l";
    private final char[][] board;

    public SnakeGameView(char[][] board) {
        this.board = board;
    }

    public void draw(){
        System.out.print(ANSI_CURSOR_HOME + ANSI_HIDE_CURSOR);
        for (int row = 0; row < board.length; ++row){
            for (int column = 0; column < board[0].length; ++column){
                System.out.print(board[row][column]);
            }
            System.out.println();
        }
        System.out.flush();
    }
    public void endGame(){
        System.out.println("GAME OVER");
        System.out.print("\u001b[?25h");
    }

}
