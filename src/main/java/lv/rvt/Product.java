package lv.rvt;
public class Product {
    String name;
    double price;
    int quantity;


     public Product (String initialName, double initialPrice, int initialQuantity){
        this.name =initialName;
        this.price =initialPrice;
        this.quantity = initialQuantity;
    }

    public void printProduct(){
        System.out.println(this.name + ", price " + this.price + ", " + this.quantity + " pcs");
    }

 
}
