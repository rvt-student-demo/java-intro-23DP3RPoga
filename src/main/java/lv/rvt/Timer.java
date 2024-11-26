package lv.rvt;

public class Timer {
    private ClockHand hours;
    private ClockHand minutes;
    private ClockHand seconds;


    public Timer(){

    }
    public String toString(){
        return hours.toString() + ":" + minutes.toString() + ":" + seconds.toString();
    }
    public void advance(){
        this.seconds=seconds+0.01;
    }


}
