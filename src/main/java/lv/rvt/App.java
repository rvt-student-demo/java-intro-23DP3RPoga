package lv.rvt;
import java.util.ArrayList;
import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class App { 

    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name and birthyear: ");
        ArrayList<String> dati = new ArrayList<String>();

            while (scanner.hasNextLine()) {
              String i=scanner.nextLine();
              dati.add(i);//input
              if (i.equals(""));//beidzas input
              {
                String[]vardi = new String[dati.size()];
                String[]gadi = new String[dati.size()];
                for (int j = 0; j < dati.size(); j++) {
                  vardi[j] = dati.get(j).split(",")[0];
                  gadi[j] = dati.get(j).split(",")[1];
                  
                }
                System.out.println(gadi);
                System.out.println(vardi);
              }


    
      }
       
    }
    

}
