package lv.rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class App { 

    public static void main(String[] args) {
 DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.decrement();
        counter.printValue();
    }
}