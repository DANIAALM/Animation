import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame
{
    Canvas canvas = new Canvas(800, 400);
    
    public static void main(String[] args) {
        Main main = new Main();
        main.setVisible(true);
    }

    public Main() {
        setTitle("Animation");
        setSize(800, 600);

        add(canvas);
        pack();
    }
}
