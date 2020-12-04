package JCTCLTv;

//create class Programme
public abstract class Programme{
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
    protected boolean hasClosedCaption;
    //boolean to check if programme is a new programme
    protected boolean isNew;
    //boolean to check if programme has been recorded
    protected float length;/*change to long data type*/
    //store channel object of programme
    protected Channel channel = new Channel();


    //default constructor
    public Programme() {
        progName = null;
        showTime = null;
        showDate = null;
        length = 0f;
        progId = null;
        hasClosedCaption = false;
        isNew = false;
    }
    //primary constructor
    public Programme(String _progId, String _progName, String _showDate, String _showTime, float _length, boolean _cc, boolean _isnew) {
        progName = _progName;
        showTime = _showTime;
        showDate = _showDate;
        length = _length;
        progId = _progId;
        hasClosedCaption = _cc;
        isNew = _isnew;
    }
    //copy constructor
    public Programme(Programme _pType) {
        progName = _pType.progName;
        showTime = _pType.showTime;
        showDate = _pType.showDate;
        length = _pType.length;
        isNew = _pType.isNew;
        hasClosedCaption = _pType.hasClosedCaption;
        progId = _pType.progId;
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
    //change programme to have closed caption or not
    public void ClosedCaption(boolean hasClosedCaption) {
        this.hasClosedCaption = hasClosedCaption;
    }
    //sets the programme to new or not
    public void New(boolean _new) {
        isNew = _new;
    }
    //accessor and modifier for programme id

    public void setProgId(String progId) {
        this.progId = progId;
    }

    public String getProgId() {
        return progId;
    }
    //returns important information on the programme
    public abstract String[] Details();

}
