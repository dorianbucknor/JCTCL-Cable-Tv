package Tv.JCTCL;
import java.time.*;
import java.util.*;

public class Programme{
    protected String progName;
    protected String showTime;
    protected String showDate;
    protected String progColour;
    protected String description;
    protected boolean hasCaption;
    protected boolean isNew;
    protected boolean isRecorded;
    protected boolean isMarked;
    protected String caption;
    protected float length;
    protected Channel channel;

    Duration Length;



    public Programme() {
        progName = "Unknown";
        showTime = "Unknown";
        showDate = "Unknown";
        progColour = "Unknown";
        length = 0.0f;
    }

    public Programme(String _progTime, String _showDate, String _showTime, String _progColour, float _length) {
        progName = _progTime;
        showTime = _showTime;
        showDate = _showDate;
        progColour = _progColour;
        length = _length;
    }

    public Programme(Programme _pType) {
        progName = _pType.progName;
        showTime = _pType.showTime;
        showDate = _pType.showDate;
        progColour = _pType.progColour;
        length = _pType.length;
    }

    public String Caption(){
        if (hasCaption){
            caption = "";
        }
        return caption;
    }

    public String getShowTime() {
        return showTime;
    }

    public String getProgName() {
        return progName;
    }

    public String getShowDate() {
        return showDate;
    }

    public float getLength() {
        return length;
    }

    public void setProgName(String progName) {
        this.progName = progName;
    }

    public void setShowDate(String showDate) {
        this.showDate = showDate;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public String getProgColour() {
        return progColour;
    }

    public void setProgColour(String progColour) {
        this.progColour = progColour;
    }

    public void setLength(float length) {
        this.length = length;
    }

}
