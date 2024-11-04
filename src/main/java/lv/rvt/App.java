package lv.rvt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App { 

    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name and birthyear: ");
        ArrayList<String> dati = new ArrayList<String>();

            while (scanner.hasNextLine()) {
              String i=scanner.nextLine();
              if (i.equals(""))
                {
                break;
                }
              dati.add(i);
            String[] vardi = new String[dati.size()];
            String[] gadi = new String[dati.size()];
              
                for (int j = 0; j < dati.size(); j++) {
            String[] parts = dati.get(j).split(",");
            if (parts.length == 2) { 
                vardi[j] = parts[0];
                gadi[j] = parts[1];
            } else {
                System.out.println("Invalid format for entry: " + dati.get(j));
            }
        }


        System.out.println("Names: " + Arrays.toString(vardi));
        System.out.println("Birth years: " + Arrays.toString(gadi));
    }
}

    
      }
  
