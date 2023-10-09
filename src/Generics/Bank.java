package Generics;
import java.util.*;

public class Bank <T extends  BankAccount>{

    List<T> accounts;

    public Bank(){
        accounts = new ArrayList<>();
    }
    public Bank(String accountNumber, String accountHolder, double balance,List<T> accounts){
        super();
        this.accounts =accounts;
    }

    void addAccount(T account){
        accounts.add(account);
    }

    void removeAccount(String accountNumber){
        if (accounts.equals(getAccount(accountNumber))){
            System.out.println(accounts);
        }
    }

    T getAccount(String accountNumber){
       if (accounts.contains(accountNumber)){
           return (T) accounts;
       } return null;
    }
}
