package Tv.JCTCL;
import java.time.*;

public class News extends Programme {
    private String period;


    News() {
        period = "Unknown";
        progColour = "White";
        length = 0.0f;
    }

    News(String _period) {
        period = _period;
        progColour = "White";
    }

    News(News _news) {
        period = _news.period;
    }

    public String getPeriod() {
        return period;

    }

    public void setPeriod(String _period) {
        this.period = _period;
    }
}
