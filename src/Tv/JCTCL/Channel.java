package Tv.JCTCL;
import java.util.ArrayList;
import java.util.List;

public class Channel{
    private String chName;
    private int chNumber;
    private int numOfProgs;

    public Channel() {
        chName = "Unknown";
        chNumber = 000;
        numOfProgs ++;
    }

    public Channel(String _chName, int _chNumber, int _numOfProgs) {
        chNumber = _chNumber;
        chName = _chName;
        numOfProgs ++;
    }

    public Channel(Channel _channel){
        numOfProgs = _channel.numOfProgs;
        chName = _channel.chName;
        chNumber = _channel.chNumber;
    }

    public int getChNumber() {
          return chNumber;
    }

    public int getNumOfProgs() {
        return numOfProgs;
    }

    public String getChName() {
        return chName;
    }

    public void setChName(String _chName) {
        this.chName = _chName;
    }

    public void setChNumber(int _chNumber) {
        this.chNumber = _chNumber;
    }

    public void setNumOfProgs(int _numOfProgs) {
        this.numOfProgs = _numOfProgs;
    }
}
