package JCTCLTv;

public class Weather extends Programme {
    private int severityRating;

    public Weather() {
        severityRating = 0;
        length = 0.0f;
        progColour = "White";
        progName = "UNKNOWN";
        channel = new Channel();
    }
    public Weather(String progNaMe, int sRating) {
        severityRating = sRating;
        progName = progNaMe;
        progColour = "White";
    }
    public Weather(Weather _weather) {
        severityRating = _weather.severityRating;
        channel = _weather.channel;
        progColour = "White";
        progName = _weather.progName;
        length = _weather.length;
        channel = _weather.channel;
    }


    public int getSeverityRating() {return severityRating;}

    public void setSeverityRating(int severityRating) {
        this.severityRating = severityRating;
    }
}
