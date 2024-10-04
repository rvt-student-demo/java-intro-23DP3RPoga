package lv.rvt;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        //Sum of a sequence
        Scanner scanner = new Scanner(System.in);
        System.out.println("1+2+3+...+n Input last number");
        int n=Integer.valueOf(scanner.nextLine());
        //1+2+3...+  n
        int sum=0;
        int loop=n;
        while (loop>=0) {
            sum=sum+n;
            n--;
            loop--;
            
        }
        System.out.println(sum);   
        }       
}

