package Managers;

import Model.Projectile;

import java.util.ArrayList;
import java.util.List;

public interface ProjectileManager {


	/**
	 * Konstruktor erstellt leere Liste vom Datentyp Projektil
	 */
	ProjectileManager ProjectileManager();

     /**
      * Erstellt ein neues Projektilobjekt an der Position des Spielers,
      * Projektilrichtung ist die Richtung des Mauszeigers
      * @return Projectile
      */
     Projectile createProjectile(int Positionx, int Positiony);

     /**
      * Löscht das ProjektilObjekt
      */
     void deleteProjectile();

     /**
      * Löscht alle Projektile aus dem Projektilarray
      */
     void clearProjectileArray();

     /**
      * gibt die Anzahl der Projektile im Projektilarray zurück
      * @return int Projektilanzahl
      */
     Integer getProjectileArrayLength();
}
