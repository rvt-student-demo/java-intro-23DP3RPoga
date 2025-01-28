package lv.rvt;

public class Teacher extends Person {
    private int salary;

    public Teacher(String initialName, String initialAdress ,int salary){
        super(initialName,initialAdress);
        this.salary = salary;
    }
    public String toString(){
        return super.toString()+"\n"+" Salary "+this.salary+"euros/month";
        }
}

