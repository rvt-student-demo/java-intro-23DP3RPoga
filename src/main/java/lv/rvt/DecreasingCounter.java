package lv.rvt;

public class DecreasingCounter
     {
    public int value;   // a variable that remembers the value of the counter

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        if (this.value!=0) {
        this.value=this.value-1;
     }
        else{
            return;
        }

        
    }

    // and the other methods go here
}
