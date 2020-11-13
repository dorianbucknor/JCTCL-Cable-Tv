package Tv.JCTCL;
import javax.swing.*;
import java.awt.*;


public class TvDisplay {


    public TvDisplay() {


        JScrollBar scrollBarR = new JScrollBar(1);
        scrollBarR.setVisible(true);
        scrollBarR.setBackground(Color.white);
        scrollBarR.setOpaque(true);
        scrollBarR.setEnabled(true);
        //scrollBarR.setVisibleAmount(10);

        JPanel panel2 = new JPanel();
        panel2.setVisible(true);
        panel2.setBounds(0, 100, 1920, 980);
        panel2.setBackground(Color.yellow);
        panel2.setOpaque(true);
        panel2.setEnabled(true);

        JLabel label = new JLabel("JCTCL Cable Tv");
        label.setVisible(true);
        label.setOpaque(true);
        label.setBounds(-1,0,25,100);

        JPanel panel1 = new JPanel();
        panel1.setVisible(true);
        panel1.setEnabled(true);
        panel1.setBackground(new Color(0, 0, 0, 60));
        panel1.setOpaque(true);
        panel1.setBounds(0,0,1920,100);
        panel1.add(label);


        JFrame frame = new JFrame("JCTCL Cable Tv");
        frame.setVisible(true);
        //frame.setLayout(new BorderLayout());
        frame.setSize(1024, 768);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(0, 0, 0, 180));
        frame.setLayout(null);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(scrollBarR);

    }
}
