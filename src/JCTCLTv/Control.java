package JCTCLTv;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.Arrays;

import static JCTCLTv.GUI.mainLayout;
//import static JCTCLTv.GUI.mainPanel;
import static JCTCLTv.GUI.curCard;


public class Control {
    private boolean phasShown = false;
    private boolean chhasShown = false;
    private boolean isMarked = false;
    private boolean isNew = false;
    private boolean liverep = false;
    private boolean isRec = false;
    private Container MainPanel;
    public Control(){

    }
    public FocusAdapter DisplayController(Container mainPanel, JFrame frame){

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
                    e.getComponent().setBackground(new Color(255, 0, 180,80));
                    e.getComponent().addKeyListener(new KeyAdapter() {

                        @Override
                        public void keyPressed(KeyEvent k) {
                            switch (k.getKeyCode()) {
                                case 80:
                                    if (!phasShown)
                                        popUp(e.getComponent(), mainPanel);
                                    break;
                                case 81:
                                    mainLayout.show(mainPanel, "Log In");
                                    curCard = "Log In";
                                    break;
                                case 86:
                                    if (!chhasShown)
                                        viewNow(e.getComponent());
                                    break;
                                case 69:
                                    int option = JOptionPane.showConfirmDialog(null, "Are You Sure You Want To Close?", "Close", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
                                    if (option == 0) {
                                        frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
                                    }
                                    break;
                                case 77:
                                   Container container1 = (Container) e.getComponent();
                                   Container container2 = (Container) container1.getComponent(1);
                                   JLabel label = (JLabel) container2.getComponent(2);
                                   JLabel progname = (JLabel) container1.getComponent(0);
                                   String[] data = {progname.getText()};

                                    if(label.getForeground().equals(Color.red)){
                                        IndicateOff(label);
                                        CsvHandler.removeData(progname.getText(),"MarkedProgrammes.csv");
                                    }
                                    else {
                                        Indicate(label);
                                        CsvHandler.addRecord(data, new File("MarkedProgrammes.csv"));
                                    }
                                    break;
                                case 82:
                                    Container container3 = (Container) e.getComponent();
                                    Container container4 = (Container) container3.getComponent(1);
                                    JLabel label2 = (JLabel) container4.getComponent(1);

                                    JLabel prog_name = (JLabel) container3.getComponent(0);
                                    String[] data1 = {prog_name.getText()};

                                    if (label2.getForeground().equals(Color.red)) {
                                        IndicateOff(label2);
                                        CsvHandler.removeData(prog_name.getText(),"RecordedProgrammes.csv");
                                    } else {
                                        Indicate(label2);
                                        CsvHandler.addRecord(data1, new File("RecordedProgrammes.csv"));
                                    }
                                    break;
                            }
                        }
                    });
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                e.getComponent().setBackground(originalColor);
                e.getComponent().revalidate();
                mainPanel.repaint();
                bFocusIndicated = false;
            }
        };
        return listener;
    }

    public void popUp(Component comp, Component parentcon){
        if(!phasShown) {
            JPanel pan = new JPanel(new BorderLayout(0,0));
            JFrame ppFrame = new JFrame("Program Information: ");
            JLabel label = new JLabel("The Heading");
            JTextArea details = new JTextArea("All Details on Program");

            String src = comp.getName();
            String[] data = CsvHandler.getData(src, "ListingData.csv");

            Container k = (Container) comp;
            JLabel l = (JLabel) k.getComponent(0);
            label.setText(l.getText());
            JTextArea text = (JTextArea) k.getComponent(2);
            details.setText(text.getText());

            label.setBackground(new Color(255, 134, 146));
            label.setForeground(new Color(30, 30, 93));
            label.setPreferredSize(new Dimension(600, 50));
            label.setFont(new Font("Backslash" ,1, 24));
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

            phasShown = true;

            ppFrame.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent key) {
                    if (key.getKeyCode() == 80) {
                        ppFrame.setFocusable(false);
                        ppFrame.dispose();
                        phasShown = false;

                    }
                }
            });
        }
    }

    public void viewNow(Component comp){

        JPanel pan = new JPanel(new BorderLayout(0,0));
        JFrame chview = new JFrame("Program Information: ");
        JLabel clabel = new JLabel("The Heading");
        JLabel plabel = new JLabel("The HProg");

        String[] data = CsvHandler.getData(comp.getName(), "ListingData.csv");
        clabel.setText(data[16]);

        clabel.setBackground(new Color(255, 134, 146));
        clabel.setForeground(new Color(30, 30, 93));
        clabel.setFont(new Font("Backslash", 1, 24));
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

        chview.add(pan);
        chview.setUndecorated(true);
        chview.setOpacity(.92f);
        chview.setSize(600, 300);
        chview.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        chview.setFocusable(true);
        chview.setVisible(true);
        chview.setLocationRelativeTo(null);

        chhasShown = true;

        chview.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent key) {
                if (key.getKeyCode() == 86) {
                    chview.setFocusable(false);
                    chview.dispose();
                    chhasShown = false;
                }
            }
        });
    }

    private void IndicateOff(Component component) {
        component.setForeground(Color.BLACK);
    }

    enum Indicator{
        MARK,
        UNMARK,
        NEW,
        OLD,
        LIVE,
        REPEAT,
        RECORD,
        D_RECORD
    }
    public  void Indicate(Component component){
       component.setForeground(Color.RED);
    }
}
