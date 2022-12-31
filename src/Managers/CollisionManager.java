package Managers;

public interface CollisionManager {

	
	
	/**
	 * Konstruktor tellt die Funktionen für die Kollisionsüberprüfung bereit
	 */
	CollisionManager CollisionManager();

     /**
      * Kalkuliert die Positionen aller Objekte mit jedem Zeitintervall neu
      */
     void calculatePositions();


     /**
      * überprueft ob die Positionen von Spieler und Gegner übereinstimmen
      * Falls ja, wird das CharakterObjekt benachrichtigt, den Schaden von den Lebenspunkten des Spielers abzuziehen
      * Falls ja, wird der WaveManager benachrichtigt, das GegnerObekt zu löschen
      * Sound wird abgespielt
      */
     void checkCharEnemy();


     /**
      * Ueberprueft ob der Spieler mit einer Wand in Berührung kommt und
      * benachrichtigt das CharacterObjekt sene Bewegungsrichtung/einschränkung anzupassen
      */
     void checkCharWall();


     /**
      * überprueft ob die Positionen von Spieler und Coin übereinstimmen
      * Falls ja, wird der CoinCounter um 1 erhoeht
      * Falls ja, wird der Coinmanager benachrichtigt das CoinObjekt zu löschen
      * Sound wird abgespielt
      */
     void checkCharCoin();

     /**
      * Ueberprueft ob die Position eines Projektils mit einer Wandposition übereinstimmt
      * Falls ja, benachrichtigt den Projektilmanager das Objekt zu löschen
      */
     void checkProjectileWall();


     /**
      * Ueberprueft ob die Position eines Projektils mit der eines Gegners übereinstimmt
      * Falls ja, benachrichtigt Gegnerobjekt seine Werte(LEbenspunkte) entsprechend anzupassen
      * Falls ja, benachrichtigt den Projektilmanager das Objekt zu löschen
      */
     void checkProjectileEnemy();

     /**
      * Ueberprueft ob ein Gegner mit einer Wand in Berührung kommt,
      * Benachrichtigt Gegnerobjekt seine Position anzupassen
      */
     void checkEnemyWall();


}
