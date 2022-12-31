package Model;

import java.util.Vector;

public class Projectile {

    public Projectile(){};

    private float Position;

    private Vector Direction;

    private int MovementSpeed;

    private int AtackPower;

    public float getPosition() {
        return Position;
    }

    public void setPosition(float position) {
        Position = position;
    }

    public Vector getDirection() {
        return Direction;
    }

    public void setDirection(Vector direction) {
        Direction = direction;
    }

    public int getMovementSpeed() {
        return MovementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        MovementSpeed = movementSpeed;
    }

    public int getAtackPower() {
        return AtackPower;
    }

    public void setAtackPower(int atackPower) {
        AtackPower = atackPower;
    }
}
