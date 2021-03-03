
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse Wellen1.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Wellen1 extends PApplet
{   

    int s= 60;
    int d = s/4;
    int a= 4;

    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(510,270);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        background(0xFAA317);
        
        alleQuadrate();
        linien();
    }

    public void zeichneQuadrat( int x, int y, int farbe, boolean links ) {
        fill(farbe);
        rect( x, y, s, s );

        if (farbe == 255){
            fill (0);
        } else { 
            fill (255);
        }

        ellipseMode(CORNERS);
        noStroke();
        
        if( links ) {
            ellipse ( x+a, y+a, x+d+a, y+d+a );
            ellipse ( x+a, y+ 3*d-a, x+d+a, y+s-a );
        } else { 
            ellipse (x+ 3*d-a, y+a, x+s-a, y+d+a);
            ellipse (x+3*d-a, y+3*d-a, x+s-a, y+s-a);
        }    
    }  

    public void alleQuadrate() {
        noStroke();
        int aktuelleFarbe = 255;
        boolean pos_aktuell = true;
        for (int j=0; j<=3; j++){
            for (int i=0; i<=7;i++){
                zeichneQuadrat (d + i*s, d + j*s, aktuelleFarbe, pos_aktuell);
                if (aktuelleFarbe == 255){
                    aktuelleFarbe=0;
                } else {
                    aktuelleFarbe = 255;
                }
            }
            if (aktuelleFarbe == 255){
                aktuelleFarbe=0;
            } else{
                aktuelleFarbe = 255;
            }
            if (pos_aktuell == true){
                pos_aktuell= false;
            } else {
                pos_aktuell = true;
            }
        }
            
        
    }
     
     public void linien(){
         stroke(8, 250, 78);
         strokeWeight(a);
         for (int i =0; i<=2; i++){
              line(d-a,d+s+s*i,d+a+8*s,d+s+s*i);
            }   
     }
     
        /**
         * Mit der main()-Methode wird das Programm gestartet.
         *
         */    
        public static void main(String _args[]){ 
        PApplet.main(new String[] {Wellen1.class.getName() });
        }

}

