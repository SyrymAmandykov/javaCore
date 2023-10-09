package InterfaceThreeExample;

public class BankApplication implements BankApplicationInterface{
    String name;
    Account[] accounts = new Account[1000];
    int sizeOfAccount = 0;

    public BankApplication() {
    }

    public BankApplication(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAccount(Account a){
        if (sizeOfAccount != 1000) {
            accounts[sizeOfAccount] = a;
            sizeOfAccount++;
        } else {
            System.out.println("Array is full");
        }
    }

    public void printAccounts(){
        for (int i = 0; i < sizeOfAccount ; i++) {
            System.out.println(accounts[i]);
        }
    }
       public Account getMaxBalance() {
        Account max = new Account();
           for (int i = 0; i < sizeOfAccount; i++) {
               if (accounts[i].getBalance() > max.getBalance()){
                   max = accounts[i];
               }
           } return max;
       }
}
