import java.util.Scanner;

class ATMMachine {
    float Balance;
    int PIN = 9931;

    public void checkPin() {
        System.out.println("Enter Your PIN: ");
        Scanner scn = new Scanner(System.in);
        int enteredpin = scn.nextInt();
        if(enteredpin==PIN) {
            menu();
        }else {
            System.out.println("Enter Valid PIN");
            checkPin();
        }
    }

    public void menu() {
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Depost Money");
        System.out.println("4. EXIT");
        Scanner scn = new Scanner(System.in);
        int opt = scn.nextInt();
        if(opt==1) {
            checkBalance();
        }else if(opt==2) {
            withdrawMoney();
        }else if(opt==3) {
            dipostMoney();
        }else if(opt==4) {
            return;
        }else {
            System.out.println("Enter Valid Choice");
            menu();
        }
    }

    public void checkBalance() {
        System.out.println("Balance: "+Balance);
        menu();
    }

    public void withdrawMoney() {
        System.out.println("Enter the Amount");
        Scanner scn = new Scanner(System.in);
        float amount = scn.nextFloat();
        if(amount>Balance) {
            System.out.println("Insufficient Balance");
        }else {
            Balance-=amount;
            System.out.println("Money Withdrawal Successfully");
        }
        menu();
    }

    public void dipostMoney() {
        System.out.println("Enter the Amount");
        Scanner scn = new Scanner(System.in);
        float amount = scn.nextFloat();
        Balance+=amount;
        System.out.println("Money Deposited Successfully");
        menu();
    }
}

public class ATM {
    public static void main(String[] args) {
        ATMMachine obj = new ATMMachine();
        obj.checkPin();
    }
}