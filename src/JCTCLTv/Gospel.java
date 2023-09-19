package JCTCLTv;

import java.awt.*;

public class Gospel extends Programme {
    private String denomination;
    {
        progColour = "Blue";
    }

    //Default constructor for Gospel
    public Gospel(){
        denomination = null;
    }

    //Primary constructor for Gospel
    public Gospel(String _progId, String _progName, String _showDate, String _showTime, float _length, boolean _cc, boolean _isnew, String _denomination){
        super(_progId, _progName, _showDate, _showTime, _length, _cc, _isnew);
        denomination = _denomination;
    }

    //Copy Constructor
    public  Gospel(Gospel _gospel){
        denomination = _gospel.denomination;
        progName = _gospel.progName;
        showTime = _gospel.showTime;
        showDate = _gospel.showDate;
        length = _gospel.length;
        isNew = _gospel.isNew;
        hasClosedCaption = _gospel.hasClosedCaption;
        progId = _gospel.progId;
    }

    //Get method that returns the value of ageRange
    public String getDenomination(){
        return denomination;
    }

    //Set method that set the value of ageRange
    public void setDenomination(String _denomination){
        this.denomination = _denomination;
    }

    @Override
    public String[] Details() {
        return new String[] {progId, progName, progColour, showDate, showTime, description, Boolean.toString(isNew), null, null, null, null, denomination, null, null, null, Float.toString(length), channel.getChName(), Integer.toString(channel.getChNumber())};
    }
}
