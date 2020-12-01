package JCTCLTv;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Vector;

import static JCTCLTv.GUI.mainLayout;
//import static JCTCLTv.GUI.mainPanel;
import static JCTCLTv.GUI.curCard;

public class Control {

    public Control(){

    }
    public FocusAdapter DisplayController(Container mainPanel){
        FocusAdapter listener = new FocusAdapter() {
            boolean bFocusIndicated = false;
            Color originalColor;
            @Override
            public void focusGained(FocusEvent e) {
                if(!bFocusIndicated) {
                    // set background to a darker color to indicate focus
                    originalColor = e.getComponent().getBackground();
                    e.getComponent().setBackground(new Color(255, 0, 180, 60));
                    bFocusIndicated = true;

                    e.getComponent().addKeyListener(new KeyAdapter() {

                        @Override
                        public void keyPressed(KeyEvent k) {
                            if (k.getKeyCode() == 86) {
                                JOptionPane.showMessageDialog(e.getComponent(), "Hello");
                                e.getComponent().getParent().setBackground(Color.CYAN);
                            } else {
                                System.out.println("HEEEEEEEEELLLLLLLLLPPPPPPPPPPP");
                            }

                            if(k.getKeyCode() == 81){
                                System.out.println("Q Pressed");
                                mainLayout.show(mainPanel, "Log In");
                                curCard = "Log In";
                            }else{
                                System.out.println("NOOOOOOO");
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

}
