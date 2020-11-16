package Tv.JCTCL;

public class Kids extends Programme {
    private String ageRange;

    //Default constructor for Kids
    public Kids() {
        progName = "Unknown";
        progColour = "Purple";
        ageRange = "7-13";
        length = 0.0f;

    }

    //Primary constructor for Kids
    public Kids(String _ageRange){
        ageRange = _ageRange;
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
