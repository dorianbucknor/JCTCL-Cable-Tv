package Tv.JCTCL;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Layout extends JFrame {
    private String[] p_text = new String[35];
    private String[] c_text = new String[7];

    public Layout(String title){
        super(title);
        this.setSize(1024, 768);
        this.setLocation(100,100);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

        //Font


        JLabel titleLabel = new JLabel("JCTCL Cable Tv");
        titleLabel.setFont(new Font("Backslash", Font.PLAIN, 32));
        //titleLabel.setFont(Backslash);
        titleLabel.setOpaque(true);
        titleLabel.setLayout(new BorderLayout(50,50));
        JLabel label1 = new JLabel(p_text[0]);
        JLabel cLabel1 = new JLabel(c_text[0]);
        JLabel cLabel2 = new JLabel(c_text[1]);
        JLabel cLabel3 = new JLabel(c_text[2]);
        JLabel cLabel4 = new JLabel(c_text[3]);
        JLabel cLabel5 = new JLabel(c_text[4]);
        JLabel cLabel6 = new JLabel(c_text[5]);
        JLabel cLabel7 = new JLabel(c_text[6]);
        JLabel label2 = new JLabel(p_text[1]);
        JLabel label3 = new JLabel(p_text[2]);
        JLabel label4 = new JLabel(p_text[3]);
        JLabel label5 = new JLabel(p_text[4]);
        JLabel label6 = new JLabel(p_text[5]);
        JLabel label7 = new JLabel(p_text[6]);
        JLabel label8 = new JLabel(p_text[7]);
        JLabel label9 = new JLabel(p_text[8]);
        JLabel label10 = new JLabel(p_text[9]);
        JLabel label11 = new JLabel(p_text[10]);
        JLabel label12 = new JLabel(p_text[11]);
        JLabel label13 = new JLabel(p_text[12]);
        JLabel label14 = new JLabel(p_text[13]);
        JLabel label15 = new JLabel(p_text[14]);
        JLabel label16 = new JLabel(p_text[15]);
        JLabel label17 = new JLabel(p_text[16]);
        JLabel label18 = new JLabel(p_text[17]);
        JLabel label19 = new JLabel(p_text[18]);
        JLabel label20 = new JLabel(p_text[19]);
        JLabel label21 = new JLabel(p_text[20]);
        JLabel label22 = new JLabel(p_text[21]);
        JLabel label23 = new JLabel(p_text[22]);
        JLabel label24 = new JLabel(p_text[23]);
        JLabel label25 = new JLabel(p_text[24]);
        JLabel label26 = new JLabel(p_text[25]);
        JLabel label27 = new JLabel(p_text[26]);
        JLabel label28 = new JLabel(p_text[27]);
        JLabel label29 = new JLabel(p_text[28]);
        JLabel label30 = new JLabel(p_text[29]);
        JLabel label31 = new JLabel(p_text[30]);
        JLabel label32 = new JLabel(p_text[31]);
        JLabel label33 = new JLabel(p_text[32]);
        JLabel label34 = new JLabel(p_text[33]);
        JLabel label35 = new JLabel(p_text[34]);

        Container mainContainer = this.getContentPane();
        mainContainer.setLayout(new BorderLayout(10, 6));
        mainContainer.setBackground(new Color(0, 0, 0, 180));

        //this.getRootPane().setBorder(BorderFactory.createMatteBorder(4,4,4,4,Color.BLACK));


        JPanel topPanel = new JPanel();
        topPanel.setBorder(new LineBorder(new Color(0, 0, 0, 10),3));
        topPanel.setBackground(new Color(0, 0, 0, 100));
        //topPanel.setBounds(0,0,150,100);
        topPanel.setLayout(new FlowLayout(3, 0, 80));
        topPanel.add(titleLabel);
        topPanel.setOpaque(true);
        mainContainer.add(topPanel, BorderLayout.NORTH);

    }

    public static void main(String[] args) {

        Layout screenLayout = new Layout("JCTCL Cable Tv");
        screenLayout.setVisible(true);

        System.out.println(Toolkit.getDefaultToolkit().getFontList());


    }
}
