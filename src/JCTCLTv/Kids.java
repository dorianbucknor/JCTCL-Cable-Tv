package JCTCLTv;

import java.awt.*;

public class Kids extends Programme {
    private String ageRange;

    {
        progColour = new Color(128,0,128);
    }
    //Default constructor for Kids
    public Kids() {
        progName = "Unknown";

        ageRange = "7-13";
        length = 0.0f;
        channel = new Channel();

    }

    //Primary constructor for Kids
    public Kids(String _ageRange){
        ageRange = _ageRange;

    }
    public Kids(Kids _kids){
        ageRange = _kids.ageRange;

        channel = _kids.channel;
    }

    //Get method that returns the value of ageRange
    public String getAgeRange(){
        return ageRange;
    }

    //Set method that set the value of ageRange
    public void setAgeRange(String _ageRange){
        this.ageRange = _ageRange;
    }
}
