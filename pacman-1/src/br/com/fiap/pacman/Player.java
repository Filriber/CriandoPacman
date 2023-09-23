package br.com.fiap.pacman;

import br.com.fiap.GameObject;

public class Player extends GameObject {

    private Direction direction;
    private int life;
    private Boolean invicible;

    public Player() {
    }

    public Player(int x, int y, Direction direction) {
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
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        if (life >= 0)
            this.life = life;
    }

    public Boolean getInvicible() {
        return invicible;
    }

    public void setInvicible(Boolean invicible) {
        this.invicible = invicible;
    }

}
