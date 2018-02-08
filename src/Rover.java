public class Rover {

    public static final String NORTH = "N";
    public static final String EAST = "E";
    public static final String WEST = "W";
    public static final String SOUTH = "S";
    public static final String ROTATE_RIGHT = "r";
    public static final String ROTATE_LEFT = "l";
    public static final String MOVE_FORWARD = "f";
    private String direction;
    private int y;
    private int x;

    public Rover(int x, int y, String direction) {
        this.direction = direction;
        this.y = y;
        this.x = x;
    }

    public void receive(String commandsSequence) {
        for (int i = 0; i < commandsSequence.length(); ++i) {
            String command = commandsSequence.substring(i, i + 1);

            if (command.equals(ROTATE_LEFT) || command.equals(ROTATE_RIGHT)) {

                // Rotate Rover
                if (direction.equals(NORTH)) {
                    if (command.equals(ROTATE_RIGHT)) {
                        direction = EAST;
                    } else {
                        direction = WEST;
                    }
                } else if (direction.equals(SOUTH)) {
                    if (command.equals(ROTATE_RIGHT)) {
                        direction = WEST;
                    } else {
                        direction = EAST;
                    }
                } else if (direction.equals(WEST)) {
                    if (command.equals(ROTATE_RIGHT)) {
                        direction = NORTH;
                    } else {
                        direction = SOUTH;
                    }
                } else {
                    if (command.equals(ROTATE_RIGHT)) {
                        direction = SOUTH;
                    } else {
                        direction = NORTH;
                    }
                }
            } else {

                // Displace Rover
                int displacement1 = -1;

                if (command.equals(MOVE_FORWARD)) {
                    displacement1 = 1;
                }
                int displacement = displacement1;

                if (direction.equals(NORTH)) {
                    y += displacement;
                } else if (direction.equals(SOUTH)) {
                    y -= displacement;
                } else if (direction.equals(WEST)) {
                    x -= displacement;
                } else {
                    x += displacement;
                }
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Rover other = (Rover) obj;

        if (direction == null) {
            if (other.direction != null)
                return false;
        } else if (!direction.equals(other.direction))
            return false;

        if (x != other.x)
            return false;

        if (y != other.y)
            return false;

        return true;
    }
}
