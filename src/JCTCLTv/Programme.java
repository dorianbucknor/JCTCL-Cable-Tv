package JCTCLTv;

import java.awt.*;

//create class Programme
public class Programme{
    //string to store programme name
    protected String progName;
    //string to store programme Id
    protected String progId;
    //string to store programme show time
    protected String showTime;
    //string to store programme programme show date
    protected String showDate;
    //string to store programme colour
    protected String progColour;
    //string to store programme description
    protected String description;
    //boolean to check if programme is being watched
    protected boolean isWatching;
    //boolean to check if programme has closed captions
    protected boolean hasClosedCaption;
    //boolean to check if programme is a new programme
    protected boolean isNew;
    //boolean to check if programme has been recorded
    protected boolean isRecorded;
    ////boolean to check if programme has been marked for viewing later
    protected boolean isMarked;
    //boolean to check if programme is currently live
    protected boolean isLive;
    //long to store length of movie in seconds
    protected float length;/*change to long data type*/
    //store channel object of programme
    protected Channel channel = new Channel();


    //default constructor
    public Programme() {
        progName = "Unknown";
        showTime = "Unknown";
        showDate = "Unknown";

        length = 0.0f;
    }
    //primary constructor
    public Programme(String _progTime, String _showDate, String _showTime, String _progColour, float _length) {
        progName = _progTime;
        showTime = _showTime;
        showDate = _showDate;

        length = _length;
    }
    //copy constructor
    public Programme(Programme _pType) {
        progName = _pType.progName;
        showTime = _pType.showTime;
        showDate = _pType.showDate;
        progColour = _pType.progColour;
        length = _pType.length;
    }

    //returns programme show time
    public String getShowTime() {
        return showTime;
    }
    //sets programme show time
    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }
    //return programme name
    public String getProgName() {
        return progName;
    }
    //set programme name
    public void setProgName(String progName) {
        this.progName = progName;
    }
    //return programme show date
    public String getShowDate() {
        return showDate;
    }
    //set programme show date
    public void setShowDate(String showDate) {
        this.showDate = showDate;
    }
    //return programme length
    public float getLength() {
        return length;
    }
    //set programme length
    public void setLength(float length) {
        this.length = length;
    }
    //set programme colour
    public void setProgColour(String rgb) {
        this.progColour = rgb;
    }
    //return programme colour
    public String getProgColour() {
        return progColour;
    }
    //set programme channel
    public void setChannel(Channel channel) {
        this.channel = channel;
    }
    //return programme channel
    public Channel getChannel() {
        return channel;
    }
    //set programme description
    public void setDescription(String description) {
        this.description = description;
    }
    //get programme description
    public String getDescription() {
        return description;
    }
    //change programme to live or not live
    public void Live(boolean live) {
        isLive = live;
    }
    //change programme to have closed caption or not
    public void ClosedCaption(boolean hasClosedCaption) {
        this.hasClosedCaption = hasClosedCaption;
    }
    //mark or unmark programme for viewing later
    public void MarkUnmark() {
        if (isMarked){
            isMarked = false;
        }
        else{isMarked = true;}
    }
    //sets the programme to new or not
    public void New(boolean _new) {
        isNew = _new;
    }
    //sets isRecorded to true
    public void Record(){
        isRecorded = true;
    }
    //delete a recorded programme, sets isRecorded to false
    public String DeleteRecording(){
        isRecorded = false;
        return "Recording Deleted";
    }
    //if programme is being watched stop watching else start watching
    public void WatchNow(){
        if (isWatching)
        {isWatching = false;}
        else{isWatching = true;}
    }
    //accessor and modifier for programme id

    public void setProgId(String progId) {
        this.progId = progId;
    }

    public String getProgId() {
        return progId;
    }
    //returns important information on the programme
    public String[] Details(){
        String[] details = {progId, progName, progColour.toString(), showDate, showTime, description, Boolean.toString(hasClosedCaption)};
        return details;
    }

}
