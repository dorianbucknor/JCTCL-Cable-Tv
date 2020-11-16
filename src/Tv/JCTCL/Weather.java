package Tv.JCTCL;

public class Weather extends Programme {
    private int severityRating;

    public Weather() {
        severityRating = 0;
        length = 0.0f;
        description = "Unknown";
        caption = "Unknown";
    }
    public Weather(Channel cHannel, String progNaMe, int sRating, float _length) {
        severityRating = sRating;
        channel = cHannel;
        progName = progNaMe;
    }
    public Weather(Weather _weather) {
        severityRating = _weather.severityRating;
        channel = _weather.channel;
        progName = _weather.progName;
    }

    public String getProgName() {return super.getProgName();}
    public int getSeverityRating() {return severityRating;}
    public String getProgColour() {return super.getProgColour();}
    public void setShowTime(String showTime) {super.setShowTime(showTime);}
}
