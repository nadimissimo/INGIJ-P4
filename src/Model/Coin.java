package Model;

public interface Coin {

	/**
	 * Konstruktor erzeugt ein Coinobjekt mit dem Wert 1
	 * @param Position, an der die Muenze erscheint
	 */
     Coin Coin(int Positionx, int Positiony);


     /**
      * @return Position der Muenze
      */
     float getPosition();

     /**
      * @param Position der Muenze
      */
     void setPosition(float position);

     /**
      * @return Wert der Muenze
      */
     int getValue();

     /**
      * @param value der Muenze
      */
     void setValue(int value);
}
