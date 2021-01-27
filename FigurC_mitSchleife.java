
import processing.core.PApplet;

/**
 * Klasse figurC_mitSchleife.
 * Beschreibung: Die FigurC aus der vorherigen Aufgabe soll mit einer Zählschleife implementiert werden.
 *
 * @author Simon Gebert 
 * @version Feb2020
 */
public class FigurC_mitSchleife extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(500,700); // Festlegen der Fenstergröße
    }        

    public void zeichneBildC() {
        // ***** hier kommen deine Anweisungen hin ************
        rect ( 125,25,250,250 );
        for (int i=0;i<3;i++) 
        ellipse ( 250, 150, 200-i*50, 200-i*50);
       
        ellipse ( 250, 500, 250, 250);
        for (int i=0 ; i<3 ; i++)
        rect ( 175+i*24, 425+i*25, 150-i*50, 150-i*50) ;
       
        
        // ***** Ende der eigenen Anweisungen **********
    }

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        zeichneBildC(); // Aufruf deiner Methode
    }


    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {FigurC_mitSchleife.class.getName() });
    }

}
