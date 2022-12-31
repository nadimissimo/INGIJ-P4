package Managers;

import Model.Enemy;
import Model.Wave;

import java.util.ArrayList;
import java.util.List;

public interface WaveManager {

     /**
      * beinhaltet alle Gegnerwellen
      */
     List<Wave> EnemyWave= new ArrayList<>();

     /**
      * Nummer der Welle
      */
     Integer WaveCounter=0;

     /**
      * erstellt eine neue Wave mit Gegnern
      * @return Wave
      */
     Wave createWave();

     /**
      * Erstellt ein neues Gegnerobjekt
      * @return Enemy
      */
     Enemy createEnemy();

     /**
      * Löscht das GegnerObjekt
      * Benachrichtigt den Coinmanager an dieser Position eine Münze zu erstellen
      */
     void deleteEnemy();

     /**
      * Löscht die komplette Wave, alle Gegner verschwinden
      */
     void clearWaveArray();

     /**
      *
      * @return Anzahl der Gegnerobjekte des gewünschten WaveArrays
      */
     Integer getWaveArrayLength(Wave wave);
}
