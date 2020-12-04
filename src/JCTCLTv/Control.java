package JCTCLTv;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileReader;
import java.util.Vector;

import static JCTCLTv.GUI.mainLayout;
//import static JCTCLTv.GUI.mainPanel;
import static JCTCLTv.GUI.curCard;


public class Control {
    private boolean hasShown = false;
    public Control(){

    }
    public FocusAdapter DisplayController(Container mainPanel){
        FocusAdapter listener = new FocusAdapter() {
            boolean bFocusIndicated = false;
            boolean mShow = false;
            Color originalColor;
            @Override
            public void focusGained(FocusEvent e) {
                if(!bFocusIndicated) {
                    // set background to a darker color to indicate focus
                    originalColor = e.getComponent().getBackground();
                    bFocusIndicated = true;
                    e.getComponent().setBackground(originalColor.darker());
                    e.getComponent().addKeyListener(new KeyAdapter() {

                        @Override
                        public void keyPressed(KeyEvent k) {
                            if (k.getKeyCode() == 86 && !hasShown) {
                                popUp(e.getComponent(), mainPanel);

                            } else if(k.getKeyCode() == 81){
                                System.out.println("Q Pressed");
                                mainLayout.show(mainPanel, "Log In");
                                curCard = "Log In";
                            }else if (k.getKeyCode() == 10){
                                viewNow(e.getComponent());
                            }else{

                            }
                        }
                    });
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                e.getComponent().setBackground(originalColor);
                e.getComponent().setVisible(false);
                e.getComponent().setVisible(true);
                bFocusIndicated = false;
            }
        };
        return listener;
    }

    public void popUp(Component comp, Component pcon){
        if(!hasShown) {

            JPanel pan = new JPanel(new BorderLayout(0,0));
            JFrame ppFrame = new JFrame("Program Information: ");
            JLabel label = new JLabel("The Heading");
            JTextArea details = new JTextArea("All Details on Program");


            String record = Filehandler.getRecord(comp.getName());




            label.setBackground(new Color(255, 134, 146));
            label.setForeground(new Color(30, 30, 93));
            label.setPreferredSize(new Dimension(600, 50));
            label.setOpaque(true);
            label.setVisible(true);

            details.setBackground(new Color(229, 234, 245));
            details.setForeground(new Color(30, 30, 93));
            details.setOpaque(true);
            details.setVisible(true);

            pan.add(label, BorderLayout.BEFORE_FIRST_LINE);
            pan.add(details, BorderLayout.CENTER);
            pan.setBorder(new LineBorder(new Color(30, 30, 93), 2, true));

            ppFrame.add(pan);
            ppFrame.setUndecorated(true);
            ppFrame.setOpacity(.92f);
            ppFrame.setSize(600, 300);
            ppFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            ppFrame.setFocusable(true);
            ppFrame.setVisible(true);
            ppFrame.setLocationRelativeTo(null);

            hasShown = true;

            ppFrame.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent key) {
                    if (key.getKeyCode() == 86) {
                        ppFrame.setFocusable(false);
                        ppFrame.dispose();
                        hasShown = false;
                    }
                }
            });
        }
    }

    public void viewNow(Component comp){
        JPanel pan = new JPanel(new BorderLayout(0,0));
        JFrame ppFrame = new JFrame("Program Information: ");
        JLabel clabel = new JLabel("The Heading");
        JLabel plabel = new JLabel("The HProg");



        String record = Filehandler.getRecord(comp.getName());




        clabel.setBackground(new Color(255, 134, 146));
        clabel.setForeground(new Color(30, 30, 93));
        //clabel.setFont(new Font(""));
        clabel.setPreferredSize(new Dimension(600, 50));
        clabel.setOpaque(true);
        clabel.setVisible(true);

        plabel.setBackground(new Color(229, 234, 245));
        plabel.setForeground(new Color(30, 30, 93));
        plabel.setOpaque(true);
        plabel.setVisible(true);

        pan.add(clabel, BorderLayout.BEFORE_FIRST_LINE);
        pan.add(plabel, BorderLayout.CENTER);
        pan.setBorder(new LineBorder(new Color(30, 30, 93), 2, true));

        ppFrame.add(pan);
        ppFrame.setUndecorated(true);
        ppFrame.setOpacity(.92f);
        ppFrame.setSize(600, 300);
        ppFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ppFrame.setFocusable(true);
        ppFrame.setVisible(true);
        ppFrame.setLocationRelativeTo(null);
    }

}
