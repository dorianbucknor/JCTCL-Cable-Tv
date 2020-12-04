package JCTCLTv;//this package
//import all necessary java files
import javax.swing.*;
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
    private JTextField l6p2d;
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
    private JPanel l1p1e;
    private JTextField l1p1d;
    private JPanel l1pp2;
    private JPanel l1p2i;
    private JPanel l1p2e;
    private JTextField l1p2d;
    private JPanel l1pp3;
    private JLabel l1p3l;
    private JPanel l1p3i;
    private JPanel l1p3e;
    private JTextField l1p3d;
    private JPanel l1pp4;
    private JLabel l1p4l;
    private JPanel l1p4i;
    private JPanel l1p4e;
    private JTextField l1p4d;
    private JPanel l1pp5;
    private JLabel l1p5l;
    private JPanel l1p5i;
    private JPanel l1p5e;
    private JTextField l1p5d;
    private JPanel l2;
    private JPanel l2pp1;
    private JLabel l2p1l;
    private JPanel l2p1i;
    private JPanel l2p1e;
    private JTextField l2p1d;
    private JPanel l2pp2;
    private JLabel l2p2l;
    private JPanel l2p2i;
    private JPanel l2p2e;
    private JTextField l2p2d;
    private JPanel l2pp3;
    private JLabel l2p3l;
    private JPanel l2p3i;
    private JPanel l2p3e;
    private JTextField l2p3d;
    private JPanel l2pp4;
    private JLabel l2p4l;
    private JPanel l2p4i;
    private JPanel l2p4e;
    private JTextField l2p4d;
    private JPanel l2pp5;
    private JLabel l2p5l;
    private JPanel l2p5i;
    private JPanel l2p5e;
    private JTextField l2p5d;
    private JPanel l3;
    private JPanel l3pp1;
    private JLabel l3p1l;
    private JPanel l3p1i;
    private JPanel l3p1e;
    private JTextField l3p1d;
    private JPanel l3pp2;
    private JLabel l3p2l;
    private JPanel l3p2i;
    private JPanel l3p2e;
    private JTextField l3p2d;
    private JPanel l3pp3;
    private JLabel l3p3l;
    private JPanel l3p3i;
    private JPanel l3p3e;
    private JTextField l3p3d;
    private JPanel l3pp4;
    private JLabel l3p4l;
    private JPanel l3p4i;
    private JPanel l3p4e;
    private JTextField l3p4d;
    private JPanel l3pp5;
    private JLabel l3p5l;
    private JPanel l3p5i;
    private JPanel l3p5e;
    private JTextField l3p5d;
    private JPanel l4;
    private JPanel l4pp1;
    private JLabel l4p1l;
    private JPanel l4p1i;
    private JPanel l4p1e;
    private JTextField l4p1d;
    private JPanel l4pp2;
    private JLabel l4p2l;
    private JPanel l4p2i;
    private JPanel l4p2e;
    private JTextField l4p2d;
    private JPanel l4pp3;
    private JLabel l4p3l;
    private JPanel l4p3i;
    private JPanel l4p3e;
    private JTextField l4p3d;
    private JPanel l4pp4;
    private JLabel l4p4l;
    private JPanel l4p4i;
    private JPanel l4p4e;
    private JTextField l4p4d;
    private JPanel l4pp5;
    private JLabel l4p5l;
    private JPanel l4p5i;
    private JPanel l4p5e;
    private JTextField l4p5d;
    private JPanel l5;
    private JPanel l5pp1;
    private JLabel l5p1l;
    private JPanel l5p1i;
    private JPanel l5p1e;
    private JTextField l5p1d;
    private JPanel l5pp2;
    private JLabel l5p2l;
    private JPanel l5p2i;
    private JPanel l5p2e;
    private JTextField l5p2d;
    private JPanel l5pp3;
    private JLabel l5p3l;
    private JPanel l5p3i;
    private JPanel l5p3e;
    private JTextField l5p3d;
    private JPanel l5pp4;
    private JLabel l5p4l;
    private JPanel l5p4i;
    private JPanel l5p4e;
    private JTextField l5p4d;
    private JPanel l5pp5;
    private JLabel l5p5l;
    private JPanel l5p5i;
    private JPanel l5p5e;
    private JTextField l5p5d;
    private JPanel l6;
    private JPanel l6p1i;
    private JPanel l6p1e;
    private JTextField l6p1d;
    private JPanel l6p2i;
    private JPanel l6p2e;
    private JPanel l6pp3;
    private JLabel l6p3l;
    private JPanel l6p3i;
    private JPanel l6p3e;
    private JTextField l6p3d;
    private JPanel l6pp4;
    private JLabel l6p4l;
    private JPanel l6p4i;
    private JPanel l6p4e;
    private JTextField l6p4d;
    private JPanel l6pp5;
    private JLabel l6p5l;
    private JPanel l6p5i;
    private JPanel l6p5e;
    private JTextField l6p5d;
    private JPanel l7;
    private JPanel l7pp1;
    private JLabel l7p1l;
    private JPanel l7p1i;
    private JPanel l7p1e;
    private JTextField l7p1d;
    private JPanel l7pp2;
    private JLabel l7p2l;
    private JPanel l7p2i;
    private JPanel l7p2e;
    private JTextField l7p2d;
    private JPanel l7pp3;
    private JLabel l7p3l;
    private JPanel l7p3i;
    private JPanel l7p3e;
    private JTextField l7p3d;
    private JPanel l7pp4;
    private JLabel l7p4l;
    private JPanel l7p4i;
    private JPanel l7p4e;
    private JTextField l7p4d;
    private JPanel l7pp5;
    private JPanel l7p5i;
    private JPanel l7p5e;
    private JTextField l7p5d;
    private JPanel loadScreen;
    private JPanel mainScreen;
    private JProgressBar progressBar;
    private JLabel welcometxt;
    private JTextField textField1;
    private JPasswordField pswField = new JPasswordField();
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

        l6p1l.setText(ch6P1.getProgName());
        l6p2l.setText(ch6P2.getProgName());
        l6p2d.setText(ch6P2.getDescription());
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        scrollPane.getVerticalScrollBar().setPreferredSize(new Dimension(0,0));
        l1p2l.setText(ch1P2.getProgName());

        l1chl.setText(ch1.getChNumber()+" - "+ch1.getChName() + " ");
        l2chl.setText(ch2.getChNumber()+" - "+ch2.getChName()+ " ");
        l3chl.setText(ch3.getChNumber()+" - "+ch3.getChName()+ " ");
        l4chl.setText(ch4.getChNumber()+" - "+ch4.getChName()+ " ");
        l5chl.setText(ch5.getChNumber()+" - "+ch5.getChName()+ " ");
        l6chl.setText(ch6.getChNumber()+" - "+ch6.getChName()+ " ");
        l7chl.setText(ch7.getChNumber()+" - "+ch7.getChName()+ " ");

        pswField.setEchoChar('*');
        logInPanel.add(pswField);

        welcometxt.setVisible(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setUndecorated(true);
        frame.add(mainPanel);
        frame.setSize(700, 300);
        frame.setLocationRelativeTo(null);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);

        //add key listner for user input
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == 81){
                    System.out.println("Q Pressed");
                    mainLayout.show(mainPanel, "Log In");
                    curCard = "Log In";
                }else{
                    System.out.println("NOOOOOOO");
                }
                System.out.println(e.getKeyChar());
            }
        });

        LoadScreen();
        TimeDate();
        ListingCon();
        ViewPrograms();
    }

    //this method creates and control how the user is able to traverse through the programme listing
    public void ListingCon(){

        Set<KeyStroke> forwardKeys = new HashSet<KeyStroke>();
        Set<KeyStroke> backwardKeys = new HashSet<KeyStroke>();
        Set<KeyStroke> upKeys = new HashSet<KeyStroke>();
        Set<KeyStroke> downKeys = new HashSet<KeyStroke>();

        forwardKeys.add(KeyStroke.getKeyStroke(KeyEvent.VK_D, 0));
        backwardKeys.add(KeyStroke.getKeyStroke(KeyEvent.VK_A, 0));
        upKeys.add(KeyStroke.getKeyStroke(KeyEvent.VK_W, 0));
        downKeys.add(KeyStroke.getKeyStroke(KeyEvent.VK_S, 0));

        l1pp1.requestFocus();

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
        FocusAdapter listener = new Control().DisplayController(mainPanel);

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
        pswField.requestFocus();
        pswField.addKeyListener(new KeyAdapter() {
            char[] psd = {'q','w','e','r','t','y'};
            char[] passw = pswField.getPassword();
            {
                System.out.println("here1");
            }
            @Override
            public void keyPressed(KeyEvent e) {
                pswField.setFocusable(true);
                System.out.println("here2");

                if(e.getKeyCode() == 10 ) {
                    if (Arrays.equals(passw, psd)) {
                        JOptionPane.showMessageDialog(logInPanel, "Hello World.");
                        System.out.println("Hello World");
                        System.out.println("here3");

                        try {
                            File file = new File("Records.csv");
                            if (!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not
                            {
                                System.out.println("not supported");
                                return;
                            }
                            Desktop desktop = Desktop.getDesktop();
                            if (file.exists())         //checks file exists or not
                                desktop.open(file);              //opens the specified file
                        } catch (Exception i) {
                            i.printStackTrace();
                        }
                    }
                    else {
                        JOptionPane.showMessageDialog(logInPanel, "Incorrect Password! Please Enter A Valid Pasword To Continue.");
                    }
                }
                if(e.getKeyCode() == 27){
                    pswField.setFocusable(false);
                    //frame.setFocusable(true);
                    mainLayout.show(mainPanel, "Main Screen");
                    curCard = "Main Screen";
                }
            }
        });
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
    //import and register cutom font used in GUI
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

    public void AssignData(){

      //  String name;
        int chP = 0;
        int pgP = 0;


        String srcval =  "ch"+Integer.toString(chP)+"P"+Integer.toString(pgP);

        List<String> data;



        //Filehandler.getRecord();
    }

    public static void main(String[] args) {
        GUI gui = new GUI();
    }

}
