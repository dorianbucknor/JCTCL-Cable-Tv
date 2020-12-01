package JCTCLTv;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Listing {


    public Channel ch1 = new Channel("CNN", 200);
    public News ch1P1 = new News("Nightly", "Nightly News");
    public News ch1P2 = new News("Midday", "The News");
    public News ch1P3 = new News ("Morning","World News");
    public News ch1P4 = new News ("Midday","Intl News");
    public News ch1P5 = new News ("Nightly","World Update");


    public Channel ch2 =  new Channel("WCH", 201);
    public Weather ch2P1 = new Weather ("Weather Watch",9);
    public Weather ch2P2 = new Weather ("Season Views",8);
    public Weather ch2P3 = new Weather ("Local Temperatures",7);
    public Weather ch2P4 = new Weather ("City Alert",6);
    public Weather ch2P5 = new Weather ("World's Weather",8);


    public Channel ch3 = new Channel("TBN", 202);;
    public Gospel ch3P1 = new Gospel("Ties that Blind","Christianity");
    public Gospel ch3P2 = new Gospel("The Gospel","Christianity");
    public Gospel ch3P3 = new Gospel("Prayer By Day","Christianity");
    public Gospel ch3P4 = new Gospel("7Th Heaven","Christianity");
    public Gospel ch3P5 = new Gospel("The Bible","Christianity");


    public Channel ch4 = new Channel("TVJ", 203);
    public Kids ch4P1 = new Kids("Rocket Power","8-16");
    public News ch4P2 = new News ("","TVJ News");;
    public Weather ch4P3 = new Weather ("Weather Watch",9);;
    public Movie ch4P4 = new Movie("Darkest Knight",9,"July 14 2008",new String[]{"Christian Bale"});
    public Movie ch4P5 = new Movie("Golden Eye",7,"November 13, 1995",new String[]{"Pierce Brosnan"});


    public Channel ch5 = new Channel("KID", 204);
    public Kids ch5P1 = new Kids("Rick and Morty","16 - 19");
    public Kids ch5P2 = new Kids("Sofia the First","4 - 10");
    public Kids ch5P3 = new Kids("Teen Titans Go","7 - 14");
    public Kids ch5P4 = new Kids("Justice League","12 - 16");
    public Kids ch5P5 = new Kids("Adventure Time","14 - 18");


    public Channel ch6 = new Channel("USA", 205);
    public Movie ch6P1 = new Movie("SpiderMan", 9, "January 10, 2003", new String[]{"Tom Holland"});
    public Movie ch6P2 = new Movie("Iron Man", 10, "January 20, 1999", new String[]{"Robert Downey Jnr."});
    public Movie ch6P3 = new Movie("Deadpool", 9,"June 6, 2018", new String[]{"Ryan Reynolds"});
    public Movie ch6P4 = new Movie("Pokemon Detective Pikachu",7,"May 8 2019",new String[]{"Ryan Reynolds"});
    public Movie ch6P5 = new Movie("Holloween",7,"October 17 2002",new String[]{"Jamie Lee Curtis"});


    public Channel ch7 = new Channel("COM", 206);
    public Comedy ch7P1 = new Comedy(8,"Episode12",new String[]{"Jack Black"});
    public Comedy ch7P2 = new Comedy(6,"Episode7",new String[]{"Eddie Murphy"});
    public Comedy ch7P3 = new Comedy(7,"Episode9",new String[]{"Adam Sandler"});
    public Comedy ch7P4 = new Comedy(6,"Episode4",new String[]{"Jaleel Ahmad White"});
    public Comedy ch7P5 = new Comedy(9, "Episode10", new String[]{"Will Smith"});

    //put extra info inside brackets
    {
        ch4P1.setProgName("Elmo's World");
        ch6P2.setDescription("The Greatest Movie Ever");
        ch7P5.setProgName("Fresh Prince");

        ch7P1.setProgName("Archer");
        ch7P2.setProgName("Family Guy");
        ch7P3.setProgName("iCarly");
        ch7P4.setProgName("Big Bang Theory");

        List<String[][]> data = new ArrayList<>();

        //List<String[]> _ch1Data = new ArrayList<>();
        String[][] _ch1 = {ch1.Details(), ch1P1.Details(), ch1P2.Details(), ch1P3.Details(), ch1P4.Details(), ch1P5.Details()};
        String[][] _ch2 = {ch2.Details(), ch2P1.Details(), ch2P2.Details(), ch2P3.Details(), ch2P4.Details(), ch2P5.Details()};
        String[][] _ch3 = {ch3.Details(), ch3P1.Details(), ch3P2.Details(), ch3P3.Details(), ch3P4.Details(), ch3P5.Details()};
        String[][] _ch4 = {ch4.Details(), ch4P1.Details(), ch4P2.Details(), ch4P3.Details(), ch4P4.Details(), ch4P5.Details()};
        String[][] _ch5 = {ch5.Details(), ch5P1.Details(), ch5P2.Details(), ch5P3.Details(), ch5P4.Details(), ch5P5.Details()};
        String[][] _ch6 = {ch6.Details(), ch6P1.Details(), ch6P2.Details(), ch6P3.Details(), ch6P4.Details(), ch6P5.Details()};
        String[][] _ch7 = {ch7.Details(), ch7P1.Details(), ch7P2.Details(), ch7P3.Details(), ch7P4.Details(), ch7P5.Details()};

        data.add(0, _ch1);
        data.add(1, _ch2);
        data.add(2, _ch3);
        data.add(3, _ch4);
        data.add(4,_ch5);
        data.add(5,_ch6);
        data.add(6,_ch7);

        CsvHandler.toFile(new File("ListingData.csv"), data);

    }

    public static void main(String[] args) {

        GUI g = new GUI();
    }
}
