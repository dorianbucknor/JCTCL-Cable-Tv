package Tv.JCTCL;

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
    protected float length;
    protected Channel channel;


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

    public void getChild(){

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

    public void setProgName(String _progName) {
        this.progName = _progName;
    }

    public void setShowDate(String _showDate) {
        this.showDate = _showDate;
    }

    public void setShowTime(String _showTime) {
        this.showTime = _showTime;
    }

    public String getProgColour() {
        return progColour;
    }

    public void setProgColour(String _progColour) {
        this.progColour = _progColour;
    }

    public void setLength(float _length) {
        this.length = _length;
    }

}
