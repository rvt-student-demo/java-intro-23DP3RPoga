package lv.rvt;

import java.util.ArrayList;

public class Person {
    private String name;
    private String adress;


    public Person(String initialName,String initialAdress){
        this.name = initialName;
        this.adress = initialAdress;

        }
    public String toString(){
        return this.name+"\n  "+this.adress;
        }
    }
