import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Exercise2_JFrameDisableButton extends JFrame implements ActionListener
{
    final int SIZE = 180;
    Container con = getContentPane();
    JButton button = new JButton("Press Me");
    public Exercise2_JFrameDisableButton()
    {
        super("Frame");
        con.setLayout(new FlowLayout());
        setSize(SIZE, SIZE);
        setVisible(true);
        con.add(button);
        button.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        button.setEnabled(false);
    }
    public static void main(String[] args)
    {
        Exercise2_JFrameDisableButton frame =
                new Exercise2_JFrameDisableButton();
    }
}