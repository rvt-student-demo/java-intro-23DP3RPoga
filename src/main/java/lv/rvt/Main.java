package lv.rvt;
import java.io.BufferedReader;
import java.io.IOException;

import java.util.ArrayList;
import lv.rvt.Helper;



public class Main {
    public static void main(String[] args) throws Exception {
        Money a = new Money(10, 0);
        Money b = new Money(3, 50);

        // Subtract b from a
        Money c = a.minus(b);
        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 6.50e

        // Subtract a from c, result should be 0.00e
        c = c.minus(a);
        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 0.00e
    }