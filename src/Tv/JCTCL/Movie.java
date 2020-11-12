package Tv.JCTCL;

public class Movie extends Programme {
    private int rating;
    private String releaseDate;
    private Channel channel = new Channel();
    private String[] actors = new String[25];

    private String caption;


    public Movie(){
        rating = 0;
        length = 0.0f;
        releaseDate = "Unknown";
        channel = new Channel();
    }
    public Movie(Channel _channel, String _progName, int _rating, float _length, String _rDate, String[] _actors) {
        rating = _rating;
        releaseDate =_rDate;
        actors = _actors;
        channel = _channel;
        progName = _progName;
    }
    public Movie(Movie _movie){
        rating = _movie.rating;
        releaseDate = _movie.releaseDate;
        actors = _movie.actors;
        channel = _movie.channel;

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

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}