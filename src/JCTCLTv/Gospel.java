package JCTCLTv;

public class Gospel extends Programme {
    private String denomination;

    //Default constructor for Gospel
    public Gospel(){
        progName = "Unknown";
        progColour = "Blue";
        denomination = "Unknown";
        length = 0.0f;
        channel = new Channel();
    }

    //Primary constructor for Gospel
    public Gospel(String _progName, String _denomination){
        denomination = _denomination;
        progName = _progName;
        progColour = "Blue";
    }

    //Copy Constructor
    public  Gospel(Gospel _gospel){
        progColour = "Blue";
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
