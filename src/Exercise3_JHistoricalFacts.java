import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercise3_JHistoricalFacts implements ActionListener {

    private FlowLayout flow = new FlowLayout();
    private JButton b = new JButton("Press to change fact");
    private JLabel f1 = new JLabel("The U.S. Civil War started in 1860 and ended in 1865.   ");
    private JLabel f2 = new JLabel("Israel gained independence in 1948.                     ");
    private JLabel f3 = new JLabel("The longest reigning British monarch was Queen Victoria.");
    private JLabel f4 = new JLabel("The Battle of Hastings took place in 1066.              ");
    private JLabel f5 = new JLabel("The U.S. Declaration of Independence was signed in 1776.");
    private int counter = 0;

    public Exercise3_JHistoricalFacts()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        b.add(f2);
        JLabel stars = new JLabel("**********************************************");
        stars.add(f3);
        f1.add(f4);
        b.addActionListener(this);
    }

    private void setLayout(FlowLayout flow) {

    }

    private void setDefaultCloseOperation(int exitOnClose) {

    }

    public static void main(String[] args)
    {
        Exercise3_JHistoricalFacts rFrame = new Exercise3_JHistoricalFacts();
        rFrame.setSize(400,200);
        rFrame.setVisible(true);
    }

    private void setVisible(boolean b) {

    }

    private void setSize(int i, int i1) {

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        ++counter;
        if(counter == 5)
            counter = 0;
        if(counter == 1)
        {
            remove(f1);
            add(f2);
        }
        else
        if(counter == 2)
        {
            remove(f2);
            add(f3);
        }
        else
        if(counter == 3)
        {
            remove(f3);
            add(f4);
        }
        else
        if(counter == 4)
        {
            remove(f4);
            add(f5);
        }
        else
        {
            remove(f5);
            add(f1);
        }

        validate();
        repaint();
    }

    private void add(JLabel f3) {
    }

    private void remove(JLabel f1) {

    }

    private void repaint() {
    }

    private void validate() {

    }

}