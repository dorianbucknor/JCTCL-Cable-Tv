//include in Tv.JCTCL package
package JCTCLTv;

public class Kids extends Programme {
    private String ageRange;

    {
        progColour = "Purple";
    }
    //Default constructor for Kids
    public Kids() {
        ageRange = "7-13";
    }
    //Primary constructor for Kids
    public Kids(String _progId, String _progName, String _showDate, String _showTime, float _length, boolean _cc, boolean _isnew,String _ageRange){
        super(_progId, _progName, _showDate, _showTime, _length, _cc, _isnew);
        ageRange = _ageRange;
    }

    //Copy constructor for Kids
    public Kids(Kids _kids){
        ageRange = _kids.ageRange;
        progName = _kids.progName;
        showTime = _kids.showTime;
        showDate = _kids.showDate;
        length = _kids.length;
        isNew = _kids.isNew;
        hasClosedCaption = _kids.hasClosedCaption;
        progId = _kids.progId;
    }

    //Get method that returns the value of ageRange
    public String getAgeRange(){
        return ageRange;
    }

    //Set method that set the value of ageRange
    public void setAgeRange(String _ageRange){
        this.ageRange = _ageRange;
    }

    @Override
    public String[] Details() {
        return new String[] {progId, progName, progColour, showDate, showTime, description, Boolean.toString(isNew), null, null, null, null, null, ageRange, null, null, Float.toString(length), channel.getChName(), Integer.toString(channel.getChNumber())};
    }
}
