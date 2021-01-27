
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse zeichneQuadrate.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class zeichneQuadrate extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(600,600);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    
    public void zeichneQuadrate(){
     for (int i=0; i<10;i++)
     rect (50+i*25,50,25,25);
    }
    
    public void zeichneKreise(){
    for(int i=0;i<20;i++ )
    ellipse(300,300,500-i*25,500-i*25);
    }

    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    @Override
    public void setup()
    {
    //zeichneQuadrate();
    zeichneKreise();
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {zeichneQuadrate.class.getName() });
    }

}
