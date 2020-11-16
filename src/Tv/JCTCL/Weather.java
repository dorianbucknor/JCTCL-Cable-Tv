package Tv.JCTCL;

public class Weather extends Programme {
    private int severityRating;

    public Weather() {
        severityRating = 0;
        length = 0.0f;
        progColour = "White";
        progName = "UNKNOWN";
        channel = new Channel();

        //description = "Unknown"; ***wouldnt need description here
        //caption = "Unknown"; ***should be closedCaption and you would not need it here
    }
    public Weather(Channel cHannel, String progNaMe, int sRating, float _length) {
        severityRating = sRating;
        channel = cHannel;
        progName = progNaMe;
        progColour = "White";
        length = _length; //didnt use _length
    }
    public Weather(Weather _weather) {
        severityRating = _weather.severityRating;
        channel = _weather.channel;
        progColour = "White";
        progName = _weather.progName;
        length = _weather.length;
    }

    public String getProgName() {return super.getProgName();}//not really needed since weather is a child class of programme but its ok
    public int getSeverityRating() {return severityRating;}//forgot a set function
    public String getProgColour() {return super.getProgColour();}//not needed here
    public void setShowTime(String showTime) {super.setShowTime(showTime);}//not needed here
}
