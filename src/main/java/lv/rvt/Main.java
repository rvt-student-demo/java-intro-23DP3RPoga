package lv.rvt;
import java.io.BufferedReader;
import java.io.IOException;

import java.util.ArrayList;
import lv.rvt.Helper;



public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = Helper.getReader("persons.csv");

        ArrayList<Person> personList = new ArrayList<>();
        String line;

        reader.readLine();
       
        while ((line = reader.readLine())!= null) {
            
            String[] parts = line.split(",");
            String name = parts[0];
            int age = Integer.valueOf(parts[1]);
            int weight = Integer.valueOf(parts[2]);
            int height = Integer.valueOf(parts[3]);
            String address = parts[4];
            
            Person person =new Person(name, age, weight, height, address); 
            personList.add(person);


            
        }
        for (Person person : personList) {
            System.out.println(person.getName());  
    }
}
}