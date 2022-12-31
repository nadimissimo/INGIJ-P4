package Starter;

public interface Game {



     float globalTimer = 0;

     /**
      * Initialisiert das JFrame, Bildobjekte und alle relevanten Klassen
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
