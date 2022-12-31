package Managers;

import Model.Coin;

import java.util.ArrayList;
import java.util.List;

public interface CoinManager {
     
	
	
	/**
	 * Konstruktor erstellt Coinmanager mit einer leeren Liste mit dem Datentyp Coin
	 */
	CoinManager Coinmanager();

     /**
      * Erstellt eine neues Münzobjekt an der Position, an der ein Gegnerobjekt gelöscht wird und speichert es in einer Liste ab
      * @param Position der Muenze
      * @return Coin
      */
     Coin createCoin(int Positionx, int Positiony);

     /**
      * Löscht ein Coinobjekt aus der Liste
      */
     void deleteCoin(Coin coin);

     /**
      * Gibt Anzahl der Münzen aus der Liste zurück
      * @return Anzahl der Münzen
      */
     Integer getCoinArrayLength();
}
