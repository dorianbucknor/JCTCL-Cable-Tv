package JCTCLTv;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class GUI extends Listing{
    protected JPanel mainPanel;
    protected JPanel l1;
    protected JPanel l1ch;
    protected JPanel l1prog;
    protected JPanel l1pp1;
    protected JPanel l1pp2;
    protected JPanel l1pp3;
    protected JPanel l1pp4;
    protected JPanel l1pp5;
    protected JPanel l1p1e;
    protected JPanel l1p1i;
    protected JLabel l1p1l;
    protected JLabel l1chl;
    protected JLabel l1p2l;
    protected JPanel l1p2e;
    protected JPanel l1p2i;
    protected JLabel l1p3l;
    protected JPanel l1p3i;
    protected JPanel l1p3e;
    protected JLabel l1p4l;
    protected JPanel l1p4i;
    protected JPanel l1p4e;
    protected JLabel l1p5l;
    protected JPanel l1p5i;
    protected JPanel l1p5e;
    protected JPanel l2;
    protected JPanel l2ch;
    protected JLabel l2chl;
    protected JPanel l2prog;
    protected JPanel l2pp1;
    protected JLabel l2p1l;
    protected JPanel l2p1i;
    protected JPanel l2p1e;
    protected JPanel l2pp2;
    protected JLabel l2p2l;
    protected JPanel l2p2i;
    protected JPanel l2p2e;
    protected JPanel l2pp3;
    protected JLabel l2p3l;
    protected JPanel l2p3e;
    protected JPanel l2p3i;
    protected JPanel l2pp4;
    protected JLabel l2p4l;
    protected JPanel l2p4i;
    protected JPanel l2p4e;
    protected JPanel l2pp5;
    protected JLabel l2p5l;
    protected JPanel l2p5i;
    protected JPanel l2p5e;
    protected JPanel top;
    protected JPanel l3;
    protected JPanel l3ch;
    protected JLabel l3chl;
    protected JPanel l3prog;
    protected JPanel l3pp1;
    protected JLabel l3p1l;
    protected JPanel l3p1i;
    protected JPanel l3p1e;
    protected JPanel l3pp2;
    protected JLabel l3p2l;
    protected JPanel l3p2i;
    protected JPanel l3p2e;
    protected JPanel l3pp3;
    protected JLabel l3p3l;
    protected JPanel l3p3i;
    protected JPanel l3p3e;
    protected JPanel l3pp4;
    protected JLabel l3p4l;
    protected JPanel l3p4i;
    protected JPanel l3p4e;
    protected JPanel l3pp5;
    protected JLabel l3p5l;
    protected JPanel l3p5i;
    protected JPanel l3p5e;
    protected JPanel l4;
    protected JPanel l5;
    protected JPanel l6;
    protected JPanel l7;
    protected JPanel l4ch;
    protected JLabel l4chl;
    protected JPanel l4prog;
    protected JPanel l4pp1;
    protected JLabel l4p1l;
    protected JPanel l4p1i;
    protected JPanel l4p1e;
    protected JPanel l4pp2;
    protected JLabel l4p2l;
    protected JPanel l4p2i;
    protected JPanel l4p2e;
    protected JPanel l4pp3;
    protected JLabel l4p3l;
    protected JPanel l4p3i;
    protected JPanel l4p3e;
    protected JPanel l4pp4;
    protected JLabel l4p4l;
    protected JPanel l4p4i;
    protected JPanel l4p4e;
    protected JPanel l4pp5;
    protected JLabel l4p5l;
    protected JPanel l4p5i;
    protected JPanel l4p5e;
    protected JPanel l5ch;
    protected JLabel l5chl;
    protected JPanel l5prog;
    protected JPanel l5pp1;
    protected JLabel l5p1l;
    protected JPanel l5p1i;
    protected JPanel l5p1e;
    protected JPanel l5pp2;
    protected JLabel l5p2l;
    protected JPanel l5p2i;
    protected JPanel l5p2e;
    protected JPanel l5pp3;
    protected JLabel l5p3l;
    protected JPanel l5p3i;
    protected JPanel l5p3e;
    protected JPanel l5pp4;
    protected JLabel l5p4l;
    protected JPanel l5p4i;
    protected JPanel l5p4e;
    protected JPanel l5pp5;
    protected JLabel l5p5l;
    protected JPanel l5p5i;
    protected JPanel l5p5e;
    protected JPanel l6ch;
    protected JLabel l6chl;
    protected JPanel l6prog;
    protected JPanel l6pp1;
    protected JLabel l6p1l;
    protected JPanel l6p1i;
    protected JPanel l6p1e;
    protected JPanel l6pp2;
    protected JLabel l6p2l;
    protected JPanel l6p2i;
    protected JPanel l6p2e;
    protected JPanel l6pp3;
    protected JLabel l6p3l;
    protected JPanel l6p3i;
    protected JPanel l6p3e;
    protected JPanel l6pp4;
    protected JLabel l6p4l;
    protected JPanel l6p4i;
    protected JPanel l6p4e;
    protected JPanel l6pp5;
    protected JLabel l6p5l;
    protected JPanel l6p5i;
    protected JPanel l6p5e;
    protected JPanel l7ch;
    protected JLabel l7chl;
    protected JPanel l7prog;
    protected JPanel l7pp1;
    protected JLabel l7p1l;
    protected JPanel l7p1i;
    protected JPanel l7p1e;
    protected JPanel l7pp2;
    protected JLabel l7p2l;
    protected JPanel l7p2i;
    protected JPanel l7p2e;
    protected JPanel l7pp3;
    protected JLabel l7p3l;
    protected JPanel l7p3i;
    protected JPanel l7p3e;
    protected JPanel l7pp4;
    protected JLabel l7p4l;
    protected JPanel l7p4i;
    protected JPanel l7p4e;
    protected JPanel l7pp5;
    protected JLabel l7p5l;
    protected JPanel l7p5e;
    protected JPanel l7p5i;
    protected JPanel channels;
    protected JPanel progs;
    protected JPanel chanNum;
    protected JPanel display;
    protected JLabel time;
    protected JLabel date;
    protected JLabel day;
    protected JPanel datetime;
    protected JLabel jctclhead;
    protected JPanel mainHead;
    protected JPanel header;
    protected JPanel header2;
    protected JLabel T1;
    protected JLabel T2;
    protected JLabel T3;
    protected JLabel T4;
    protected JLabel T5;
    protected JPanel _time;
    private JLabel chanHead;
    private JLabel l6p2d;
    private JTextField textField1;
    protected JPanel list;
    protected JScrollPane scroll2;
    protected JScrollPane scroll3;

    protected JFrame frame = new JFrame("JCTCL Cable Tv");

    public void TimeDate(){

        /*SimpleDateFormat dtFormat = new SimpleDateFormat("MMMMM dd, yyyy");
        SimpleDateFormat dFormat = new SimpleDateFormat("EEEEE");
        SimpleDateFormat tFormat = new SimpleDateFormat("h:mm:ss a");
        date.setText(dtFormat.format(new Date()));
        day.setText(dFormat.format(new Date()));
        time.setText(_Time);*/

        LocalDateTime date = LocalDateTime.now();
        LocalDateTime day = LocalDateTime.now();
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss a");
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        DateTimeFormatter dayFormatter = DateTimeFormatter.ofPattern("EEEE");
        date.format(dateFormatter);
        day.format(dayFormatter);
        time.format(timeFormatter);



    }

    public GUI(){

        TimeDate();

        l6p1l.setText(ch6P1.getProgName());

        l6p2l.setText(ch6P2.getProgName());


        l1p2l.setText(ch1P2.getProgName());


        l1chl.setText(ch1.getChNumber()+" - "+ch1.getChName());
        l2chl.setText(ch2.getChNumber()+" - "+ch2.getChName());
        l3chl.setText(ch3.getChNumber()+" - "+ch3.getChName());
        l4chl.setText(ch4.getChNumber()+" - "+ch4.getChName());
        l5chl.setText(ch5.getChNumber()+" - "+ch5.getChName());
        l6chl.setText(ch6.getChNumber()+" - "+ch6.getChName());
        l7chl.setText(ch7.getChNumber()+" - "+ch7.getChName());



        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setUndecorated(true);
        frame.add(mainPanel);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        GUI gui = new GUI();
    }

}
