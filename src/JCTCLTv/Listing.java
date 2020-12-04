package JCTCLTv;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Listing {
    public Channel ch1 = new Channel("CNN", 200);
    public News ch1P1 = new News("ch1P1", "Nightly News", null, null, 4.8f, false, false,"Nightly");
    public News ch1P2 = new News("ch1P2","The News", null, null, 4.8f, false, false,"Midday");
    public News ch1P3 = new News ("ch1P3","World News", null, null, 4.8f, false, false,"Morning");
    public News ch1P4 = new News ("ch1P4","Intl News" ,null, null, 4.8f, false, false, "Midday");
    public News ch1P5 = new News ("ch1P5","World Update", null, null, 4.8f, false, false,"Nightly");


    public Channel ch2 =  new Channel("WCH", 201);
    public Weather ch2P1 = new Weather ("ch2P1","Weather Watch",null, null, 4.8f, false, false,9);
    public Weather ch2P2 = new Weather ("ch2P2","Season Views",null, null, 4.8f, false, false,8);
    public Weather ch2P3 = new Weather ("ch2P3", "Local Temperatures",null, null, 4.8f, false, false,7);
    public Weather ch2P4 = new Weather ("ch2P4", "City Alert",null, null, 4.8f, false, false,6);
    public Weather ch2P5 = new Weather ("ch2P5", "World's Weather",null, null, 4.8f, false, false,8);


    public Channel ch3 = new Channel("TBN", 202);
    public Gospel ch3P1 = new Gospel("ch3P1", "Ties that Blind",null, null, 4.8f, false, false,"Christianity");
    public Gospel ch3P2 = new Gospel("ch3P2", "The Gospel",null, null, 4.8f, false, false,"Christianity");
    public Gospel ch3P3 = new Gospel("ch3P3","Prayer By Day",null, null, 4.8f, false, false,"Christianity");
    public Gospel ch3P4 = new Gospel("ch3P4", "7Th Heaven",null, null, 4.8f, false, false,"Christianity");
    public Gospel ch3P5 = new Gospel("ch3P5", "The Bible",null, null, 4.8f, false, false,"Christianity");


    public Channel ch4 = new Channel("TVJ", 203);
    public Kids ch4P1 = new Kids("ch4P1", "Rocket Power",null, null, 4.8f, false, false,"8-16");
    public News ch4P2 = new News ("ch4P2","TVJ News", null, null, 4.8f, false, false, "Morning");
    public Weather ch4P3 = new Weather ("ch4P3", "Weather Watch",null, null, 4.8f, false, false,9);
    public Movie ch4P4 = new Movie("ch4P4", "Darkest Knight",null, null, 4.8f, false, false,9,"July 14 2008",new String[]{"Christian Bale"});
    public Movie ch4P5 = new Movie("ch4P5", "Golden Eye",null, null, 4.8f, false, false,7,"November 13, 1995",new String[]{"Pierce Brosnan"});


    public Channel ch5 = new Channel("KID", 204);
    public Kids ch5P1 = new Kids("ch5P1","Rick and Morty",null, null, 4.8f, false, false,"16 - 19");
    public Kids ch5P2 = new Kids("ch5P2","Sofia the First",null, null, 4.8f, false, false,"4 - 10");
    public Kids ch5P3 = new Kids("ch5P3","Teen Titans Go",null, null, 4.8f, false, false,"7 - 14");
    public Kids ch5P4 = new Kids("ch5P4","Justice League",null, null, 4.8f, false, false,"12 - 16");
    public Kids ch5P5 = new Kids("ch5P5","Adventure Time",null, null, 4.8f, false, false,"14 - 18");


    public Channel ch6 = new Channel("USA", 205);
    public Movie ch6P1 = new Movie("ch6P1","SpiderMan", null, null, 4.8f, false, false,9, "January 10, 2003", new String[]{"Tom Holland"});
    public Movie ch6P2 = new Movie("ch6P2","Iron Man",null, null, 4.8f, false, false, 10, "January 20, 1999", new String[]{"Robert Downey Jnr."});
    public Movie ch6P3 = new Movie("ch6P3","Deadpool", null, null, 4.8f, false, false,9,"June 6, 2018", new String[]{"Ryan Reynolds"});
    public Movie ch6P4 = new Movie("ch6P4","Pokemon Detective Pikachu",null, null, 4.8f, false, false,7,"May 8 2019",new String[]{"Ryan Reynolds"});
    public Movie ch6P5 = new Movie("ch6P5","Holloween",null, null, 4.8f, false, false, 7,"October 17 2002",new String[]{"Jamie Lee Curtis"});


    public Channel ch7 = new Channel("COM", 206);
    public Comedy ch7P1 = new Comedy("ch7P1", "Archer",null, null, 4.8f, false, false,8,"Episode12",new String[]{"Jack Black"});
    public Comedy ch7P2 = new Comedy("ch7P2", "Family Guy", null, null, 4.8f, false, false,6,"Episode7",new String[]{"Eddie Murphy"});
    public Comedy ch7P3 = new Comedy("ch7P3", "iCarly", null, null, 4.8f, false, false,7,"Episode9",new String[]{"Adam Sandler"});
    public Comedy ch7P4 = new Comedy("ch7P4", "Big Bang Theory",  null, null, 4.8f, false, false,6,"Episode4",new String[]{"Jaleel Ahmad White"});
    public Comedy ch7P5 = new Comedy("ch7P5", "Fresh Prince", null, null, 4.8f, false, false,9, "Episode10", new String[]{"Will Smith"});

    //put extra info inside brackets
    public Listing() {
        List<String[][]> data = new ArrayList<>();

        //List<String[]> _ch1Data = new ArrayList<>();
        String[][] _ch1 = {ch1.Details(), ch1P1.Details(), ch1P2.Details(), ch1P3.Details(), ch1P4.Details(), ch1P5.Details()};
        String[][] _ch2 = {ch2.Details(), ch2P1.Details(), ch2P2.Details(), ch2P3.Details(), ch2P4.Details(), ch2P5.Details()};
        String[][] _ch3 = {ch3.Details(), ch3P1.Details(), ch3P2.Details(), ch3P3.Details(), ch3P4.Details(), ch3P5.Details()};
        String[][] _ch4 = {ch4.Details(), ch4P1.Details(), ch4P2.Details(), ch4P3.Details(), ch4P4.Details(), ch4P5.Details()};
        String[][] _ch5 = {ch5.Details(), ch5P1.Details(), ch5P2.Details(), ch5P3.Details(), ch5P4.Details(), ch5P5.Details()};
        String[][] _ch6 = {ch6.Details(), ch6P1.Details(), ch6P2.Details(), ch6P3.Details(), ch6P4.Details(), ch6P5.Details()};
        String[][] _ch7 = {ch7.Details(), ch7P1.Details(), ch7P2.Details(), ch7P3.Details(), ch7P4.Details(), ch7P5.Details()};

        String[] heading = {"Programme Id - 1", "Programme Name - 2", "Programme Color - 3", "Show Date - 4", "Show Time - 5", "Description 6 ",
                "New - 7", "Period - 8", "Rating - 9", "Episode - 10", "Actors - 11", "Denomination - 12", "Age Range - 13", "Release Date - 14", "Severity Rating - 15"};


        data.add(0, _ch1);
        data.add(1, _ch2);
        data.add(2, _ch3);
        data.add(3, _ch4);
        data.add(4,_ch5);
        data.add(5,_ch6);
        data.add(6,_ch7);

        CsvHandler.toFile(new File("ListingData.csv"), data, heading);
    }

    public static void main(String[] args) {
        GUI.Fonts();
        Listing l = new Listing();
        GUI g = new GUI();
    }
}
