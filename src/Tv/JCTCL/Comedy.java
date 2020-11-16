package Tv.JCTCL;


public class Comedy extends Programme {
        private int raTing;
        private String episodeTitle;

        private String[] mActors = new String[25];

    public Comedy() {
        raTing = 0;
        length = 0.0f;
        progColour = "Yellow";
        episodeTitle = "Unknown";
        channel = new Channel();
        mActors = new String[25];
    }
    public Comedy(int ratIng, String episodetitle, String[] aCtors ) {
        raTing = ratIng;
        episodeTitle = episodetitle;
        mActors = aCtors;
        progColour = "Yellow";
    }
    public Comedy(Comedy _comedy) {
        raTing = _comedy.raTing;
        episodeTitle = _comedy.episodeTitle;
        mActors = _comedy.mActors;
        progName = _comedy.progName;
        progColour = "Yellow";
        channel = _comedy.channel;
    }
    public String[] getmActors() {return mActors;}
    public String getEpisodeTitle() {return episodeTitle;}

    public void setmActors(String[] mActors){this.mActors = mActors;};

    public void setEpisodeTitle(String episodeTitle) {
        this.episodeTitle = episodeTitle;
    }

    public int getRaTing() {
        return raTing;
    }

    public void setRaTing(int raTing) {
        this.raTing = raTing;
    }
}
