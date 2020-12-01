//include in Tv.JCTCL package
package JCTCLTv;

import java.awt.*;

//create class News as subclass of Programme
public class News extends Programme {
    //store news period
    private String period;
    {
        progColour = "WHITE";
    }

    //default constructor
    News() {
        period = "Unknown";
        progName = "UNKNOWN";
    }
    //Primary constructor
    News(String _period, String _progName) {
        period = _period;

        progName = _progName;
    }
    //copy constructor
    News(News _news) {
        period = _news.period;
        progName = _news.progName;

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
        String[] details = {progName, progColour.toString(), description, Boolean.toString(hasClosedCaption), period};
        return details;
    }
}
