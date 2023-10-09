package InterfaceThreeExample;

public class test {
    public static void main(String[] args) {
//        Account account1 = new Account(3,"madina","zhukey",5);
//        Account account2 = new Account(4,"aiman","temirova",500);
//        Account account3 = new Account(1,"aidos","baranov",4510);
//        Account account4 = new Account(5,"inna","aminat",461);
//
//
//        Account[] accounts = {account1,account2,account3};

        Account maxim = new Account(777, "Maxim", "Zamirailov", 8001001);
        Account zhandos = new Account(707, "Zhandos", "Narbayev", 7777777);
        BankApplication forte = new BankApplication("OFIGEEEET");
        forte.addAccount(maxim);
        forte.addAccount(zhandos);
//        forte.printAccounts();
        System.out.println(forte.getMaxBalance());


//        System.out.println(account1.toString());
//        System.out.println(account2.toString());
//        System.out.println(account3.toString());
//        System.out.println(account4.toString());


    }
}
