import javax.swing.*;
import java.awt.*;

public class class9 {
    public static void main(String[] args){
        JFrame f = new JFrame("Frame Test");

        f.setSize(200,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setLayout(new FlowLayout());
        JButton b1 = new JButton("Click to run");
        JTextField t = new JTextField(10);
        JTextArea ta1 = new JTextArea(10,25);

        f.add(t);
        f.add(b1);
        f.add(ta1);
        f.setVisible(true);
    }
}
