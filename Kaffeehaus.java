
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Kaffeehaus.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Kaffeehaus extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(640,400);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    
    public void setup()
    {
    background( 255 ); //Hintergrund weiß
    parallelen(); //zeichnen der parallelen
    zeichneAlleQuadrate(); //zeichnen der Quadrate
    }

    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    
    public void parallelen()
    {
    stroke (125); //Linienfarbe
    int s=40;
    for(int i=0;i<10;i++)
    line (0,20+i*s,640,20+i*s);
    }
    public void zeichneAlleQuadrate() {
    int s=40;
    int[] abstaende={10,20,30,20,10,20,30,20,10};
    fill (0); //Farbe
       for(int i=0;i<8;i++){
            for (int j=0;j<8;j++){
    rect (abstaende[j]+i*s*2,20+s*j,s,s);
            }
       }
    }
    
    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {Kaffeehaus.class.getName() });
    }

}
