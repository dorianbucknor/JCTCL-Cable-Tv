package Tv.JCTCL;

public interface IMovie{

    public int i = 0;

    abstract String[] getActors();

    abstract String getReleaseDate();

    abstract int getRating();

    abstract void setReleaseDate(String releaseDate);

    abstract void setRating(int rating);

    abstract void setActors(String[] actors);

}