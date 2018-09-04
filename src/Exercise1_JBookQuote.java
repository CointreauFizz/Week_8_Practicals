import javax.swing.*;
import java.awt.*;

public class Exercise1_JBookQuote extends JFrame
{
    FlowLayout flow = new FlowLayout();
    JLabel msg1 = new  JLabel("To begin with,");
    JLabel msg2 = new JLabel("Your Focus Determines your Reality");
    public Exercise1_JBookQuote()
    {
        super("Book Quote");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(msg1);
        add(msg2);
    }
    public static void main(String[] args)
    {
        Exercise1_JBookQuote aFrame;
        aFrame = new Exercise1_JBookQuote();
        aFrame.setSize(300, 150);
        aFrame.setVisible(true);
    }
}