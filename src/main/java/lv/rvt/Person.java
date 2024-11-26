package lv.rvt;

import java.util.ArrayList;

public class Person {
    private String name;
    int age;
    private int weight;
    private int height;
    


    public Person(String initialName,int initialAge,int initialWeight,int initialHeight){
        this.age = initialAge;
        this.weight = initialWeight;
        this.height = initialHeight;
        this.name = initialName;
        }
    public String toString(){
        return "Name: "+this.name+" Age: "+age+" Weight: "+weight+" Height: "+height;
        }
    }
