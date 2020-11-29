package JCTCLTv;

import java.awt.*;

public class Weather extends Programme {
    private int severityRating;
    {
        progColour = Color.WHITE;
    }

    public Weather() {
        severityRating = 0;
        length = 0.0f;

        progName = "UNKNOWN";
        channel = new Channel();
    }
    public Weather(String progNaMe, int sRating) {
        severityRating = sRating;
        progName = progNaMe;

    }
    public Weather(Weather _weather) {
        severityRating = _weather.severityRating;
        channel = _weather.channel;

        progName = _weather.progName;
        length = _weather.length;
        channel = _weather.channel;
    }


    public int getSeverityRating() {return severityRating;}

    public void setSeverityRating(int severityRating) {
        this.severityRating = severityRating;
    }
}
