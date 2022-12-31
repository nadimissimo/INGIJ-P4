package Model;

import java.awt.Taskbar.State;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import Variables.Direction;

public interface Character {
	
	
	/**
	 * Konstuktor erstellt den Sielercharakter. Der Charakter wird in der Mitte des Bildschirms platziert und schaut nach unten.
	 * Der Coinscore wird auf 0 gesetzt
	 */
    Character Character(int Healthpoints, int Positionx, int Positiony, int Movementspeed, int AtackPower, int Atackspeed);       


    /**
     * @return Anzhal der Lebenspunkte
     */
     int getHealthpoints();
     
     /**
      * @param healthpoints
      */
     void setHealthpoints(int healthpoints);

     /**
      * @return aktuelle x-Position des Characters
      */
     int getPositionX();
     
     /**
      * @return aktuelle y-Position des Characters
      */
     int getPositionY();

     /**
      * @param position
      */
     void setPosition(int positionx,int positiony);

     /**
      * @return Bewegungsrichtung(Blickrichtung) des Charakters
      */
     Direction getDirection();

     /**
      * @param direction(Blickrichtung)
      */
     void setDirection(Direction direction);

     /**
      * @return maximale Bewegungsgeschwindigkeit des Charakters
      */
     int getMovementspeed();

     /**
      * @param movementspeed
      */
     void setMovementspeed(int movementspeed);
     
     /**
      * @return aktuelle Angriffskraft des Charakters
      */
     int getAtackPower();

     /**
      * @param atackPower
      */
     void setAtackPower(int atackPower);

     /**
      * @return aktuelle Angriffsgeschwindigkeit des Charakters
      */
     int getAtackSpeed();

     /**
      * @param atackSpeed
      */
     void setAtackSpeed(int atackSpeed);
     
     /**
      * @return aktueller Coinscore des Charakters
      */
     int getCoinscore();

     /**
      * @param coinscore
      */
     void setCoinscore(int coinscore);

}
