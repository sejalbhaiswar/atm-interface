import java.util.*;
    class atm{
        float balance;
        int PIN=2322;
        public void checkpin() {
            System.out.println("ENTER YOUR PIN");
            Scanner sc= new Scanner(System.in);
            int enteredpin=sc.nextInt();
            if(enteredpin==PIN) {
                menu();
            }
            else {
                System.out.println("Enter a valid PIN");
                menu();
            }
        }

        public void menu() {
            System.out.println("Enter your choice");
            System.out.println("1. Check A/C  balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. EXIT");
            Scanner sc=new Scanner(System.in);
            int opt=sc.nextInt();
            if (opt==1) {
                checkbalance();
            }
            else if(opt==2) {
                withdrawmoney();
            }
            else if(opt==3) {
                depositmoney();
            }
            else if(opt==4) {
                return;
            }
            else {
                System.out.println("Enter a valid number");
            }
        }
        public void checkbalance() {
            System.out.println("check balance"+ balance);
            menu();
        }
        public void withdrawmoney() {
            System.out.println("Enter amount to withdraw");
            Scanner sc=new Scanner(System.in);
            float amount= sc.nextFloat();
            if(amount>balance) {
                System.out.println("Insufficient balance");
            }
            else {
                balance=balance-amount;
                System.out.println("Money withdrawl succesfull");
            }
            menu();
        }

        public void depositmoney() {
            System.out.println("Enter the amount to deposit: ");
            Scanner sc=new Scanner(System.in);
            float deposit=sc.nextFloat();
            balance=balance+deposit;
            System.out.println("Money deposited succesfully");
            menu();
        }

    }
