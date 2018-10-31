// Lab07st.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*; 
                                                                

public class Lab07v100HinesNijo extends Applet
{
    public void paint(Graphics g)   
    {   
      this.setSize(1600, 1080);
      setBackground( g , 204, 179, 116, 1600, 1080 );
      
      Computer.drawScreen(g);
      Computer.drawHp();
      Computer.drawWindows();
      Keyboard.drawFrame(g); 
      Keyboard.drawKeys(g);
      Mouse.drawFrame();
      Mouse.drawButtons();
      Mouse.drawLogo();
      Bottle.drawFrame();
      Bottle.drawCap();
      Bottle.drawMetalRing();
      
     
   }
   public static void setBackground(Graphics g, int r, int gC, int b, int x, int y)
   {
       g.setColor(new Color(r, gC, b));
       g.fillRect( 0, 0, x, y ) ;
    }
}




    


