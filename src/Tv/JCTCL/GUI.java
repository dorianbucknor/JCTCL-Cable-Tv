package Tv.JCTCL;

import javax.swing.*;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class GUI {
    private JPanel mainPanel;
    private JPanel l1;
    private JPanel l1ch;
    private JPanel l1prog;
    private JPanel l1pp1;
    private JPanel l1pp2;
    private JPanel l1pp3;
    private JPanel l1pp4;
    private JPanel l1pp5;
    private JPanel l1p1e;
    private JPanel l1p1i;
    private JLabel l1p1l;
    private JLabel l1chl;
    private JLabel l1p2l;
    private JPanel l1p2e;
    private JPanel l1p2i;
    private JLabel l1p3l;
    private JPanel l1p3i;
    private JPanel l1p3e;
    private JLabel l1p4l;
    private JPanel l1p4i;
    private JPanel l1p4e;
    private JLabel l1p5l;
    private JPanel l1p5i;
    private JPanel l1p5e;
    private JPanel l2;
    private JPanel l2ch;
    private JLabel l2chl;
    private JPanel l2prog;
    private JPanel l2pp1;
    private JLabel l2p1l;
    private JPanel l2p1i;
    private JPanel l2p1e;
    private JPanel l2pp2;
    private JLabel l2p2l;
    private JPanel l2p2i;
    private JPanel l2p2e;
    private JPanel l2pp3;
    private JLabel l2p3l;
    private JPanel l2p3e;
    private JPanel l2p3i;
    private JPanel l2pp4;
    private JLabel l2p4l;
    private JPanel l2p4i;
    private JPanel l2p4e;
    private JPanel l2pp5;
    private JLabel l2p5l;
    private JPanel l2p5i;
    private JPanel l2p5e;
    private JPanel heading;
    private JLabel headLabel;
    private JLabel day;
    private JLabel date;
    private JLabel time;
    private JPanel l3;
    private JPanel l3ch;
    private JLabel l3chl;
    private JPanel l3prog;
    private JPanel l3pp1;
    private JLabel l3p1l;
    private JPanel l3p1i;
    private JPanel l3p1e;
    private JPanel l3pp2;
    private JLabel l3p2l;
    private JPanel l3p2i;
    private JPanel l3p2e;
    private JPanel l3pp3;
    private JLabel l3p3l;
    private JPanel l3p3i;
    private JPanel l3p3e;
    private JPanel l3pp4;
    private JLabel l3p4l;
    private JPanel l3p4i;
    private JPanel l3p4e;
    private JPanel l3pp5;
    private JLabel l3p5l;
    private JPanel l3p5i;
    private JPanel l3p5e;
    private JPanel l4;
    private JPanel l5;
    private JPanel l6;
    private JPanel l7;
    private JPanel l4ch;
    private JLabel l4chl;
    private JPanel l4prog;
    private JPanel l4pp1;
    private JLabel l4p1l;
    private JPanel l4p1i;
    private JPanel l4p1e;
    private JPanel l4pp2;
    private JLabel l4p2l;
    private JPanel l4p2i;
    private JPanel l4p2e;
    private JPanel l4pp3;
    private JLabel l4p3l;
    private JPanel l4p3i;
    private JPanel l4p3e;
    private JPanel l4pp4;
    private JLabel l4p4l;
    private JPanel l4p4i;
    private JPanel l4p4e;
    private JPanel l4pp5;
    private JLabel l4p5l;
    private JPanel l4p5i;
    private JPanel l4p5e;
    private JPanel l5ch;
    private JLabel l5chl;
    private JPanel l5prog;
    private JPanel l5pp1;
    private JLabel l5p1l;
    private JPanel l5p1i;
    private JPanel l5p1e;
    private JPanel l5pp2;
    private JLabel l5p2l;
    private JPanel l5p2i;
    private JPanel l5p2e;
    private JPanel l5pp3;
    private JLabel l5p3l;
    private JPanel l5p3i;
    private JPanel l5p3e;
    private JPanel l5pp4;
    private JLabel l5p4l;
    private JPanel l5p4i;
    private JPanel l5p4e;
    private JPanel l5pp5;
    private JLabel l5p5l;
    private JPanel l5p5i;
    private JPanel l5p5e;
    private JPanel l6ch;
    private JLabel l6chl;
    private JPanel l6prog;
    private JPanel l6pp1;
    private JLabel l6p1l;
    private JPanel l6p1i;
    private JPanel l6p1e;
    private JPanel l6pp2;
    private JLabel l6p2l;
    private JPanel l6p2i;
    private JPanel l6p2e;
    private JPanel l6pp3;
    private JLabel l6p3l;
    private JPanel l6p3i;
    private JPanel l6p3e;
    private JPanel l6pp4;
    private JLabel l6p4l;
    private JPanel l6p4i;
    private JPanel l6p4e;
    private JPanel l6pp5;
    private JLabel l6p5l;
    private JPanel l6p5i;
    private JPanel l6p5e;
    private JPanel l7ch;
    private JLabel l7chl;
    private JPanel l7prog;
    private JPanel l7pp1;
    private JLabel l7p1l;
    private JPanel l7p1i;
    private JPanel l7p1e;
    private JPanel l7pp2;
    private JLabel l7p2l;
    private JPanel l7p2i;
    private JPanel l7p2e;
    private JPanel l7pp3;
    private JLabel l7p3l;
    private JPanel l7p3i;
    private JPanel l7p3e;
    private JPanel l7pp4;
    private JLabel l7p4l;
    private JPanel l7p4i;
    private JPanel l7p4e;
    private JPanel l7pp5;
    private JLabel l7p5l;
    private JPanel l7p5e;
    private JPanel l7p5i;
    private JPanel channels;
    private JPanel proTPan;
    private JPanel T1;
    private JPanel T2;
    private JPanel T3;
    private JPanel T4;
    private JPanel T5;
    private JPanel progs;
    private JPanel chanNum;
    private JPanel chanHead;
    private JPanel colHead;
    private JPanel list;
    private JScrollPane scroll1;
    private JScrollPane scroll2;
    private JScrollPane scroll3;

    private JFrame frame = new JFrame("JCTCL Cable Tv");
    JViewport view1 = new JViewport();
    JViewport view2 = new JViewport();
    JViewport view3 = new JViewport();


    public GUI(){

        view1.setView(colHead);
        view2.setView(channels);
        view3.setView(list);

        scroll1.setViewport(view1);
        scroll2.setViewport(view2);
        scroll3.setViewport(view3);

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
