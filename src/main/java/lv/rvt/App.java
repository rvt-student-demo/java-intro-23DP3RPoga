package lv.rvt;
import java.util.Scanner;
public class App { 

public static void main(String[] args) {
    PaymentCard paulsCard = new PaymentCard(20);
    PaymentCard mattsCard = new PaymentCard(30);

    paulsCard.eatHeartily();
    mattsCard.eatAffordably();

    System.out.println("Pauls balance: " + paulsCard.toString());
    System.out.println("Matts balance: " + mattsCard.toString());

    paulsCard.addMoney(20);
    mattsCard.eatHeartily();

    System.out.println("Pauls balance: " + paulsCard.toString());
    System.out.println("Matts balance: " + mattsCard.toString());

    paulsCard.eatAffordably();
    paulsCard.eatAffordably();
    mattsCard.addMoney(50);
    
    System.out.println("Pauls balance: " + paulsCard.toString());
    System.out.println("Matts balance: " + mattsCard.toString());
    }
}
  
