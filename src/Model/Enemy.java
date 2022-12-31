package Model;

import java.util.Vector;

public class Enemy {

    public Enemy(){};

    private String name;

    private int Health=100;

    private float Position;

    private Vector Direction;

    private int AtackPower=100;

    private int AtackSpeed=100;






    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

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

    public int getAtackPower() {
        return AtackPower;
    }

    public void setAtackPower(int atackPower) {
        AtackPower = atackPower;
    }

    public int getAtackSpeed() {
        return AtackSpeed;
    }

    public void setAtackSpeed(int atackSpeed) {
        AtackSpeed = atackSpeed;
    }
}
