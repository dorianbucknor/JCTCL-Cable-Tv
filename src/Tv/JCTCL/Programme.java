package Tv.JCTCL;
import java.time.*;
import java.util.*;

public class Programme{
    protected String progName;
    protected String showTime;
    protected String showDate;
    protected String progColour;
    protected String description;
    protected boolean isWatching;
    protected boolean hasClosedCaption;
    protected boolean isNew;
    protected boolean isRecorded;
    protected boolean isMarked;
    protected boolean isLive;
    protected float length;
    protected Channel channel = new Channel();
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

    public String getShowTime() {
        return showTime;
    }
    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public String getProgName() {
        return progName;
    }
    public void setProgName(String progName) {
        this.progName = progName;
    }

    public String getShowDate() {
        return showDate;
    }
    public void setShowDate(String showDate) {
        this.showDate = showDate;
    }

    public float getLength() {
        return length;
    }
    public void setLength(float length) {
        this.length = length;
    }

    public void setProgColour(String progColour) {
        this.progColour = progColour;
    }
    public String getProgColour() {
        return progColour;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }
    public Channel getChannel() {
        return channel;
    }

    public void Description(String description) {
        this.description = description;
    }

    public String Description() {
        return description;
    }

    public void Live(boolean live) {
        isLive = live;
    }

    public void ClosedCaption(boolean hasClosedCaption) {
        this.hasClosedCaption = hasClosedCaption;
    }

    public void MarkUnmark() {
        if (isMarked){
            isMarked = false;
        }
        else{isMarked = true;}
    }

    public void New(boolean _new) {
        isNew = _new;
    }
    public void Record(){
        isRecorded = true;
    }
    public String DeleteRecording(){
        isRecorded = false;
        return "Recording Deleted";
    }

    public void WatchNow(){
        if (isWatching)
        {isWatching = false;}
        else{isWatching = true;}
    }
    public String Details(){
        return channel.getChName() + channel.getChNumber() + progName + showDate + showTime + description;
    }
}
