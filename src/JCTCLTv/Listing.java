//include in Tv.JCTCL package
package JCTCLTv;

public class Listing {

    //Channel one (1)
    public Channel ch1 = new Channel("CNN", 200, 5);
    public Programme ch1P1 = new News("Nightly", "Nightly News");
    public Programme ch1P2 = new News("Midday", "The News");
    public Programme ch1P3 = new News ("Morning","World News");
    public Programme ch1P4 = new News ("Midday","Intl News");
    public Programme ch1P5 = new News ("Nightly","World Update");

    //Channel two (2)
    public Channel ch2 =  new Channel("WCH", 201, 5);
    public Programme ch2P1 = new Weather ("Weather Watch",9);
    public Programme ch2P2 = new Weather ("Season Views",8);
    public Programme ch2P3 = new Weather ("Local Temperatures",7);
    public Programme ch2P4 = new Weather ("City Alert",6);
    public Programme ch2P5 = new Weather ("World's Weather",8);

    //Channel three (3)
    public Channel ch3 = new Channel("TBN", 202, 5);;
    public Programme ch3P1 = new Gospel("Ties that Blind","Christianity");
    public Programme ch3P2 = new Gospel("The Gospel","Christianity");
    public Programme ch3P3 = new Gospel("Prayer By Day","Christianity");
    public Programme ch3P4 = new Gospel("7Th Heaven","Christianity");
    public Programme ch3P5 = new Gospel("The Bible","Christianity");

    //Channel four (4)
    public Channel ch4 = new Channel("TVJ", 203, 5);
    public Programme ch4P1 = new Kids("Rocket Power","8-16");
    public Programme ch4P2 = new News ("","TVJ News");;
    public Programme ch4P3 = new Weather ("Weather Watch",9);;
    public Programme ch4P4 = new Movie("Darkest Knight",9,"July 14 2008",new String[]{"Christian Bale"});;
    public Programme ch4P5 = new General("Our Island Jamaica");

    //Channel five (5)
    public Channel ch5 = new Channel("KID", 204, 5);
    public Programme ch5P1 = new Kids("Rick and Morty","16 - 19");
    public Programme ch5P2 = new Kids("Sofia the First","4 - 10");
    public Programme ch5P3 = new Kids("Teen Titans Go","7 - 14");
    public Programme ch5P4 = new Kids("Justice League","12 - 16");
    public Programme ch5P5 = new Kids("Adventure Time","14 - 18");

    //Channel six (6)
    public Channel ch6 = new Channel("USA", 205, 5);
    public Programme ch6P1 = new Movie("SpiderMan", 9, "January 10, 2003", new String[]{"Tom Holland"});
    public Programme ch6P2 = new Movie("Iron Man", 10, "January 20, 1999", new String[]{"Robert Downey Jnr."});
    public Programme ch6P3 = new Movie("Deadpool", 9,"June 6, 2018", new String[]{"Ryan Reynolds"});
    public Programme ch6P4 = new Movie("Pokemon Detective Pikachu",7,"May 8 2019",new String[]{"Ryan Reynolds"});
    public Programme ch6P5 = new Movie("Holloween",7,"October 17 2002",new String[]{"Jamie Lee Curtis"});;

    //Channel seven(7)
    public Channel ch7 = new Channel("COM", 206, 5);
    public Programme ch7P1 = new Comedy(8,"Episode12",new String[]{"Jack Black"});
    public Programme ch7P2 = new Comedy(6,"Episode7",new String[]{"Eddie Murphy"});
    public Programme ch7P3 = new Comedy(7,"Episode9",new String[]{"Adam Sandler"});
    public Programme ch7P4 = new Comedy(6,"Episode4",new String[]{"Jaleel Ahmad White"});
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


    }

    public static void main(String[] args) {

        GUI g = new GUI();
    }
}
