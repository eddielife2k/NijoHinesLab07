
import java.awt.*;
import java.applet.*;
import java.util.*;
public class Keyboard
{
    public static void drawFrame(Graphics g) {
        Polygon keyFrame = new Polygon();
        keyFrame.addPoint ( 100 , 800 );
        keyFrame.addPoint ( 700 , 800 );
        keyFrame.addPoint ( 750 , 900 );
        keyFrame.addPoint ( 50  , 900 );
        g.drawPolygon( keyFrame ); 
    }
    public static void drawKeys(Graphics g) {
     g.drawRect (560, 10, 200, 200);
      
    }
}
