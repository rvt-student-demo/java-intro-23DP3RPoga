package lv.rvt;

public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {

    return cents;

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    public Money plus(Money addition) {
       return new Money(this.euros()+addition.euros(), this.cents()+addition.cents());
    }
    public boolean lessThan(Money compared){
        return this.euros()+100*this.cents()<compared.euros()+100*compared.cents();
    }
    public Money minus(Money decreaser){

    }
}
