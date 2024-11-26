package lv.rvt;

public class Account {
    double balance;
    String accountName;

    public Account(String accountString,double openingBalance) {
        balance=openingBalance;
        accountString=accountName;
        

}
    public void deposit(double deposit){
        balance+=deposit;
    }
    public void withdraw(double withdraw){
        balance-=withdraw;
    }
    public String balance(){
        return String.valueOf(balance);
        
    }
    public String toString(){
        return String.valueOf(balance);
    }
}
