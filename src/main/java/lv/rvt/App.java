package lv.rvt;
import java.util.Scanner;
public class App { 

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Statistics sum = new Statistics();
        Statistics odd = new Statistics();
        Statistics even = new Statistics();
        System.out.println("Enter numbers:");
    while (true) {
        int input=Integer.valueOf(scanner.nextLine());
        sum.addNumber(input);
        if (input%2==0)
        even.addNumber(input);
        else
        odd.addNumber(input);
        if (input==-1){
            break;
        }
    }
    int sum1=sum.sum();
    int sum2=odd.sum();
    int sum3=even.sum();
    sum1+=1;
    sum2+=1;
    System.out.println("Sum: " + sum1);
    System.out.println("Sum of odd numbers: "+ sum2);
    System.out.println("Sum of even numbers: "+ sum3);
    }  
}

  
