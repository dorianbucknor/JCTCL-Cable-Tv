package JCTCLTv;

public class Listing {


    public Channel ch1 = new Channel("CNN", 200, 5);
    public Programme ch1P1 = new News("Nightly", "Nightly News");
    public Programme ch1P2 = new News("Midday", "The News");
    public Programme ch1P3;
    public Programme ch1P4;
    public Programme ch1P5;


    public Channel ch2 =  new Channel("WCH", 201, 5);
    public Programme ch2P1;
    public Programme ch2P2;
    public Programme ch2P3;
    public Programme ch2P4;
    public Programme ch2P5;


    public Channel ch3 = new Channel("TBN", 202, 5);;
    public Programme ch3P1;
    public Programme ch3P2;
    public Programme ch3P3;
    public Programme ch3P4;
    public Programme ch3P5;


    public Channel ch4 = new Channel("TVJ", 203, 5);
    public Programme ch4P1 = new Kids("8 - 19");

    public Programme ch4P2;
    public Programme ch4P3;
    public Programme ch4P4;
    public Programme ch4P5;


    public Channel ch5 = new Channel("CVM", 204, 5);
    public Programme ch5P1;
    public Programme ch5P2;
    public Programme ch5P3;
    public Programme ch5P4;
    public Programme ch5P5;


    public Channel ch6 = new Channel("DISNEY", 205, 5);
    public Programme ch6P1 = new Movie("SpiderMan", 9, "January 10, 2003", new String[]{"Tom Holland"});
    public Programme ch6P2 = new Movie("Iron Man", 10, "January 20, 1999", new String[]{"Robert Downey Jnr."});
    public Programme ch6P3;
    public Programme ch6P4;
    public Programme ch6P5;


    public Channel ch7 = new Channel("COM", 206, 5);
    public Programme ch7P1;
    public Programme ch7P2;
    public Programme ch7P3;
    public Programme ch7P4;
    public Programme ch7P5;

    //put extra info inside brackets
    {
        ch4P1.setProgName("Elmo's World");
        ch6P2.setDescription("The Greatest Movie Ever");


    }

    public static void main(String[] args) {

        GUI g = new GUI();
    }
}
