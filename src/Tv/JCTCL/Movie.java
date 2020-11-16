//include Movie Class in TV.JCTCL package
package Tv.JCTCL;

//create class Movie which is a subclass of Programme class
public class Movie extends Programme {
    //stores rating of movie
    private int rating;
    //stores the movie release date
    private String releaseDate;
    //stores the actors of the movie
    private String[] actors = new String[25];

    //default constructor
    public Movie(){
        rating = 0;
        length = 0.0f;
        releaseDate = "Unknown";
        actors = new String[25];
        progName = "Unknown";
        channel = new Channel();
        progColour = "Red";
    }
    //primary constructor
    public Movie(String _progName, int _rating, String _rDate, String[] _actors) {
        rating = _rating;
        releaseDate =_rDate;
        actors = _actors;
        progName = _progName;
        progColour = "Red";
    }
    //copy constructor
    public Movie(Movie _movie){
        rating = _movie.rating;
        releaseDate = _movie.releaseDate;
        actors = _movie.actors;
        channel = _movie.channel;
        progColour = "Red";
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
    public int getRating() {
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
    public String Details() {
        return channel.getChName() + channel.getChNumber() + progName + showDate + showTime + description + rating + actors + releaseDate;
    }
}