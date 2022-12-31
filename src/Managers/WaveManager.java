package Managers;

import Model.Enemy;
import Model.Wave;

import java.util.ArrayList;
import java.util.List;

public interface WaveManager {

	/**
	 * Konstruktor erstellt eine leere Liste vom Datentyp Welle und setzt den Wellenzähler auf 0
	 */
	WaveManager WaveManager();
	
   

     /**
      * erstellt eine neue Wave mit Gegnern abhängig vom Wellenzähler und speichert Sie in einer Liste
      * erhoeht den Wellenzaehler
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
      * @return Anzahl der Gegnerobjekte des gewünschten WaveArrays
      */
     Integer getWaveArrayLength(Wave wave);
}
