//include in Tv.JCTCL package
package JCTCLTv;

//create class Channel
public class Channel{
    //store channel name
    private String chName;
    //store channel number
    private int chNumber;
    //store the number of programmes the channel has
    private int numOfProgs;

    //default constructor
    public Channel() {
        chName = "Unknown";
        chNumber = 000;
        numOfProgs = 0;
    }
    //primary constructor
    public Channel(String _chName, int _chNumber, int _numOfProgs) {
        chNumber = _chNumber;
        chName = _chName;
        numOfProgs = _numOfProgs;
    }
    //copy constructor
    public Channel(Channel _channel){
        numOfProgs = _channel.numOfProgs;
        chName = _channel.chName;
        chNumber = _channel.chNumber;
    }
    //return channel number
    public int getChNumber() {
          return chNumber;
    }
    //return number of programmes channel has
    public int getNumOfProgs() {
        return numOfProgs;
    }
    //return channel name
    public String getChName() {
        return chName;
    }
    //ser channel name
    public void setChName(String _chName) {
        this.chName = _chName;
    }
    //set channel number
    public void setChNumber(int _chNumber) {
        this.chNumber = _chNumber;
    }
    //set number of programmes channel has
    public void setNumOfProgs(int _numOfProgs) {
        this.numOfProgs = _numOfProgs;
    }
}
