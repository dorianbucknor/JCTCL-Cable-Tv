//include Movie Class in TV.JCTCL package
package JCTCLTv;

import java.util.Arrays;

//create class Movie which is a subclass of Programme class
public class Movie extends Programme {
    //stores rating of movie
    private float rating;
    //stores the movie release date
    private String releaseDate;
    //stores the actors of the movie
    private String[] actors = new String[25];

    {
        progColour = "Red";
    }

    //default constructor
    public Movie() {
        rating = 0;
        releaseDate = null;
        actors = null;
    }

    //primary constructor
    public Movie(String _progId, String _progName, String _showDate, String _showTime, float _length, boolean _cc, boolean _isnew, int _rating, String _rDate, String[] _actors) {
        super(_progId, _progName, _showDate, _showTime, _length, _cc, _isnew);
        rating = _rating;
        releaseDate = _rDate;
        actors = _actors;

    }

    //copy constructor
    public Movie(Movie _movie) {
        rating = _movie.rating;
        releaseDate = _movie.releaseDate;
        actors = _movie.actors;
        channel = _movie.channel;
        progName = _movie.progName;
        showTime = _movie.showTime;
        showDate = _movie.showDate;
        length = _movie.length;
        isNew = _movie.isNew;
        hasClosedCaption = _movie.hasClosedCaption;
        progId = _movie.progId;
    }

    //return actors
    public String[] getActors() {
        return actors;
    }

    //return release date
    public String getReleaseDate() {
        return releaseDate;
    }

    //return rating
    public float getRating() {
        return rating;
    }

    //set release date
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    //set actors
    public void setActors(String[] actors) {
        this.actors = actors;
    }

    //set rating
    public void setRating(int rating) {
        this.rating = rating;
    }

    //returns details of movie
    @Override
    public String[] Details() {
        return new String[]{progId, progName, progColour, showDate, showTime, description, Boolean.toString(isNew), null, Float.toString(rating), null, Arrays.toString(actors), null, null, releaseDate, null, Float.toString(length)};
    }
}