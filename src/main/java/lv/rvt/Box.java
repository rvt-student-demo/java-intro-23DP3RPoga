package lv.rvt;

public class Box {
    private double width;
    private double height;
    private double length;
    private double side;
     Box oldbBox;
     Box outsideBox;
     
    public Box(double length,double height, double width) {
        this.width = width;
        this.height = height;
        this.length = length;

    }
    public Box(double side){
        this(side,side,side); 
    }
    public Box(Box oldbBox){
        this.length=oldbBox.length();
        this.height=oldbBox.height();
        this.width= oldbBox.width();
    }
    public Box biggerBox( Box oldBox ){
        return new Box( 1.25*oldBox.length(), 1.25*oldBox.height(), 1.25*oldBox.width());
      
    }
    public Box smallerBox( Box oldBox ){
        return new Box( 0.75*oldBox.length(), 0.75*oldBox.height(), 0.75*oldBox.width());
    }
    public Box outsideBox( Box oldBox){
        return new Box(oldBox.length(), oldBox.height(), oldBox.width());
    }
    public boolean nests( Box outsideBox ){
        if( (this.width<outsideBox.width) && (this.height<outsideBox.height )&& (this.length<outsideBox.height)){
            return true;
        }
        else{
            return false;
        }
    }

    public double length(){
        return this.length;
    }
    public double height(){
        return this.height;
    }
    public double width(){
        return this.width;
    }
    private double faceArea(){
        return this.height*this.width;
    }
    private double topArea(){
        return this.length*this.width;
    }
    private double sideArea(){
        return this.length*this.height;
    }
    private double faceArea(double side){
        return this.side*this.side;
    }
    private double topArea(double side){
        return this.side*this.side;
    }
    private double sideArea(double side){
        return this.side*this.side;
    }
    public  double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea() ;  

    }
    
    public  double volume(double side) {
        return this.side*this.side*this.side;
    }
    public double volume() {
        return this.width*this.height*this.length;
}  
} 
