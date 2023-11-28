package Week7;

public class Banking {
    public static void main(String[] args) {
        BankAccount adamya = new BankAccount("Adamya Neupane", 1, 100000);
        System.out.println(adamya.ShowAccountBalance());
        boolean withdrawal = adamya.withdraw(10000);
        if (withdrawal == true) {
            System.out.println("The amount is being withdrawan");
        } else {
            System.out.println("Insufficient Balance to withdraw.");
        }
        System.out.println("Current Balance: " + adamya.ShowAccountBalance());


    }
}

class BankAccount {
    String account_holder_name;
    int account_number;
    float account_balance;

    BankAccount(String Name, int account_number, int account_balance) {
        this.account_holder_name = Name;
        this.account_number = account_number;
        this.account_balance = account_balance;
    }

    public float deposit(float deposit_amount){
        float current_balance = this.account_balance; 
        this.account_balance = current_balance + deposit_amount;
        return this.account_balance; 
    }

    public boolean withdraw(int amount) {
        if (amount > this.account_balance) {
            return false;
        } else {
            float current_balance = this.account_balance;
            this.account_balance = current_balance - amount;
            return true;
        }
    }

    public float ShowAccountBalance() {
        return this.account_balance;
    }

}