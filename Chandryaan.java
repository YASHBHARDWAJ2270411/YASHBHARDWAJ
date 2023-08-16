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

        public class Chandrayaan {
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
            
        }
    
        private void turnRight() {
            if (direction == Direction.NORTH) {
                direction = Direction.EAST;
            } else if (direction == Direction.EAST) {
                direction = Direction.SOUTH;
            }
            
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
                
            }
        
            private void turnRight() {
                if (direction == Direction.NORTH) {
                    direction = Direction.EAST;
                } else if (direction == Direction.EAST) {
                    direction = Direction.SOUTH;
                }
                
            }
        
            
        
            
            enum Direction {
                NORTH,
                SOUTH,
                EAST,
                WEST,
                UP,
                DOWN
            }
        }
    }
}