import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Chandrayaan {
    private Chandrayaan spacecraft;

    @BeforeEach
    public void setup() {
        spacecraft = new Chandrayaan3Spacecraft(0, 0, 0, Direction.NORTH);
    }

    @Test
    public void testMoveForward() {
        spacecraft.executeCommands(new String[] { "f" });
        assertEquals("(0, 1, 0) NORTH", spacecraft.getCurrentPosition());
    }

    @Test
    public void testTurnRight() {
        spacecraft.executeCommands(new String[] { "r" });
        assertEquals("(0, 0, 0) EAST", spacecraft.getCurrentPosition());
    }

    // Add more tests for other commands and scenarios...
    public class Chandrayaan3Spacecraft {
        private int x;
        private int y;
        private int z;
        private Direction direction;
    
        public Chandrayaan3Spacecraft(int startX, int startY, int startZ, Direction initialDirection) {
            x = startX;
            y = startY;
            z = startZ;
            direction = initialDirection;
        }
    
        public void executeCommands(String[] commands) {
            for (String command : commands) {
                if (command.equals("f")) {
                    moveForward();
                } else if (command.equals("r")) {
                    turnRight();
                }
                // Implement other command cases...
            }
        }
    
        public String getCurrentPosition() {
            return "(" + x + ", " + y + ", " + z + ") " + direction;
        }
    
        private void moveForward() {
            if (direction == Direction.NORTH) {
                y++;
            } else if (direction == Direction.EAST) {
                x++;
            }
            // Implement other directions...
        }
    
        private void turnRight() {
            if (direction == Direction.NORTH) {
                direction = Direction.EAST;
            } else if (direction == Direction.EAST) {
                direction = Direction.SOUTH;
            }
            // Implement other directions...
        }
    
  
        public class Chandrayaan {
            private int x;
            private int y;
            private int z;
            private Direction direction;
        
            public Chandrayaan(int startX, int startY, int startZ, Direction initialDirection) {
                x = startX;
                y = startY;
                z = startZ;
                direction = initialDirection;
            }
        
            public void executeCommands(String[] commands) {
                for (String command : commands) {
                    if (command.equals("f")) {
                        moveForward();
                    } else if (command.equals("r")) {
                        turnRight();
                    }
                    // Implement other command cases...
                }
            }
        
            public String getCurrentPosition() {
                return "(" + x + ", " + y + ", " + z + ") " + direction;
            }
        
            private void moveForward() {
                if (direction == Direction.NORTH) {
                    y++;
                } else if (direction == Direction.EAST) {
                    x++;
                }
                // Implement other directions...
            }
        
            private void turnRight() {
                if (direction == Direction.NORTH) {
                    direction = Direction.EAST;
                } else if (direction == Direction.EAST) {
                    direction = Direction.SOUTH;
                }
                // Implement other directions...
            }
        
            // Add private methods for other commands...
        
            // Define a Direction enum to represent the spacecraft's direction
            enum Direction {
                NORTH,
                SOUTH,
                EAST,
                WEST,
                UP,
                DOWN
            }
        }