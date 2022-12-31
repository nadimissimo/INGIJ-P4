package Managers;

import Model.Coin;

import java.util.ArrayList;
import java.util.List;

public interface CoinManager {
     /**
      * Liste beinhaltet alle Coins auf dem Spielfeld
      */
     List<Coin> CoinArray = new ArrayList<>();

     /**
      * Erstellt eine neues Münzobjekt an der Position, an der ein Gegnerobjekt gelöscht wird und speichert es in einer Liste ab
      * @return Coin
      */
     Coin createCoin();

     /**
      * Löscht ein Coinobjekt aus der Liste
      *
      */
     void deleteCoin(Coin coin);

     /**
      * Gibt Anzahl er Münzen im Münzarrray zurück
      * @return Anzahl der Münzen
      */
     Integer getCoinArrayLength();
}
