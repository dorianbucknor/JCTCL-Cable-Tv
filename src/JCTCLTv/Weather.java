package JCTCLTv;

import java.awt.*;

public class Weather extends Programme {
    //int to store weather severity
    private int severityRating;
    {
        progColour = "Green";
    }

    //default constructor
    public Weather() {
        severityRating = 0;
    }

    //primary constructor
    public Weather( String _progId, String _progName, String _showDate, String _showTime, float _length, boolean _cc, boolean _isnew, int sRating) {
        super(_progId, _progName, _showDate, _showTime, _length, _cc, _isnew);
        severityRating = sRating;
    }

    //copy constructor
    public Weather(Weather _weather) {
        severityRating = _weather.severityRating;
        progName = _weather.progName;
        showTime = _weather.showTime;
        showDate = _weather.showDate;
        length = _weather.length;
        isNew = _weather.isNew;
        hasClosedCaption = _weather.hasClosedCaption;
        progId = _weather.progId;
    }

    //return severity
    public int getSeverityRating() {return severityRating;}
    //set severity
    public void setSeverityRating(int severityRating) {
        this.severityRating = severityRating;
    }

    @Override
    public String[] Details() {
        return new String[] {progId, progName, progColour, showDate, showTime, description, Boolean.toString(isNew), null, null,null,null,null,null,null, Integer.toString(severityRating), Float.toString(length)};
    }
}
