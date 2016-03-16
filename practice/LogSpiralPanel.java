import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Arc2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;
public class LogSpiralPanel extends JPanel
{
   private static final double GOLDEN_MEAN =  (1 + Math.sqrt(5)) / 2;
   private static final int WIDTH = 800;
   private static final int HEIGHT = 800;

   public void paintComponent(Graphics g)
   {
       Graphics2D g2 = (Graphics2D) g;
       setSize(WIDTH, HEIGHT);
       Rectangle2D.Double rec = new Rectangle2D.Double(0, 0, getHeight(), getHeight()*GOLDEN_MEAN);
       
       g2.draw(rec);
       recursiveDraw(g2, rec.getX(), rec.getY(), rec.getHeight(), 
       /* Your code goes here.
         1. Compute the dimensions of the goldenRectangle (you can use getHeight() 
            to obtain the side size)
         2. Draw the golden rectangle
         3. Call the recursive helper method "recursiveDraw" which will draw 
            the spiral.
            */
     
     
       
   }
   
   /**
      Method that recursively draws a logarithmic spiral.
      @param x The upper left corner x-coordinate of the golden rectangle
      @param y The upper left corner y-coordinate of the golden rectangle
      @param side the smallest side size of the golden rectangle
      @param angle The angle (0, 90, 180 or 270) where the top of the 
      current golden rectangle is located. For the outermost golden 
      rectangle, the angle is 90.
   */
   private void recursiveDraw(Graphics2D g2, double x, double y, double side, int angle)
   {
      // Recursion ending condition: when the side is very small
      

      // Draw the current square and arc
      

      /* Continue drawing the spiral recursively: calculate the new side 
         size, calculate the new (x, y) coordinates and the new angle. Then, 
         call "recursiveDraw" again. */
      
   }
   
   /**
      Draws the arc of the current iteration.
      @param x The x-coordinate of the square's upper-left corner  
      @param y The y-coordinate of the square's upper-left corner
      @param side The size of the side of the square (or the arc's radius)
      @param angle The angle (0, 90, 180 or 270) where the top of the 
      current golden rectangle is located. For the outermost golden 
      rectangle, the angle is 90.
   */
   private void drawArc(Graphics2D g2, double x, double y, double side, int angle)
   {
      double auxX = x;
      double auxY = y;
      if (angle == 0 || angle == 270 )
      {
         auxX = x - side;
      }
      if (angle == 270 || angle == 180)
      {
         auxY = y - side;
      }
      g2.draw( new Arc2D.Double(auxX, auxY, side * 2, side * 2, angle, 90, Arc2D.OPEN));
   }   
   private double calculateNewX(double x, double angle, double side, double newSide)
   {
      if (angle == 0)
         x = x + side - newSide;
      else if (angle == 90)
         x = x + side;
      else if (angle == 270)
         x = x - newSide;
      return x;
   }

   private double calculateNewY(double y, double angle, double side, double newSide)
   {
      if (angle == 0)
         y = y + side;
      else if (angle == 180)
         y = y - newSide;
      else if (angle == 270)
         y = y + side - newSide;
      return y;
   }
}