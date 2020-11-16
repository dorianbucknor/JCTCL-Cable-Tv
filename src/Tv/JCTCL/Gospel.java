package Tv.JCTCL;

public class Gospel extends Programme {
    private String denomination;

    //Default constructor for Gospel
    public Gospel(){
        progName = "Unknown";
        progColour = "Blue";
        denomination = "Unknown";
        length = 0.0f;
    }

    //Primary constructor for Gospel
    public Gospel(String _denomination){
        denomination = _denomination;
    }

    //Get method that returns the value of ageRange
    public String getDenomination(){
        return denomination;
    }

    //Set method that set the value of ageRange
    public void setDenomination(String _denomination){
        this.denomination = _denomination;
    }
}
