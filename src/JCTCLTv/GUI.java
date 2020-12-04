package JCTCLTv;//this package
//import all necessary java files
import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollPaneUI;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.*;

public class GUI extends Listing{
    //declare all components and elements used in gui
    protected JPanel mainPanel;
    protected JPanel l1pp1;
    protected JLabel l1chl;
    protected JLabel l1p2l;
    protected JLabel l2chl;
    protected JLabel l3chl;
    protected JLabel l4chl;
    protected JLabel l5chl;
    protected JLabel l6chl;
    protected JPanel l6pp1;
    protected JLabel l6p1l;
    protected JPanel l6pp2;
    protected JLabel l6p2l;
    protected JLabel l7chl;
    protected JLabel l7p5l;
    protected JLabel time;
    protected JLabel date;
    protected JLabel day;
    protected JLabel T1;
    protected JLabel T2;
    protected JLabel T3;
    protected JLabel T4;
    protected JLabel T5;
    private JPanel top;
    private JPanel header;
    private JPanel mainHead;
    private JLabel jctclhead;
    private JPanel datetime;
    private JPanel header2;
    private JLabel chanHead;
    private JPanel _time;
    private JTextArea l6p2d;
    private JScrollPane scrollPane;
    private JPanel display;
    private JPanel channels;
    private JPanel chanNum;
    private JPanel l1ch;
    private JPanel l2ch;
    private JPanel l3ch;
    private JPanel l4ch;
    private JPanel l5ch;
    private JPanel l6ch;
    private JPanel l7ch;
    private JPanel progs;
    private JPanel l1;
    private JLabel l1p1l;
    private JPanel l1p1i;
    private JTextArea l1p1d;
    private JPanel l1pp2;
    private JPanel l1p2i;
    private JTextArea l1p2d;
    private JPanel l1pp3;
    private JLabel l1p3l;
    private JPanel l1p3i;
    private JTextArea l1p3d;
    private JPanel l1pp4;
    private JLabel l1p4l;
    private JPanel l1p4i;
    private JTextArea l1p4d;
    private JPanel l1pp5;
    private JLabel l1p5l;
    private JPanel l1p5i;
    private JTextArea l1p5d;
    private JPanel l2;
    private JPanel l2pp1;
    private JLabel l2p1l;
    private JPanel l2p1i;
    private JTextArea l2p1d;
    private JPanel l2pp2;
    private JLabel l2p2l;
    private JPanel l2p2i;
    private JTextArea l2p2d;
    private JPanel l2pp3;
    private JLabel l2p3l;
    private JPanel l2p3i;
    private JTextArea l2p3d;
    private JPanel l2pp4;
    private JLabel l2p4l;
    private JPanel l2p4i;
    private JTextArea l2p4d;
    private JPanel l2pp5;
    private JLabel l2p5l;
    private JPanel l2p5i;
    private JTextArea l2p5d;
    private JPanel l3;
    private JPanel l3pp1;
    private JLabel l3p1l;
    private JPanel l3p1i;
    private JTextArea l3p1d;
    private JPanel l3pp2;
    private JLabel l3p2l;
    private JPanel l3p2i;
    private JTextArea l3p2d;
    private JPanel l3pp3;
    private JLabel l3p3l;
    private JPanel l3p3i;
    private JTextArea l3p3d;
    private JPanel l3pp4;
    private JLabel l3p4l;
    private JPanel l3p4i;
    private JTextArea l3p4d;
    private JPanel l3pp5;
    private JLabel l3p5l;
    private JPanel l3p5i;
    private JTextArea l3p5d;
    private JPanel l4;
    private JPanel l4pp1;
    private JLabel l4p1l;
    private JPanel l4p1i;
    private JTextArea l4p1d;
    private JPanel l4pp2;
    private JLabel l4p2l;
    private JPanel l4p2i;
    private JTextArea l4p2d;
    private JPanel l4pp3;
    private JLabel l4p3l;
    private JPanel l4p3i;
    private JTextArea l4p3d;
    private JPanel l4pp4;
    private JLabel l4p4l;
    private JPanel l4p4i;
    private JTextArea l4p4d;
    private JPanel l4pp5;
    private JLabel l4p5l;
    private JPanel l4p5i;
    private JTextArea l4p5d;
    private JPanel l5;
    private JPanel l5pp1;
    private JLabel l5p1l;
    private JPanel l5p1i;
    private JTextArea l5p1d;
    private JPanel l5pp2;
    private JLabel l5p2l;
    private JPanel l5p2i;
    private JTextArea l5p2d;
    private JPanel l5pp3;
    private JLabel l5p3l;
    private JPanel l5p3i;
    private JTextArea l5p3d;
    private JPanel l5pp4;
    private JLabel l5p4l;
    private JPanel l5p4i;
    private JTextArea l5p4d;
    private JPanel l5pp5;
    private JLabel l5p5l;
    private JPanel l5p5i;
    private JTextArea l5p5d;
    private JPanel l6;
    private JPanel l6p1i;
    private JTextArea l6p1d;
    private JPanel l6p2i;
    private JPanel l6pp3;
    private JLabel l6p3l;
    private JPanel l6p3i;
    private JTextArea l6p3d;
    private JPanel l6pp4;
    private JLabel l6p4l;
    private JPanel l6p4i;
    private JTextArea l6p4d;
    private JPanel l6pp5;
    private JLabel l6p5l;
    private JPanel l6p5i;
    private JTextArea l6p5d;
    private JPanel l7;
    private JPanel l7pp1;
    private JLabel l7p1l;
    private JPanel l7p1i;
    private JTextArea l7p1d;
    private JPanel l7pp2;
    private JLabel l7p2l;
    private JPanel l7p2i;
    private JTextArea l7p2d;
    private JPanel l7pp3;
    private JLabel l7p3l;
    private JPanel l7p3i;
    private JTextArea l7p3d;
    private JPanel l7pp4;
    private JLabel l7p4l;
    private JPanel l7p4i;
    private JTextArea l7p4d;
    private JPanel l7pp5;
    private JPanel l7p5i;
    private JTextArea l7p5d;
    private JPanel loadScreen;
    private JPanel mainScreen;
    private JProgressBar progressBar;
    private JLabel welcometxt;
    private JTextField usrnm;
    private JPasswordField pswField;
    private JPanel logIn;
    private JPanel logInPanel;
    private JLabel pswdF;
    private JLabel usrNF;
    protected JPanel list;
    protected JScrollPane scroll2;
    protected JScrollPane scroll3;
    protected static CardLayout mainLayout = new CardLayout(0,0);
    protected static String curCard = "Load Screen";
    protected JFrame frame = new JFrame("JCTCL Cable Tv");


