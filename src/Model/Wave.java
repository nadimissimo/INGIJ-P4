package Model;

import java.util.List;

public interface Wave {
	
	/**
	 * Konstruktor erzeugt eine neue Welle mit Gegnern und speichert Sie in einer Liste
	 */
	Wave Wave(List<Enemy> enemys);
}
 