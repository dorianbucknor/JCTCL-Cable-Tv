package JCTCLTv;

import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Vector;

public class Control {

    public Control(){

    }
    public FocusAdapter DisplayController(){
        FocusAdapter listener = new FocusAdapter() {
            boolean bFocusIndicated = false;
            Color originalColor;
            @Override
            public void focusGained(FocusEvent e) {
                if(!bFocusIndicated) {
                    // set background to a darker color to indicate focus
                    originalColor = e.getComponent().getBackground();
                    e.getComponent().setBackground(originalColor.darker());
                    bFocusIndicated = true;
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
