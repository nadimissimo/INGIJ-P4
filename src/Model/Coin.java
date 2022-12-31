package Model;

public class Coin {

    public Coin(){};

    private float Position;

    private int Value=1;



    public float getPosition() {
        return Position;
    }

    public void setPosition(float position) {
        Position = position;
    }

    public int getValue() {
        return Value;
    }

    public void setValue(int value) {
        Value = value;
    }
}
