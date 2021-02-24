
/**
 * Beschreiben Sie hier die Klasse wellen1b.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

public class wellen1b
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    
    public void settings()
    {
        size(500,500);
    }        
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x;
    
    public void setup()
    {
    zeichneQuadrat(10,10,255,true);
    }
    public void zeichneQuadrat( int x, int y, int farbe, boolean links )
    {
         
         
    }
    /**
     * Konstruktor für Objekte der Klasse wellen1b
     */
    public wellen1b()
    {
        // Instanzvariable initialisieren
        x = 0;
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public int beispielMethode(int y)
    {
        // tragen Sie hier den Code ein
        return x + y;
    }
}
