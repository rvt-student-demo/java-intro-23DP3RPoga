package lv.rvt;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadiet savu vardu");
        String name = scanner.nextLine();
        System.out.println("Ievadiet savu uzvardu");
        String lastname = scanner.nextLine();
        System.out.println("Ievadiet savu grupu");
        String group = scanner.nextLine();

        //Izvade vienā rindiņā izmantojot 3 mainīgos
        //Output example: Students: <name> <surname>, grupa: <group>
        System.out.println("Students: " + name + " "
        + lastname + ", grupa: " + group);













        
        // String concatenation
        // System.out.println("Students: " + name + " "
        // + lastname + ", grupa: " + group);
        
        // //Refernce data type
        // String name = "Ben";
        // // Primitive data type
        // int age = 21;
        // // Primitive data type
        // boolean isOnline = true;

        // System.out.println(name); 
        // System.out.println(age);
        // System.out.println(isOnline) ;
        // System.out.println(scanner);
        // // Ctrl + /
        // /* qwerty */


    }

}
