
import processing.core.PApplet;

/**
 * Klasse Figuren.
 * Beschreibung: Hier sollen mehrere vorgegebene Figuren gezeichnet werden.
 *
 * @author Simon Gebert 
 * @version Feb2020
 */
public class Figuren extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(500, 700); // Festlegen der Fenstergröße
    }        

    public void zeichneBildC() {
        // Zeichne dir zunächst eine Skizze auf ein Blatt Papier und überlege dir, welche
        // Werte du den Methoden rect(x,y,b,h) und ellipse(x,y,b,h) übergeben musst, 
        // dass Bild C gezeichnet wird

       
        rect ( 125,25,250,250 );
        ellipse ( 250, 150, 200, 200);
        ellipse ( 250, 150, 150, 150 );
        ellipse ( 250,150,100,100) ;
        
        ellipse ( 250, 500, 250, 250);
        rect ( 175, 425, 150, 150) ;
        rect ( 200, 450, 100, 100) ;
        rect ( 225, 475, 50, 50 ) ;
        
        // ***** Ende der eigenen Anweisungen **********
    }

    
    public void zeichneBildA() {
        ellipse ( 250, 125, 200, 200);
        rect ( 150, 225, 200, 200);
        triangle ( 150, 600, 250, 425, 350, 600);

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
        //zeichneBildC(); // Aufruf deiner Methode
        zeichneBildA();
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Figuren.class.getName() });
    }

}
