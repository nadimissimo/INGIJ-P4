package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Character {

    public Character(){};       // Character random platzieren?

    private int Healthpoints=100;

    private float Position;

    private Vector Direction;

    private int Movementspeed=100;

    private int AtackPower=100;

    private int AtackSpeed=100;

    private int Coinscore=0;

    private int Highscore=0;

    public int getHealthpoints() {
        return Healthpoints;
    }

    public void setHealthpoints(int healthpoints) {
        Healthpoints = healthpoints;
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

    public int getMovementspeed() {
        return Movementspeed;
    }

    public void setMovementspeed(int movementspeed) {
        Movementspeed = movementspeed;
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

    public int getCoinscore() {
        return Coinscore;
    }

    public void setCoinscore(int coinscore) {
        Coinscore = coinscore;
    }

    public int getHighscore() {
        return Highscore;
    }

    public void setHighscore(int highscore) {
        Highscore = highscore;
    }
}
