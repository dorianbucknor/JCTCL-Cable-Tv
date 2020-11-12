package Tv.JCTCL;
import java.util.ArrayList;
import java.util.List;

public class Channel{
    private String chName;
    private int chNumber;
    private int numOfProgs;
    Object P1 = (Programme) new Object();
    Object P2 = (Programme) new Object();
    //ProgrammeT1 P3 = new ProgrammeT1();
    //ProgrammeT1 P4 = new ProgrammeT1();
    //ProgrammeT1 P5 = new ProgrammeT1();
    public List<Object> programmes;

    public Channel() {
        chName = "Unknown";
        chNumber = 000;
        numOfProgs ++;
        AllProgrammes();
    }

    public Channel(String _chName, int _chNumber, int _numOfProgs, Programme _p1) {
        chNumber = _chNumber;
        chName = _chName;
        numOfProgs ++;
        //P1 = _p1;
        AllProgrammes();
    }

    public Channel(Channel _channel){
        numOfProgs = _channel.numOfProgs;
        chName = _channel.chName;
        chNumber = _channel.chNumber;
        programmes = _channel.programmes;
    }
    public void AllProgrammes(){
        programmes.add(P1);
        programmes.add(P2);
        /*programmes.add(P3);
        programmes.add(P4);
        programmes.add(P5);*/
    }

    public void setProgrammes(Object _p1, Object _p2){
       P1 = _p1;
        P2 = _p2;
       /* P3 = _p3;
        P4 = _p4;
        P5 = _p5;*/
    }

    public List<Object> getProgrammes(){
        return programmes;
    }

    public List<String> getProgNames(){
        List<String>allProgName = new ArrayList<String>(5);
        for (int i =0; i < 5; i++){
        //allProgName.add(programmes.get(i).getClass();
        }
        return  allProgName;
    }

    //public int getChNumber() {
      //  return chNumber;
    //}

    public int getNumOfProgs() {
        return numOfProgs;
    }

    public Object getP1() {
        return P1;
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
