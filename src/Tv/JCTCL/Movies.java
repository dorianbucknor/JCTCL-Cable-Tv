package Tv.JCTCL;

public class Movies extends Programme {
    protected int rating;
    protected String releaseDate;
    protected String[] actors = new String[25];


    public Movies(){
        rating = 0;
        //length = 0.0f;
        releaseDate = "Unknown";
        for (int i = 0; i<25; i++) actors[i] = "Unknown";
        //setProgColour("Red");
    }
    public Movies(int _rating, float _length, String _rDate, String _progName, String[] _actors) {
        rating = _rating;
        //setLength(_length);
        releaseDate =_rDate;
        setProgName(_progName);
        actors = _actors;
        //setProgColour("Red");
    }
    public Movies(Movies _movie){
        rating = _movie.rating;
        setLength(_movie.getLength());
        releaseDate = _movie.releaseDate;
        setProgName(_movie.getProgName());
        actors = _movie.actors;
        setProgColour(_movie.getProgColour());

    }

    public String[] getActors() {
        return actors;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public int getRating() {
        return rating;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }

}