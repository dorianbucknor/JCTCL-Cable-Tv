package Tv.JCTCL;


public class Comedy extends Programme {
        private int raTing;
        private String episodeTitle;

        private String[] mActors = new String[25];
    }
    public Comedy() {
        raTing = 0;
        length = 0.0f;
        episodeTitle = "Unknown";
        channel = new Channel();
    }
    public Comedy(Channel chaNnel, float length, int ratIng, String episodetitle, String[] aCtors ) {
        raTing = ratIng;
        episodeTitle = episodetitle;
        mActors = aCtors;
    }
    public Comedy(Comedy _comedy) {
        raTing = _comedy.raTing;
        episodeTitle = _comedy.episodeTitle;
        mActors = _comedy.mActors;
        progName = _comedy.progName;
    }
    public String[] getmActors() {return mActors;}
    public String episodeTitle() {return episodeTitle;}
    public int raTing() {return raTing;}
    public String progName() {return progName;}

    public void setmActors(String[] mActors){this.mActors = mActors;};
    public void set

/* public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }


    public void setRating(int rating) {
        this.rating = rating;
    }*/

}
