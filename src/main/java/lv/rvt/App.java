package lv.rvt;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        //Counting
        Scanner scanner = new Scanner(System.in);
        int input=Integer.valueOf(scanner.nextLine());
        
        int output=0;
        while (input>=0) {
            System.out.println(output);
            output=output+1;
            input=input-1;
            
        }
            
    }
}

