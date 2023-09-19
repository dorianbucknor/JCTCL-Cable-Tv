package JCTCLTv;

public class General extends Programme{
    {
        progColour = "White";
    }
    //Default Constructor for General
    public General(){

    }
    //Primary Constructor for General
    public General(String _progId, String _progName, String _showDate, String _showTime, float _length, boolean _cc, boolean _isnew){
        super(_progId, _progName, _showDate, _showTime, _length, _cc, _isnew);
    }

    //Copy Constructor for General
    public General(General _general){
        length = _general.length;
        progName = _general.progName;
        showTime = _general.showTime;
        showDate = _general.showDate;
        length = _general.length;
        isNew = _general.isNew;
        hasClosedCaption = _general.hasClosedCaption;
        progId = _general.progId;
    }

    @Override
    public String[] Details() {
        return new String[] {progId, progName, progColour, showDate, showTime, description, Boolean.toString(isNew), null, null, null,null,null,null,null,null, Float.toString(length), channel.getChName(), Integer.toString(channel.getChNumber())};
    }
}
