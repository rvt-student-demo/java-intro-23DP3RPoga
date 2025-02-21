package lv.rvt;

public class Warehouse {
    String name;
    double balance;
    double capacity;

    public Warehouse(double capacity){
        this.capacity = capacity;

    }
    public double getBalance(){
        return this.balance;
    }
    public double getCapacity(){
        return this.capacity;
    }
    public double howMuchSpaceLeft(){
        return this.capacity - this.balance;
    }
    public void addToWarehouse(double amount){
        
    }
}

