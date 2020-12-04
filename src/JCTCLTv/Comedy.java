//include in Tv.JCTCL package
package JCTCLTv;

import java.util.Arrays;

public class Comedy extends Programme {
        private int raTing;
        private String episodeTitle;
        private String[] mActors = new String[25];
    {
        progColour = "Yellow";
    }
    //default constructor
    public Comedy() {
        raTing = 0;
        episodeTitle = null;
        mActors = null;
    }

    //primary constructor
    public Comedy(String _progId, String _progName, String _showDate, String _showTime, float _length, boolean _cc, boolean _isnew,int ratIng, String episodetitle, String[] aCtors ) {
        super(_progId, _progName, _showDate, _showTime, _length, _cc, _isnew);
        raTing = ratIng;
        episodeTitle = episodetitle;
        mActors = aCtors;
    }

    //copy constructor
    public Comedy(Comedy _comedy) {
        raTing = _comedy.raTing;
        episodeTitle = _comedy.episodeTitle;
        mActors = _comedy.mActors;
        progName = _comedy.progName;
        showTime = _comedy.showTime;
        showDate = _comedy.showDate;
        length = _comedy.length;
        isNew = _comedy.isNew;
        hasClosedCaption = _comedy.hasClosedCaption;
        progId = _comedy.progId;
    }

    //return actors
    public String[] getmActors() {return mActors;}

    //return episode
    public String getEpisodeTitle() {return episodeTitle;}

    //set actors
    public void setmActors(String[] mActors){this.mActors = mActors;};

    //set episode
    public void setEpisodeTitle(String episodeTitle) {
        this.episodeTitle = episodeTitle;
    }

    //return rating
    public int getRaTing() {
        return raTing;
    }

    //set rating
    public void setRaTing(int raTing) {
        this.raTing = raTing;
    }

    @Override
    public String[] Details() {
        return new String[] {progId, progName, progColour, showDate, showTime, description, Boolean.toString(isNew), null, Float.toString(raTing), episodeTitle, Arrays.toString(mActors), null,null,null,null, Float.toString(length)};
    }
}