    //default construct creates, initializes and controls the whloe GUI
    public GUI(){

        curCard = "Load Screen";
        mainPanel.setLayout(mainLayout);
        mainPanel.add(loadScreen, "Load Screen");
        mainPanel.add(mainScreen, "Main Screen");
        mainPanel.add(logIn, "Log In");

        l7p5l.setText(ch7P5.getProgName() + " " + ch7P5.getEpisodeTitle());

        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        scrollPane.getVerticalScrollBar().setPreferredSize(new Dimension(0,0));
        scrollPane.getHorizontalScrollBar().setUnitIncrement(16);
        scrollPane.getHorizontalScrollBar().setPreferredSize(new Dimension(0,0));


        l1chl.setText(ch1.getChNumber()+" - "+ch1.getChName() + " ");
        l2chl.setText(ch2.getChNumber()+" - "+ch2.getChName()+ " ");
        l3chl.setText(ch3.getChNumber()+" - "+ch3.getChName()+ " ");
        l4chl.setText(ch4.getChNumber()+" - "+ch4.getChName()+ " ");
        l5chl.setText(ch5.getChNumber()+" - "+ch5.getChName()+ " ");
        l6chl.setText(ch6.getChNumber()+" - "+ch6.getChName()+ " ");
        l7chl.setText(ch7.getChNumber()+" - "+ch7.getChName()+ " ");

        pswField.setEchoChar('*');

        welcometxt.setVisible(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setUndecorated(true);
        frame.add(mainPanel);
        frame.setLocationRelativeTo(null);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);

        LoadScreen();
        TimeDate();
        ListingCon();
        ViewPrograms();
        l1pp1.requestFocus();
    }

