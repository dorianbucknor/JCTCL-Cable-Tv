//include in Tv.JCTCL package
package JCTCLTv;

//create class Channel
public class Channel{
    //store channel name
    private String chName;
    //store channel number
    private int chNumber;

    //default constructor
    public Channel() {
        chName = "Unknown";
        chNumber = 000;
    }
    //primary constructor
    public Channel(String _chName, int _chNumber) {
        chNumber = _chNumber;
        chName = _chName;
    }
    //copy constructor
    public Channel(Channel _channel){
        chName = _channel.chName;
        chNumber = _channel.chNumber;
    }
    //return channel number
    public int getChNumber() {
          return chNumber;
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

    //returns all data on channel
    public String[] Details(){
        return new String[] {chName, Integer.toString(chNumber)};
    }
}
