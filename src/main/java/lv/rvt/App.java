package lv.rvt;
import java.util.ArrayList;
import java.util.Scanner;

public class App { 

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        ArrayList<String> pages  = new ArrayList<String>();
        ArrayList<String> year = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Title: ");
            String bookName = scanner.nextLine();
            if (bookName.equals("")){
                break;
            }
            name.add(bookName);
            
            System.out.println("Pages: ");
            pages.add(scanner.nextLine());
            
            System.out.println("Publication year: ");
            year.add(scanner.nextLine());
        }

        System.out.println("What information will be printed?");
        String input= scanner.nextLine();
        if (input.equals("everything"))
        {
            for (int i = 0; i < name.size(); i++) {
                System.out.println(name.get(i)+","+pages.get(i)+","+year.get(i));

            }
        }
        else if (input.equals("name")){
            for (int i = 0; i < name.size(); i++) {
                System.out.println(name.get(i));

        }
    }
}
}


