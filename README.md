# Snake Game

This is a simple implementation of the classic Snake game in Java. The game allows the player to control a snake and navigate it around the game board to eat food and grow. However, the game ends if the snake hits the boundaries or collides with itself.

## How to Play

1. Start the game by running the `Main` class or by running the included snake.jar file.
2. Use the arrow keys (up, down, left, right) to control the movement of the snake.
3. The objective is to eat the food to increase the snake's length.
4. Avoid colliding with the boundaries or the snake's own body.

## MVC Implementation

The game follows the Model-View-Controller (MVC) architectural pattern, which separates the concerns of data management, user interface, and game logic. Here's an overview of the MVC components in this game:

### Model

- The `SnakeGameModel` class represents the game model and holds the state of the game.
- It manages the snake, food, and game board, and provides methods to update the game state and check if the game is over.
- The `Snake` class represents the snake in the game.
- The `GameBoard` class represents the game board and provides methods to interact with the board's cells.

### View

- The `SnakeGameView` class handles the visual representation of the game.
- It draws the game board on the console, showing the snake, food, and borders.
- It also displays the "GAME OVER" message when the game ends.

### Controller

- The `SnakeGameController` class handles the game logic and controls the flow of the game.
- It receives user input from the `InputReceive` class and updates the game state accordingly.
- The `InputReceive` class listens for arrow key presses and changes the snake's direction based on the input.

The MVC pattern allows for better separation of concerns, making the code more maintainable and extensible. It promotes modularity, as each component focuses on its specific functionality. The model represents the data and state of the game, the view handles the user interface, and the controller manages the game logic and user input.

## Dependencies

- This project does not have any external dependencies. It is written in pure Java and uses only standard libraries.

## Future Enhancements

- Add score tracking and display the current score during the game.
- Implement a high score system to track the best scores achieved by players.
- Add a basic options menu for starting and exiting the game. 
- Add sound effects and background music to enhance the gaming experience.

---

Enjoy playing the Snake game! If you have any questions or suggestions, feel free to reach out.
