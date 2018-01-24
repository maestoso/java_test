import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.*;

public class backdrop
{

    public static void main(String[] args)
    {



        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                displayJFrame();
            }
        });
    }

    static void displayJFrame()
    {

        JFrame jframe = new JFrame("JFrame Background Color");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jframe.setBackground(Color.blue);


        jframe.setPreferredSize(new Dimension(400, 300));
        jframe.pack();
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
    }

    private int x;
    private int y;
    private int width;
    private int height;

    // Constructs a new rectangle
    public backdrop(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
    }

    // Returns this rectangle's leftmost x coordinate.
    public int getX() {
        return x;
    }

    // Returns this rectangle's topmost y coordinate.
    public int getY() {
        return y;
    }

    // Returns this rectangle's width.
    public int getWidth() {
        return width;
    }

    // Returns this rectangle's height.
    public int getHeight() {
        return height;
    }

    // Returns a text representation of this rectangle.
    public String toString() {
        return "{(" + x + ", " + y + "), " + width + "x" + height + "}";
    }

    // Returns whether the given point is contained within this rectangle.
    public boolean contains(Point p) {
        return getX() <= p.getX() && p.getX() < (getX() + width) &&
                getY() <= p.getY() && p.getY() < (getY() + height);
    }

    // Returns whether the given rectangle is entirely contained in this rectangle.
    public boolean contains(Rectangle r) {
        return getX() <= r.getX() && r.getX() + r.getWidth() < (getX() + width) &&
                getY() <= r.getY() && r.getY() + r.getHeight() < (getY() + height);
    }
    }





