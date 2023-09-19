//include in Tv.JCTCL package
package JCTCLTv;

//create class News as subclass of Programme
public class News extends Programme {
    //store news period
    private String period;
    {     progColour = "White";    }

    //default constructor
    News() {
        period = "Unknown";
    }
    //Primary constructor
    News(String _progId, String _progName, String _showDate, String _showTime, float _length, boolean _cc, boolean _isnew, String _period) {
        super(_progId, _progName, _showDate, _showTime, _length, _cc, _isnew);
        period = _period;
    }
    //copy constructor
    News(News _news) {
        period = _news.period;
        progName = _news.progName;
        showTime = _news.showTime;
        showDate = _news.showDate;
        length = _news.length;
        isNew = _news.isNew;
        hasClosedCaption = _news.hasClosedCaption;
        progId = _news.progId;
    }
    //returns the value of period
    public String getPeriod() {
        return period;
    }
    //sets the value of period
    public void setPeriod(String _period) {
        this.period = _period;
    }

    @Override
    public String[] Details() {
        return new String[] {progId, progName, progColour, showDate, showTime, description, Boolean.toString(isNew), period, null, null, null, null, null, null, null, Float.toString(length), channel.getChName(), Integer.toString(channel.getChNumber())};
    }
}

