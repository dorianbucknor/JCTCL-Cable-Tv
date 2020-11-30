package JCTCLTv;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;

public class GUI extends Listing{
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
    private JPanel l1prog;
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
    private JPanel l2prog;
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
    private JPanel l3prog;
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
    private JPanel l4prog;
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
    private JPanel l5prog;
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
    private JPanel l6prog;
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
    private JPanel l7prog;
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
    private JPasswordField passwordField1;
    private JPanel logIn;
    private JPanel logInPanel;
    private JLabel pswdF;
    private JLabel usrNF;
    protected JPanel list;
    protected JScrollPane scroll2;
    protected JScrollPane scroll3;
    protected CardLayout mainLayout = new CardLayout(0,0);

    protected JFrame frame = new JFrame("JCTCL Cable Tv");

    {
        l1pp1.setBackground(ch1P1.progColour);

    }

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

    public GUI(){



        TimeDate();

        mainPanel.setLayout(mainLayout);
        mainPanel.add(loadScreen, "Load Screen");
        mainPanel.add(mainScreen, "Main Screen");
        mainPanel.add(logIn, "Log In");


        l7p5l.setText(ch7P5.getProgName() + " " + ch7P5.getEpisodeTitle());

        l6p1l.setText(ch6P1.getProgName());
        l6pp1.setBackground(ch6P1.getProgColour());

        l6p2l.setText(ch6P2.getProgName());
        l6p2d.setText(ch6P2.getDescription());
        l6pp2.setBackground(ch6P2.getProgColour());


        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        l1p2l.setText(ch1P2.getProgName());


        l1chl.setText(ch1.getChNumber()+" - "+ch1.getChName() + " ");
        l2chl.setText(ch2.getChNumber()+" - "+ch2.getChName()+ " ");
        l3chl.setText(ch3.getChNumber()+" - "+ch3.getChName()+ " ");
        l4chl.setText(ch4.getChNumber()+" - "+ch4.getChName()+ " ");
        l5chl.setText(ch5.getChNumber()+" - "+ch5.getChName()+ " ");
        l6chl.setText(ch6.getChNumber()+" - "+ch6.getChName()+ " ");
        l7chl.setText(ch7.getChNumber()+" - "+ch7.getChName()+ " ");

        mainPanel.setLayout(mainLayout);

        welcometxt.setVisible(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setUndecorated(true);
        frame.add(mainPanel);
        frame.setSize(700, 300);
        frame.setLocationRelativeTo(null);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        frame.setVisible(true);

        LoadScreen();
        //mainLayout.show(mainPanel, "Log In");

    }

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
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                mainLayout.next(mainPanel);

            }
        }
    }

    public static void main(String[] args) {
        GUI gui = new GUI();
    }

}
