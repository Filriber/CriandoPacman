
import br.com.fiap.GameObject;

public class Ghost extends GameObject {
    private Direction direction;

    public Ghost() {
    }

    public Ghost(int x, int y, Direction direction) {
        super(x, y);
        this.direction = direction;
    }

    public void move() {
        if (direction == Direction.UP)
            setY(getY() - 10);
        if (direction == Direction.RIGH)
            setX(getX() + 10);
        if (direction == Direction.DOWN)
            setY(getY() + 10);
        if (direction == Direction.LEFT)
            setX(getX() - 10);
        changeDirection();
    }

    private void changeDirection() {
        if (Math.random() > 0.1)
            return;
        int random = (int) (Math.random() * 4);
        Direction[] ditections = Direction.values();
        direction = ditections[random];
    }

}
