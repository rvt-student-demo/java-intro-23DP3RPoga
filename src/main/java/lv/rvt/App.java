package lv.rvt;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        
        // Grades and Points
        System.out.println("Give points [0-100]:");
        int intInput=Integer.valueOf(scanner.nextLine());

        if (intInput<0) {
            System.out.println("Grade:impossible!");
        }
        else if (intInput>=0&& intInput<=49) {
            System.out.println("Grade: failed");
        }
        else if (intInput>=50&& intInput<=59) {
            System.out.println("Grade: 1");
        }
        else if (intInput>=60&& intInput<=69) {
            System.out.println("Grade: 2");
        }
        else if (intInput>=70&& intInput<=79) {
            System.out.println("Grade: 3");
        }
        else if (intInput>=80&& intInput<=89) {
            System.out.println("Grade: 4");
        }
        else if (intInput>=90&& intInput<=100) {
            System.out.println("Grade: 5");
        }
        else if (intInput>100) {
            System.out.println("Grade: incredible!");
        }
      
    }

}
