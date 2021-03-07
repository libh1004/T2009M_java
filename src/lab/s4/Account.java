package lab.s4;

import java.util.ArrayList;

public class Account {
    int id;
    String name;
    double balance;

    public Account() {

    }
    public void credit(int amount){
        if(amount > 0);
        setBalance(getBalance()+amount);
    }

    public void debit(int amount){
        if(amount>0 && getBalance() > amount){
            setBalance(getBalance()-amount);
        }else{
            System.out.println("Thanh toan khong thanh cong");
        }
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
