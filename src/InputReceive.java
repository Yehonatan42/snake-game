import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InputReceive {
    private SnakeGameController controller;

    public InputReceive(SnakeGameController controller) {
        this.controller = controller;
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addKeyListener(new SnakeKeyListener());
        frame.setFocusable(true);
        frame.requestFocusInWindow();
        frame.pack();
        frame.setVisible(true);
    }

    private class SnakeKeyListener implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {}

        @Override
        public void keyPressed(KeyEvent e) {
            if (controller != null) {
                controller.changeDirection(processKey(e.getKeyCode()));
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {}

        private Direction processKey(int key) {
            switch (key) {
                case KeyEvent.VK_LEFT:
                    return Direction.LEFT;
                case KeyEvent.VK_DOWN:
                    return Direction.DOWN;
                case KeyEvent.VK_RIGHT:
                    return Direction.RIGHT;
                case KeyEvent.VK_UP:
                    return Direction.UP;
                default:
                    return null;
            }
        }
    }
}