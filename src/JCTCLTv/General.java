package JCTCLTv;

import java.awt.*;

public class General extends Programme{

    //Default Constructor for General
    public General(){
        progName = "Unknown";
        length = 0.0f;
    }

    {
        progColour = Color.WHITE;
    }

    //Primary Constructor for General
    public General(String _progName){
        progName = _progName;
    }

    //Copy Constructor for General
    public General(General _general){
        progName = _general.progName;
        length = _general.length;
    }

}
