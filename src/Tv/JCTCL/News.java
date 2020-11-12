package Tv.JCTCL;

public class News {
    private String period;

    News() {
        period = "Unknown";
        //setProgColour("White");
        //length = 0.0f;
    }

    News(String _period){
        period =_period;
    }
    News(News _news) {
    //setProgName(_news.getProgName());
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String _period) {
        this.period = _period;
            }
}
