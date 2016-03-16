import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TreeViewer 
{
   
    private TreePanel drawing;
    private JPanel panel;
    private JFrame frame;
    
   
    public static void main(String[] args)
    {
        TreeViewer viewer = new TreeViewer();
    }
    
    public TreeViewer()
    {
        drawing = new TreePanel();
        
        panel = new JPanel();
        panel.add (drawing);
        
        frame = new JFrame();
        frame.setTitle("Tree Fractal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1400, 1000);
        frame.add(panel);
        frame.setVisible(true);
    }
}