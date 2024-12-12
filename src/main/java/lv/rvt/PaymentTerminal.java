package lv.rvt;

public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals
    private double card;


    public PaymentTerminal() {
        money=1000;
    }

    public double eatAffordably(double payment) {
        if (payment>=2.5) {
            this.money+=2.5;
            payment-=2.5;
            this.affordableMeals+=1;
            return payment;

        }
        else{
            return payment;
        }
    }

    public double eatHeartily(double payment) {
        if (payment>=4.3) {
            this.money+= 4.3;
            payment=payment- 4.3;
            this.heartyMeals+=1;
            return payment;
        }
        else{
            return payment;
        }   
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
    public boolean eatAffordably(PaymentCard card) {
        if (card.balance()>=2.5) {
            card.takeMoney(2.5);
            heartyMeals++;
            return true;
        }
        else{
            return false;
        }
        }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance()>=4.3){
            card.takeMoney(4.3);
            heartyMeals++;
            return true;
        }
        else{
            return false;
        }
        
    }
    public void addMoneyToCard(PaymentCard card, double sum) {
        card.addMoney(sum);
        money+=sum;
    }
}
