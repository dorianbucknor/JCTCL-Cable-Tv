package Tv.JCTCL;
import java.time.*;

public class News extends Programme {
    private String period;


    News() {
        period = "Unknown";
        progColour = "White";
        length = 0.0f;
    }

    News(String _period, Duration _length) {
        period = _period;

       Length = _length;
        Length.abs();
    }

    News(News _news) {


    }

    public String getPeriod() {
        return period;

    }

    public void setPeriod(String _period) {
        this.period = _period;
    }
}
