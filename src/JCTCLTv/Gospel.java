package JCTCLTv;

import java.awt.*;

public class Gospel extends Programme {
    private String denomination;
    {
        progColour = Color.BLUE;
    }

    //Default constructor for Gospel
    public Gospel(){
        progName = "Unknown";

        denomination = "Unknown";
        length = 0.0f;
        channel = new Channel();
    }

    //Primary constructor for Gospel
    public Gospel(String _progName, String _denomination){
        progName = _progName;
        denomination = _denomination;

    }

    //Copy Constructor
    public  Gospel(Gospel _gospel){

        progName = _gospel.progName;
        length = _gospel.length;
        denomination = _gospel.denomination;
        channel = _gospel.channel;
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