    //this method creates and control how the user is able to traverse through the programme listing
    public void ListingCon(){

        Set<KeyStroke> forwardKeys = new HashSet<KeyStroke>();
        Set<KeyStroke> backwardKeys = new HashSet<KeyStroke>();
        Set<KeyStroke> upKeys = new HashSet<KeyStroke>();
        Set<KeyStroke> downKeys = new HashSet<KeyStroke>();

        forwardKeys.add(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, 0));
        backwardKeys.add(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, 0));
        upKeys.add(KeyStroke.getKeyStroke(KeyEvent.VK_UP, 0));
        downKeys.add(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, 0));

        progs.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, forwardKeys);
        progs.setFocusTraversalKeys(KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS, backwardKeys);
        progs.setFocusTraversalKeys(KeyboardFocusManager.UP_CYCLE_TRAVERSAL_KEYS, upKeys);
        progs.setFocusTraversalKeys(KeyboardFocusManager.DOWN_CYCLE_TRAVERSAL_KEYS, downKeys);

        Vector<Component> chanOrder = new Vector<>(7);
        chanOrder.add(l1);
        l1.setName("ch1");
        chanOrder.add(l1pp1);
        l1pp1.setName("ch1P1");
        chanOrder.add(l1pp2);
        l1pp2.setName("ch1P2");
        chanOrder.add(l1pp3);
        l1pp3.setName("ch1P3");
        chanOrder.add(l1pp4);
        l1pp4.setName("ch1P4");
        chanOrder.add(l1pp5);
        l1pp5.setName("ch1P5");

        chanOrder.add(l2);
        l2.setName("ch2");
        chanOrder.add(l2pp1);
        chanOrder.add(l2pp2);
        chanOrder.add(l2pp3);
        chanOrder.add(l2pp4);
        chanOrder.add(l2pp5);
        l2pp1.setName("ch2P1");
        l2pp2.setName("ch2P2");
        l2pp3.setName("ch2P3");
        l2pp4.setName("ch2P4");
        l2pp5.setName("ch2P5");

        chanOrder.add(l3);
        l3.setName("ch3");
        chanOrder.add(l3pp1);
        chanOrder.add(l3pp2);
        chanOrder.add(l3pp3);
        chanOrder.add(l3pp4);
        chanOrder.add(l3pp5);
        l3pp1.setName("ch3P1");
        l3pp2.setName("ch3P2");
        l3pp3.setName("ch3P3");
        l3pp4.setName("ch3P4");
        l3pp5.setName("ch3P5");

        chanOrder.add(l4);
        l4.setName("ch4");
        chanOrder.add(l4pp1);
        chanOrder.add(l4pp2);
        chanOrder.add(l4pp3);
        chanOrder.add(l4pp4);
        chanOrder.add(l4pp5);
        l4pp1.setName("ch4P1");
        l4pp2.setName("ch4P2");
        l4pp3.setName("ch4P3");
        l4pp4.setName("ch4P4");
        l4pp5.setName("ch4P5");

        chanOrder.add(l5);
        l5.setName("ch5");
        chanOrder.add(l5pp1);
        chanOrder.add(l5pp2);
        chanOrder.add(l5pp3);
        chanOrder.add(l5pp4);
        chanOrder.add(l5pp5);
        l5pp1.setName("ch5P1");
        l5pp2.setName("ch5P2");
        l5pp3.setName("ch5P3");
        l5pp4.setName("ch5P4");
        l5pp5.setName("ch5P5");

        chanOrder.add(l6);
        l6.setName("ch6");
        chanOrder.add(l6pp1);
        chanOrder.add(l6pp2);
        chanOrder.add(l6pp3);
        chanOrder.add(l6pp4);
        chanOrder.add(l6pp5);
        l6pp1.setName("ch6P1");
        l6pp2.setName("ch6P2");
        l6pp3.setName("ch6P3");
        l6pp4.setName("ch6P4");
        l6pp5.setName("ch6P5");

        chanOrder.add(l7);
        l7.setName("ch7");
        chanOrder.add(l7pp1);
        chanOrder.add(l7pp2);
        chanOrder.add(l7pp3);
        chanOrder.add(l7pp4);
        chanOrder.add(l7pp5);
        l7pp1.setName("ch7P1");
        l7pp2.setName("ch7P2");
        l7pp3.setName("ch7P3");
        l7pp4.setName("ch7P4");
        l7pp5.setName("ch7P5");

        CustomTraversalPolicy chanPol = new CustomTraversalPolicy(chanOrder);
        progs.setFocusTraversalPolicy(chanPol);
        FocusAdapter listener = new Control().DisplayController(mainPanel, frame);

        l1.addFocusListener(listener);
        l2.addFocusListener(listener);
        l3.addFocusListener(listener);
        l4.addFocusListener(listener);
        l5.addFocusListener(listener);
        l6.addFocusListener(listener);
        l7.addFocusListener(listener);
        l1pp1.addFocusListener(listener);
        l1pp2.addFocusListener(listener);
        l1pp3.addFocusListener(listener);
        l1pp4.addFocusListener(listener);
        l1pp5.addFocusListener(listener);
        l2pp1.addFocusListener(listener);
        l2pp2.addFocusListener(listener);
        l2pp3.addFocusListener(listener);
        l2pp4.addFocusListener(listener);
        l2pp5.addFocusListener(listener);
        l3pp1.addFocusListener(listener);
        l3pp2.addFocusListener(listener);
        l3pp3.addFocusListener(listener);
        l3pp4.addFocusListener(listener);
        l3pp5.addFocusListener(listener);
        l4pp1.addFocusListener(listener);
        l4pp2.addFocusListener(listener);
        l4pp3.addFocusListener(listener);
        l4pp4.addFocusListener(listener);
        l4pp5.addFocusListener(listener);
        l5pp1.addFocusListener(listener);
        l5pp2.addFocusListener(listener);
        l5pp3.addFocusListener(listener);
        l5pp4.addFocusListener(listener);
        l5pp5.addFocusListener(listener);
        l6pp1.addFocusListener(listener);
        l6pp2.addFocusListener(listener);
        l6pp3.addFocusListener(listener);
        l6pp4.addFocusListener(listener);
        l6pp5.addFocusListener(listener);
        l7pp1.addFocusListener(listener);
        l7pp2.addFocusListener(listener);
        l7pp3.addFocusListener(listener);
        l7pp4.addFocusListener(listener);
        l7pp5.addFocusListener(listener);


        AssignData();
    }

    //controls the time and displayed on gui
    public void TimeDate(){

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        DateTimeFormatter tFormatter = DateTimeFormatter.ofPattern("hh:mm a");
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        DateTimeFormatter dayFormatter = DateTimeFormatter.ofPattern("EEEE");
        Clock clock = Clock.tickSeconds(ZoneId.systemDefault());
        clock.instant();

        LocalDateTime Date = LocalDateTime.now();
        LocalDateTime Day = LocalDateTime.now();
        LocalDateTime Time = LocalDateTime.now();
        LocalDateTime LTime = LocalDateTime.now();

        time.setText(Time.format(timeFormatter));
        date.setText(Date.format(dateFormatter));
        day.setText(Day.format(dayFormatter));
        T1.setText(LTime.minusSeconds(17280).format(tFormatter) + " - " + LTime.format(tFormatter));
        T2.setText(LTime.format(tFormatter) + " - " + LTime.plusSeconds(17280).format(tFormatter));
        T3.setText(LTime.plusSeconds(17280).format(tFormatter) + " - " + LTime.plusSeconds(34560).format(tFormatter));
        T4.setText(LTime.plusSeconds(34560).format(tFormatter) + " - " + LTime.plusSeconds(51840).format(tFormatter));
        T5.setText(LTime.plusSeconds(51840).format(tFormatter) + " - " + LTime.plusSeconds(69120).format(tFormatter));
    }
    //log in controller to view programme listing file
    public void ViewPrograms(){
        //
        KeyAdapter cred = new KeyAdapter() {
            char[] psd = {'q','w','e','r','t','y'};

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == 10) {
                    if (Arrays.equals(pswField.getPassword(), psd)) {
                        JOptionPane.showMessageDialog(logInPanel, "Hello, "+usrnm.getText()+". File Loading...");
                        try {
                            File file = new File("ListingData.csv");
                            if (!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not
                            {
                                System.out.println("not supported");
                                return;
                            }
                            Desktop desktop = Desktop.getDesktop();
                            if (file.exists()) {      //checks file exists or not
                                desktop.open(file);

                                mainLayout.show(mainPanel, "Main Screen");
                                progs.setFocusable(true);
                                curCard = "Main Screen";
                            }
                        } catch (Exception i) {
                            i.printStackTrace();
                        }
                    }
                    else {
                        JOptionPane.showMessageDialog(logInPanel, "Incorrect Password! Please Enter A Valid Password To Continue.");
                    }
                }
                if(e.getKeyCode() == 27){
                    mainLayout.show(mainPanel, "Main Screen");
                    curCard = "Main Screen";
                }
            }
        };
        logInPanel.addKeyListener(cred);
        pswField.addKeyListener(cred);
        usrnm.addKeyListener(cred);
    }

    //creates and controls a modern looking load screen
    public void LoadScreen(){

        long pMils = 80;
        for (int i = 0; i < 101; i++){
            progressBar.setValue(i - 1);
            try {
                Thread.sleep(pMils);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i == 20 || i == 43 || i ==72){i = i + 20;}
            if (i > 95){
                pMils = 150;
            }

            if(i == 100){
                //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                progressBar.setVisible(false);
                welcometxt.setVisible(true);
                try {
                    Thread.sleep(3000);
                    mainLayout.show(mainPanel, "Main Screen");
                    curCard = "Main Screen";
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    //import and register custom font used in GUI
    public static void Fonts()
    {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        try
        {
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("NovaSquare.ttf")));
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Ikaros-Regular.ttf")));
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File( "EUROSWH.TTF")));
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File( "DODGER.TTF")));
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File( "Backslash.ttf")));
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File( "Anita semi square.ttf")));
        }
        catch (IOException | FontFormatException ex)
        {
            System.out.println("Unexpected exception loading fonts"+ ex);
        }
    }
    public void setColors(String color, Component pan){
        switch (color){
            case "Blue":
                pan.setBackground(new Color(0,0,255,50));
                break;
            case "Green":
                pan.setBackground(new Color(0,255,0,50));
                break;
            case "White":
                pan.setBackground(new Color(255,255,255,100));
                break;
            case "Red":
                pan.setBackground(new Color(255,0,0,50));
                break;
            case "Purple":
                pan.setBackground(new Color(200,0,200,50));
                break;
            case "Yellow":
                pan.setBackground(new Color(255,255,0,50));
                break;
            default:
                pan.setBackground(Color.WHITE);
                break;
        }
    }

    public void AssignData(){

        String[] data = null;

        for (int p = 0; p < 7; p++) {
            for(int q = 0; q < 5; q++){
             String srcval =  "ch"+Integer.toString(p+1)+"P"+Integer.toString(q+1);
            data = CsvHandler.getData(srcval, "ListingData.csv");
            if (data[0].equals(l1pp1.getName())) {
                l1p1l.setText(data[1]);
                l1p1d.setText("Description: "+data[5]+"\n"+"Period: "+data[7]+"\n"+"Length: "+data[15]);
                setColors(data[2], l1pp1);
            }
            if (data[0].equals(l1pp2.getName())) {
                l1p2l.setText(data[1]);
                l1p2d.setText("Description: "+data[5]+"\n"+"Period: "+data[7]+"\n"+"Length: "+data[15]);
                setColors(data[2], l1pp2);
            }
            if (data[0].equals(l1pp3.getName())) {
                l1p3l.setText(data[1]);
                l1p3d.setText("Description: "+data[5]+"\n"+"Period: "+data[7]+"\n"+"Length: "+data[15]);
                setColors(data[2], l1pp3);
            }
            if (data[0].equals(l1pp4.getName())) {
                l1p4l.setText(data[1]);
                l1p4d.setText("Description: "+data[5]+"\n"+"Period: "+data[7]+"\n"+"Length: "+data[15]);
                setColors(data[2], l1pp4);
            }
            if (data[0].equals(l1pp5.getName())) {
                l1p5l.setText(data[1]);
                l1p5d.setText("Description: "+data[5]+"\n"+"Period: "+data[7]+"\n"+"Length: "+data[15]);
                setColors(data[2], l1pp5);
            }
            if (data[0].equals(l2pp1.getName())) {
                l2p1l.setText(data[1]);
                l2p1d.setText("Description: "+data[5]+"\n"+"Severity Rating: "+data[14]+"\n"+"Length: "+data[15]);
                setColors(data[2], l2pp1);

            }
            if (data[0].equals(l2pp2.getName())) {
                l2p2l.setText(data[1]);
                l2p2d.setText("Description: "+data[5]+"\n"+"Severity Rating: "+data[14]+"\n"+"Length: "+data[15]);
                setColors(data[2], l2pp2);

            }
            if (data[0].equals(l2pp3.getName())) {
                l2p3l.setText(data[1]);
                l2p3d.setText("Description: "+data[5]+"\n"+"Severity Rating: "+data[14]+"\n"+"Length: "+data[15]);
                setColors(data[2], l2pp3);
            }
            if (data[0].equals(l2pp4.getName())) {
                l2p4l.setText(data[1]);
                l2p4d.setText("Description: "+data[5]+"\n"+"Severity Rating: "+data[14]+"\n"+"Length: "+data[15]);
                setColors(data[2], l2pp4);
            }
            if (data[0].equals(l2pp5.getName())) {
                l2p5l.setText(data[1]);
                l2p5d.setText("Description: "+data[5]+"\n"+"Severity Rating: "+data[14]+"\n"+"Length: "+data[15]);
                setColors(data[2], l2pp5);
            }
            if (data[0].equals(l3pp1.getName())) {
                l3p1l.setText(data[1]);
                l3p1d.setText("Description: "+data[5]+"\n"+"Denomination: "+data[11]+"\n"+"Length: "+data[15]);
                setColors(data[2], l3pp1);
            }
            if (data[0].equals(l3pp2.getName())) {
                l3p2l.setText(data[1]);
                l3p2d.setText("Description: "+data[5]+"\n"+"Denomination: "+data[11]+"\n"+"Length: "+data[15]);
                setColors(data[2], l3pp2);
            }
            if (data[0].equals(l3pp3.getName())) {
                l3p3l.setText(data[1]);
                l3p3d.setText("Description: "+data[5]+"\n"+"Denomination: "+data[11]+"\n"+"Length: "+data[15]);
                setColors(data[2], l3pp3);
            }
            if (data[0].equals(l3pp4.getName())) {
                l3p4l.setText(data[1]);
                l3p4d.setText("Description: "+data[5]+"\n"+"Denomination: "+data[11]+"\n"+"Length: "+data[15]);
                setColors(data[2], l3pp4);
            }
            if (data[0].equals(l3pp5.getName())) {
                l3p5l.setText(data[1]);
                l3p5d.setText("Description: "+data[5]+"\n"+"Denomination: "+data[11]+"\n"+"Length: "+data[15]);
                setColors(data[2], l3pp5);
            }
            if (data[0].equals(l4pp1.getName())) {
                l4p1l.setText(data[1]);
                l4p1d.setText("Description: "+data[5]+"\n"+"Age Range: "+data[12]+"\n"+"Length: "+data[15]);
                setColors(data[2], l4pp1);
            }
            if (data[0].equals(l4pp2.getName())) {
                l4p2l.setText(data[1]);
                l4p2d.setText("Description: "+data[5]+"\n"+"Period: "+data[7]+"\n"+"Length: "+data[15]);
                setColors(data[2], l4pp2);
            }
            if (data[0].equals(l4pp3.getName())) {
                l4p3l.setText(data[1]);
                l4p3d.setText("Description: "+data[5]+"\n"+"Severity Rating: "+data[14]+"\n"+"Length: "+data[15]);
                setColors(data[2], l4pp3);
            }
            if (data[0].equals(l4pp4.getName())) {
                l4p4l.setText(data[1]);
                l4p4d.setText("Description: "+data[5]+"\n"+"Rating: "+data[8]+"\n"+"Actors: "+data[10]+"\n"+"Release Date: "+data[13]+"\n"+"Length: "+data[15]);
                setColors(data[2], l4pp4);
            }
            if (data[0].equals(l4pp5.getName())) {
                l4p5l.setText(data[1]);
                l4p5d.setText("Description: "+data[5]+"\n"+"Rating: "+data[8]+"\n"+"Actors: "+data[10]+"\n"+"Release Date: "+data[13]+"\n"+"Length: "+data[15]);
                setColors(data[2], l4pp5);
            }
            if (data[0].equals(l5pp1.getName())) {
                l5p1l.setText(data[1]);
                l5p1d.setText("Description: "+data[5]+"\n"+"Age Range: "+data[12]+"\n"+"Length: "+data[15]);
                setColors(data[2], l5pp1);
            }
            if (data[0].equals(l5pp2.getName())) {
                l5p2l.setText(data[1]);
                l5p2d.setText("Description: "+data[5]+"\n"+"Age Range: "+data[12]+"\n"+"Length: "+data[15]);
                setColors(data[2], l5pp2);
            }
            if (data[0].equals(l5pp3.getName())) {
                l5p3l.setText(data[1]);
                l5p3d.setText("Description: "+data[5]+"\n"+"Age Range: "+data[12]+"\n"+"Length: "+data[15]);
                setColors(data[2], l5pp3);
            }
            if (data[0].equals(l5pp4.getName())) {
                l5p4l.setText(data[1]);
                l5p4d.setText("Description: "+data[5]+"\n"+"Age Range: "+data[12]+"\n"+"Length: "+data[15]);
                setColors(data[2], l5pp4);
            }
            if (data[0].equals(l5pp5.getName())) {
                l5p5l.setText(data[1]);
                l5p5d.setText("Description: "+data[5]+"\n"+"Age Range: "+data[12]+"\n"+"Length: "+data[15]);
                setColors(data[2], l5pp5);
            }
            if (data[0].equals(l6pp1.getName())) {
                l6p1l.setText(data[1]);
                l6p1d.setText("Description: "+data[5]+"\n"+"Rating: "+data[8]+"\n"+"Actors: "+data[10]+"\n"+"Release Date: "+data[13]+"\n"+"Length: "+data[15]);
                setColors(data[2], l6pp1);
            }
            if (data[0].equals(l6pp2.getName())) {
                l6p2l.setText(data[1]);
                l6p2d.setText("Description: "+data[5]+"\n"+"Rating: "+data[8]+"\n"+"Actors: "+data[10]+"\n"+"Release Date: "+data[13]+"\n"+"Length: "+data[15]);
                setColors(data[2], l6pp2);
            }
            if (data[0].equals(l6pp3.getName())) {
                l6p3l.setText(data[1]);
                l6p3d.setText("Description: "+data[5]+"\n"+"Rating: "+data[8]+"\n"+"Actors: "+data[10]+"\n"+"Release Date: "+data[13]+"\n"+"Length: "+data[15]);
                setColors(data[2], l6pp3);
            }
            if (data[0].equals(l6pp4.getName())) {
                l6p4l.setText(data[1]);
                l6p4d.setText("Description: "+data[5]+"\n"+"Rating: "+data[8]+"\n"+"Actors: "+data[10]+"\n"+"Release Date: "+data[13]+"\n"+"Length: "+data[15]);
                setColors(data[2], l6pp4);
            }
            if (data[0].equals(l6pp5.getName())) {
                l6p5l.setText(data[1]);
                l6p5d.setText("Description: "+data[5]+"\n"+"Rating: "+data[8]+"\n"+"Actors: "+data[10]+"\n"+"Release Date: "+data[13]+"\n"+"Length: "+data[15]);
                setColors(data[2], l6pp5);
            }
            if (data[0].equals(l7pp1.getName())) {
                l7p1l.setText(data[1]);
                l7p1d.setText("Description: "+data[5]+"\n"+"Rating: "+data[8]+"\n"+"Actors: "+data[10]+"\n"+"Episode: "+data[9]+"\n"+"Length: "+data[15]);
                setColors(data[2], l7pp1);
            }
            if (data[0].equals(l7pp2.getName())) {
                l7p2l.setText(data[1]);
                l7p2d.setText("Description: "+data[5]+"\n"+"Rating: "+data[8]+"\n"+"Actors: "+data[10]+"\n"+"Episode: "+data[9]+"\n"+"Length: "+data[15]);
                setColors(data[2], l7pp2);
            }
            if (data[0].equals(l7pp3.getName())) {
                l7p3l.setText(data[1]);
                l7p3d.setText("Description: "+data[5]+"\n"+"Rating: "+data[8]+"\n"+"Actors: "+data[10]+"\n"+"Episode: "+data[9]+"\n"+"Length: "+data[15]);
                setColors(data[2], l7pp3);
            }
            if (data[0].equals(l7pp4.getName())) {
                l7p4l.setText(data[1]);
                l7p4d.setText("Description: "+data[5]+"\n"+"Rating: "+data[8]+"\n"+"Actors: "+data[10]+"\n"+"Episode: "+data[9]+"\n"+"Length: "+data[15]);
                setColors(data[2], l7pp4);}
            if (data[0].equals(l7pp5.getName())) {
                l7p5l.setText(data[1]);
                l7p5d.setText("Description: "+data[5]+"\n"+"Rating: "+data[8]+"\n"+"Actors: "+data[10]+"\n"+"Episode: "+data[9]+"\n"+"Length: "+data[15]);
                setColors(data[2], l7pp5);
            }
            }
        }
    }
}
