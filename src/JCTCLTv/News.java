//include in Tv.JCTCL package
package JCTCLTv;

//create class News as subclass of Programme
public class News extends Programme {
    //store news period
    private String period;

    //default constructor
    News() {
        period = "Unknown";
        progColour = "White";
        progName = "UNKNOWN";
    }
    //Primary constructor
    News(String _period, String _progName) {
        period = _period;
        progColour = "White";
        progName = _progName;
    }
    //copy constructor
    News(News _news) {
        period = _news.period;
        progName = _news.progName;
        progColour = "White";
    }
    //returns the value of period
    public String getPeriod() {
        return period;

    }
    //sets the value of period
    public void setPeriod(String _period) {
        this.period = _period;
    }
}
