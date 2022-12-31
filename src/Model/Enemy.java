package Model;

import java.util.Vector;

import Variables.Direction;

public interface Enemy {
	
	/**
	 * @Konstruktor platziert Gegner auf dem Spielfeld
	 */
     Enemy Enemy(int Health, int Positionx, int Positiony, int Atackpower, int Atackspeed);



     /**
      * @return Aktuelle Lebenspunkte des Gegners
      */
     int getHealth();

     /**
      * @param healthpoints
      */
     void setHealth(int health);
    
     /**
      * @return aktuelle x-Position des Gegners
      */
     int getPositionX();
     
     /**
      * @return aktuelle y-Position des Gegners
      */
     int getPositionY();

     /**
      * @param position
      */
     void setPosition(int positionx,int positiony);

     /**
      * @return aktuelle Blick/Bewegungsrichtung des Gegners
      */
     Direction getDirection();
     
     /**
      * @param direction
      */
     void setDirection(Direction direction);
     
     /**
      * @return aktuelle Angriffskraft des Gegners
      */
     int getAtackPower();
     
     /**
      * @param atackPower
      */
     void setAtackPower(int atackPower);
    
}
