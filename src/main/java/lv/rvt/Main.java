package lv.rvt;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Person> persons = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("src/main/resources/persons.csv"));
        
        br.readLine();
        String line;
        while ((line = br.readLine()) != null) {
            String[] Dati = line.split(",");
            String name = Dati[0];
            Integer age = Integer.valueOf(Dati[1]);
            Integer height = Integer.valueOf(Dati[2]);
            Integer weight = Integer.valueOf(Dati[3]);

            Person person = new Person(name, age, height, weight);
            persons.add(person);
        }
        
        br.close();

        if (!persons.isEmpty()) {
            int totalAge = 0;
            for (Person person : persons) {
                totalAge += person.age;
                System.out.println(person);
            }
            double averageAge = (double) totalAge / persons.size();
            System.out.println("Average Age: " + averageAge);
        } else {
            System.out.println("No persons found.");
        }
    }
}