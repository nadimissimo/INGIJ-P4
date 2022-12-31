package Managers;

import Model.Projectile;

import java.util.ArrayList;
import java.util.List;

public interface ProjectileManager {


     /**
      * Liste aller Projektile
      */
     List<Projectile> ProjectileArray = new ArrayList<>();

     /**
      * Erstellt ein neues Projektilobjekt an der Position des Spielers,
      * Projektilrichtung ist die Richtung des Mauszeigers
      * @return Projectile
      */
     Projectile createProjectile();

     /**
      * Löscht das ProjektilObjekt
      */
     Projectile deleteProjectile();

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
