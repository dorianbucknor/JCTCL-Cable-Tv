package JCTCLTv;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TvRemote implements ActionListener, MouseListener, KeyListener {

    int b_number = 35;
    boolean color_bg =false;
    int frame_wd = 800;
    int frame_ht = 800;

    JFrame frame = new JFrame();
    JFrame frame2 = new JFrame();
    JLabel textfield = new JLabel();
    JLabel record = new JLabel();
    JLabel view = new JLabel();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JButton[] buttons = new JButton[b_number];



    TvRemote(){
        new GUI();

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0,0,800,100);

        button_panel.setLayout(new GridLayout(5,7));
        button_panel.setBackground(new Color(150,150,150));

        /**/
        for (int i=0;i<b_number;i++){
            buttons[i] = new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setBackground(Color.WHITE);
            buttons[i].setFont(new Font("MV Boli",Font.BOLD,25));
            //buttons[i].setSize((frame_wd/10),(frame_ht/10));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        /**/

        buttons[0].setText(""/*String.valueOf()*/);
        buttons[1].setText(""/*String.valueOf()*/);
        buttons[2].setText(""/*String.valueOf()*/);
        buttons[3].setText(""/*String.valueOf()*/);
        buttons[4].setText(""/*String.valueOf()*/);
        buttons[5].setText(""/*String.valueOf()*/);
        buttons[6].setText(""/*String.valueOf()*/);
        buttons[7].setText(""/*String.valueOf()*/);
        buttons[8].setText(""/*String.valueOf()*/);
        buttons[9].setText("B 1");
        buttons[10].setText("B 1");
        buttons[11].setText("B 1");
        buttons[12].setText("B 1");
        buttons[13].setText("B 1");
        buttons[14].setText("B 1");
        buttons[15].setText("B 1");
        buttons[16].setText("B 1");
        buttons[17].setText("B 1");
        buttons[18].setText("B 1");
        buttons[19].setText("B 1");
        buttons[20].setText("B 1");
        buttons[21].setText("B 1");
        buttons[22].setText("B 1");
        buttons[23].setText("B 1");
        buttons[24].setText("B 1");
        buttons[25].setText("B 1");
        buttons[26].setText("B 1");
        buttons[27].setText("B 1");
        buttons[28].setText("B 1");
        buttons[29].setText("B 1");
        buttons[30].setText("B 1");
        buttons[31].setText("B 1");
        buttons[32].setText("B 1");
        buttons[33].setText("B 1");
        buttons[34].setText("B 1");



        title_panel.add(textfield);
        frame.add(title_panel,BorderLayout.NORTH);
        frame.add(button_panel);

    }

    //
    public void View(){
        frame2.setTitle("Watch");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.pack();
        frame2.setSize(100,100);
        frame2.setVisible(true);
        frame2.setLocationRelativeTo(null);
    }

    public void Mark(){
        frame2.setTitle("Yo");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.pack();
        frame2.setSize(100,100);
        frame2.setVisible(true);
        frame2.setLocationRelativeTo(null);
    }

    public void Unmark(){
        frame2.setTitle("Yo");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.pack();
        frame2.setSize(100,100);
        frame2.setVisible(true);
        frame2.setLocationRelativeTo(null);
    }

    public void Record(){
        frame2.setTitle("Yo");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.pack();
        frame2.setSize(100,100);
        frame2.setVisible(true);
        frame2.setLocationRelativeTo(null);
    }

    public void Enter(){
        frame2.setTitle("Yo");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.pack();
        frame2.setSize(100,100);
        frame2.setVisible(true);
        frame2.setLocationRelativeTo(null);
    }



    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==buttons[0]) {
            buttons[0].setBackground(Color.PINK);
            Mark();
        }
        if(e.getSource()==buttons[1]) {
            buttons[1].setBackground(Color.PINK);
            Mark();
        }
        if(e.getSource()==buttons[2]) {
            buttons[2].setBackground(Color.PINK);
            Mark();
        }
        if(e.getSource()==buttons[3]) {
            buttons[3].setBackground(Color.PINK);
            Mark();
        }
        if(e.getSource()==buttons[4]) {
            buttons[4].setBackground(Color.PINK);
            Mark();
        }
        if(e.getSource()==buttons[5]) {
            buttons[5].setBackground(Color.PINK);
            Mark();
        }
        if(e.getSource()==buttons[6]) {
            buttons[6].setBackground(Color.PINK);
            Mark();
        }
        if(e.getSource()==buttons[7]) {
            buttons[7].setBackground(Color.PINK);
            Mark();
        }
        if(e.getSource()==buttons[8]) {
            buttons[8].setBackground(Color.PINK);
            Mark();
        }
        if(e.getSource()==buttons[9]) {
            buttons[9].setBackground(Color.PINK);
            Mark();
        }
        if(e.getSource()==buttons[10]) {
            buttons[10].setBackground(Color.PINK);
            Mark();
        }
        if(e.getSource()==buttons[11]) {
            buttons[11].setBackground(Color.PINK);
            Mark();
        }
        if(e.getSource()==buttons[12]) {
            buttons[12].setBackground(Color.PINK);
            Mark();
        }
        if(e.getSource()==buttons[13]) {
            buttons[13].setBackground(Color.PINK);
            Mark();
        }
        if(e.getSource()==buttons[14]) {
            buttons[14].setBackground(Color.PINK);
            Mark();
        }
        if(e.getSource()==buttons[15]) {
            buttons[15].setBackground(Color.PINK);
            Mark();
        }
        if(e.getSource()==buttons[16]) {
            buttons[16].setBackground(Color.PINK);
            Mark();
        }
        if(e.getSource()==buttons[17]) {
            buttons[17].setBackground(Color.PINK);
            Mark();
        }
        if(e.getSource()==buttons[18]) {
            buttons[18].setBackground(Color.PINK);
            Mark();
        }
        if(e.getSource()==buttons[19]) {
            buttons[19].setBackground(Color.PINK);
            Mark();
        }
        if(e.getSource()==buttons[20]) {
            buttons[20].setBackground(Color.PINK);
            Mark();
        }
        if(e.getSource()==buttons[21]) {
            buttons[21].setBackground(Color.PINK);
            Mark();
        }
        if(e.getSource()==buttons[22]) {
            buttons[22].setBackground(Color.PINK);
            Mark();
        }
        if(e.getSource()==buttons[23]) {
            buttons[23].setBackground(Color.PINK);
            Mark();
        }
        if(e.getSource()==buttons[24]) {
            buttons[24].setBackground(Color.PINK);
            Mark();
        }
        if(e.getSource()==buttons[25]) {
            buttons[25].setBackground(Color.PINK);
            Mark();
        }
        if(e.getSource()==buttons[26]) {
            buttons[26].setBackground(Color.PINK);
            Mark();
        }
        if(e.getSource()==buttons[27]) {
            buttons[27].setBackground(Color.PINK);
            Mark();
        }
        if(e.getSource()==buttons[28]) {
            buttons[28].setBackground(Color.PINK);
            Mark();
        }
        if(e.getSource()==buttons[29]) {
            buttons[29].setBackground(Color.PINK);
            Mark();
        }
        if(e.getSource()==buttons[30]) {
            buttons[30].setBackground(Color.PINK);
            Mark();
        }
        if(e.getSource()==buttons[31]) {
            buttons[31].setBackground(Color.PINK);
            Mark();
        }
        if(e.getSource()==buttons[32]) {
            buttons[32].setBackground(Color.PINK);
            Mark();
        }
        if(e.getSource()==buttons[33]) {
            buttons[33].setBackground(Color.PINK);
            Mark();
        }
        if(e.getSource()==buttons[34]) {
            buttons[34].setBackground(Color.PINK);
            Mark();
        }
        if(e.getSource()==buttons[35]) {
            buttons[35].setBackground(Color.PINK);
            Mark();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


    //
    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'm':
                //Mark all button
                buttons[0].setBackground(Color.PINK);
                buttons[1].setBackground(Color.PINK);
                buttons[2].setBackground(Color.PINK);
                buttons[3].setBackground(Color.PINK);
                buttons[4].setBackground(Color.PINK);
                buttons[5].setBackground(Color.PINK);
                buttons[6].setBackground(Color.PINK);
                buttons[7].setBackground(Color.PINK);
                buttons[8].setBackground(Color.PINK);
                buttons[9].setBackground(Color.PINK);
                buttons[10].setBackground(Color.PINK);
                buttons[11].setBackground(Color.PINK);
                buttons[12].setBackground(Color.PINK);
                buttons[13].setBackground(Color.PINK);
                buttons[14].setBackground(Color.PINK);
                buttons[15].setBackground(Color.PINK);
                buttons[16].setBackground(Color.PINK);
                buttons[17].setBackground(Color.PINK);
                buttons[18].setBackground(Color.PINK);
                buttons[19].setBackground(Color.PINK);
                buttons[20].setBackground(Color.PINK);
                buttons[21].setBackground(Color.PINK);
                buttons[22].setBackground(Color.PINK);
                buttons[23].setBackground(Color.PINK);
                buttons[24].setBackground(Color.PINK);
                buttons[25].setBackground(Color.PINK);
                buttons[26].setBackground(Color.PINK);
                buttons[27].setBackground(Color.PINK);
                buttons[28].setBackground(Color.PINK);
                buttons[29].setBackground(Color.PINK);
                buttons[30].setBackground(Color.PINK);
                buttons[31].setBackground(Color.PINK);
                buttons[32].setBackground(Color.PINK);
                buttons[33].setBackground(Color.PINK);
                buttons[34].setBackground(Color.PINK);
                buttons[35].setBackground(Color.PINK);
                Mark();

                break;
            case 'u':
                //Unmark all buttons
                buttons[0].setBackground(Color.WHITE);
                buttons[1].setBackground(Color.WHITE);
                buttons[2].setBackground(Color.WHITE);
                buttons[3].setBackground(Color.WHITE);
                buttons[4].setBackground(Color.WHITE);
                buttons[5].setBackground(Color.WHITE);
                buttons[6].setBackground(Color.WHITE);
                buttons[7].setBackground(Color.WHITE);
                buttons[8].setBackground(Color.WHITE);
                buttons[9].setBackground(Color.WHITE);
                buttons[10].setBackground(Color.WHITE);
                buttons[11].setBackground(Color.WHITE);
                buttons[12].setBackground(Color.WHITE);
                buttons[13].setBackground(Color.WHITE);
                buttons[14].setBackground(Color.WHITE);
                buttons[15].setBackground(Color.WHITE);
                buttons[16].setBackground(Color.WHITE);
                buttons[17].setBackground(Color.WHITE);
                buttons[18].setBackground(Color.WHITE);
                buttons[19].setBackground(Color.WHITE);
                buttons[20].setBackground(Color.WHITE);
                buttons[21].setBackground(Color.WHITE);
                buttons[22].setBackground(Color.WHITE);
                buttons[23].setBackground(Color.WHITE);
                buttons[24].setBackground(Color.WHITE);
                buttons[25].setBackground(Color.WHITE);
                buttons[26].setBackground(Color.WHITE);
                buttons[27].setBackground(Color.WHITE);
                buttons[28].setBackground(Color.WHITE);
                buttons[29].setBackground(Color.WHITE);
                buttons[30].setBackground(Color.WHITE);
                buttons[31].setBackground(Color.WHITE);
                buttons[32].setBackground(Color.WHITE);
                buttons[33].setBackground(Color.WHITE);
                buttons[34].setBackground(Color.WHITE);
                buttons[34].setBackground(Color.WHITE);
                Unmark();

                break;
            case 'v':
                View();
                frame2.add(view);
                break;
            case 'r':
                Record();
                frame.add(record);
                break;
            default:


        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case 10:
                //Enter Button
                Enter();
                frame.add(record);
                break;
            /*case 38:
                //Move Up

                break;
            case 40:
                //Move Down

                break;
            case 39:
                //Move Left

                break;
            case 37:
                //Move Right

                break;*/
            default:

        }
    }


    @Override
    public void keyReleased(KeyEvent e) {

    }
}