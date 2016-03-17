import java.awt.*;
import java.awt.geom.Line2D;
import javax.swing.JPanel;

public class TreePanel extends JPanel
{
    private final int WIDTH = 1400;
    private final int HEIGHT = 1000;
    
    private double lAngle1 = -5;
    private double rAngle1 = 20;
    
    private double lAngle2 = 20;
    private double rAngle2 = -5;
    
    
    
    public TreePanel()
    {
        setBackground(Color.black);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }
    
    public void drawFractal(Graphics2D g2, double x, double y, double len, double currentAngle)
    {
        
        if (len < 10)
        {
            return;
        }
        if (len < 70)
        {
            g2.setColor(Color.green);
        }
        else
        {
            g2.setColor(Color.cyan);
        }
        
        double x2 = x - (Math.sin(Math.toRadians(currentAngle))*len);
        double y2 = y - (Math.cos(Math.toRadians(currentAngle))*len);
        Line2D.Double line = new Line2D.Double(x, y, x2, y2);
        g2.draw(line);
        
        drawFractal(g2, x2, y2, len - 10, currentAngle + lAngle1);
        drawFractal(g2, x2, y2, len - 10, currentAngle - rAngle1);
        
        
        
    }
    public void drawFractal2(Graphics2D g2, double x, double y, double len, double currentAngle)
    {
        
        if (len < 10)
        {
            return;
        }
        if (len < 70)
        {
            g2.setColor(Color.green);
        }
        else
        {
            g2.setColor(Color.cyan);
        }
        
        double x2 = x - (Math.sin(Math.toRadians(currentAngle))*len);
        double y2 = y - (Math.cos(Math.toRadians(currentAngle))*len);
        Line2D.Double line = new Line2D.Double(x, y, x2, y2);
        g2.draw(line);
        
        drawFractal2(g2, x2, y2, len - 10, currentAngle + lAngle2);
        drawFractal2(g2, x2, y2, len - 10, currentAngle - rAngle2);
        
        
        
    }
    
    public void drawFractal3(Graphics2D g2, double x, double y, double len, double currentAngle)
    {
        
        if (len < 10)
        {
            return;
        }
        if (len < 80)
        {
            g2.setColor(Color.green);
        }
        else
        {
            g2.setColor(Color.cyan);
        }
        
        double x2 = x - (Math.sin(Math.toRadians(currentAngle))*len);
        double y2 = y - (Math.cos(Math.toRadians(currentAngle))*len);
        Line2D.Double line = new Line2D.Double(x, y, x2, y2);
        g2.draw(line);
        
        drawFractal3(g2, x2, y2, len - 10, currentAngle + 15);
        drawFractal3(g2, x2, y2, len - 10, currentAngle - 15);
        
        
        
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        super.paintComponent(g2);
        
        drawFractal2(g2, 700, 900, 140, 0);
        drawFractal3(g2, 700, 900, 140, 0);
        drawFractal(g2, 700, 900, 140, 0);
        
    }
}