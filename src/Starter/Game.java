package Starter;

import Managers.CoinManager;
import Managers.CollisionManager;
import Managers.ProjectileManager;
import Managers.WaveManager;
import Model.ObjectCollection;

public interface Game {

	
	
	/**
	 * Knstruktor initialisiert die Manager, das Jframe und alle Objekte  
	 * Game Klasse ist erster Aufruf der main
	 */
	Game Game(Character ch, CoinManager coinm, CollisionManager cm, ProjectileManager pm, WaveManager wm, ObjectCollection oc);


     /**
      * startet den Timer und initialisiert die erste Gegnerwelle. Nach definiertem Intervall werden Gegnerwellen erzeugt
      */
     void start_game();
     /**
      * Verarbeitet Tastatureingaben(W,A,S,D)
      * Status der Tastatureingabe wird vom Kollisionsmanager verarbeitet
      */
     void Key_Event();
     /**
      * Verarbeitet Mausclick
      * Benachrichtigt Projektilmanager ein Projektil zu erzeugen
      */
     void Mouse_Event();

     /**
      * Initialisiert in Abhängigkeit des globalTimers neue Gegnerwellen
      * Erneuert die Grafische Oberfläche
      */
     void Game_Update();

     /**
      * Timer wird um eine zeiteinheit erhöht
      */
     void Timer_Update();

     /**
      *  Ruft Funktionen des Collisionmanagers auf und setzt ggf noch Aktionen um
      */
     void Collision_Update();
}
