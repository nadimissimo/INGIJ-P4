package Model;

import java.util.Vector;

import Variables.ProjectileDirection;

public interface Projectile {

	/**
	 * Konstuktor erstellt Objekt am Ort des Characters mit Bewegungsrichtung zur Maus
	 */
	Projectile Projectile(int Positionx, int Positiony, int mousepositionx, int mousepositiony, int Movementspeed, int Atackpower);


	/**
	 * 
	 * @return aktuelle Position des projektils
	 */
     float getPosition();

     /**
      * 
      * @param position
      */
     void setPosition(float position);

     /**
      * @return Bewegungsrichtung des Projektils
      */
     int getDirection();

     /**
      * @param direction
      */
     void setDirection(ProjectileDirection direction);
    
     /**
      * @return aktulle Bewegungsgeschwindigkeit des Projektils
      */
     int getMovementSpeed();
     
     /**
      * @param movementSpeed
      */
     void setMovementSpeed(int movementSpeed);
     
     /**
      * @return aktuller Angriffsschaden des Projektils
      */
     int getAtackPower();
     
     /**
      * @param atackPower
      */
     void setAtackPower(int atackPower);
     
}
