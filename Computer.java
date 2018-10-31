
import java.awt.*;
import java.applet.*;
import java.util.*;
public class Computer
{
    public static void drawScreen(Graphics g) {
        g.setColor(Color.black);
        g.fillRect( 100 , 50  , 800 ,  450 );
        g.fillRect( 450 , 500 , 100 ,  125 );
        Polygon lowerStand = new Polygon();
        lowerStand.addPoint( 450 , 625 );
        lowerStand.addPoint( 400 , 700 );
        lowerStand.addPoint( 600 , 700 );
        lowerStand.addPoint( 550 , 625 );
        g.fillPolygon( lowerStand );
        g.setColor(new Color(51, 51, 160)); 
        g.fillRect( 150 , 100 , 700 , 350);
    }
    public static void drawHp() {
    }
    public static void drawWindows(){
    }
}
