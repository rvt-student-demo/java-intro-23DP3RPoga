package lv.rvt;

public class Student extends Person {
    private int credits;

    public Student(String initialName, String initialAdress) {
        super(initialName, initialAdress);
        this.credits = 0;
    }

    public int credits() {
        return this.credits;
    }

    public void study() {
        this.credits++;
    }
    public String toString(){
        return super.toString()+"\n"+"  Study credits "+this.credits;
        }
}
