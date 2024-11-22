package lv.rvt;
public class Product {
String name;
String location;
int weight;
        public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getLocation() {
        return location;
    }   
    public Product(String name){
        this.name = name; 
        this.location="Shelf";
        this.weight=1;
    }
    public Product(String name, String location){
        this.name = name;
        this.location = location;
        this.weight= 1;
    }
    public Product(String name, int weight){
        this.name = name;
        this.weight = weight;
        this.location= "Shelf";
        
    }
    public String toString() {
        return this.name + " (" + this.weight + " kg) can be found from the " + this.location;
    }   
}
