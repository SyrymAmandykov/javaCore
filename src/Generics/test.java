package Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test {
    public static void main(String[] args) {
//        Box<Integer> listOfBox1 = new Box<>();
//        listOfBox1.add(1);
//        listOfBox1.add(2);
//        listOfBox1.add(3);
//        listOfBox1.add(4);
//        listOfBox1.add(5);
//
//        for (Integer elem: listOfBox1.getContents()){
//            System.out.println(elem);
//        }
////////////////////////////////////////////////////////////////////////////////////////
//
//        Box<String> listOfBox2 = new Box();
////        listOfBox2.add("Arman");
////        listOfBox2.add("Kanat");
////        listOfBox2.add("Azamat");
////        listOfBox2.add("Amir");
//
//        for (String elem: listOfBox2.getContents()){
//            System.out.println(elem);
//        }

//        Student<String> student = new Student<>("syrym","amandykov",1,3.5);
//        System.out.println(student.toString());

//        BankAccount bankAccount = new BankAccount("KZ0456454050560","Madina Abayeva",20000);
//
//        bankAccount.deposit(15000);
//        bankAccount.withdraw(10000);
//
//        System.out.println(bankAccount.getAccountNumber());
//        System.out.println(bankAccount.getAccountHolder());
//        System.out.println(bankAccount.getBalance());

        BankAccount bankAccount1 = new BankAccount("KZ0456454050560","Madina Abayeva",20000);
        BankAccount bankAccount2 = new BankAccount("KZ4808745604556","Temirlan Temirbayev",35000);
        BankAccount bankAccount3 = new BankAccount("KZ6040230443402","Amir Abdulayev",45000);

        Bank accaunts = new Bank();
    }
}
