import java.util.*;
class _4_3_bank_acc {
    static class Bank {
        String name;
        int acc_num;
        String type;
        double balance;
        Scanner get = new Scanner(System.in);
        Bank() {
            balance = 0;
        }
        void get() {
            System.out.print("\nEnter name of depositor: ");
            name = get.nextLine();
            System.out.print("Enter type of account: ");
            type = get.nextLine();
            System.out.print("Enter account number: ");
            acc_num = get.nextInt();
            System.out.print("Enter balance in account: ");
            balance = get.nextDouble();}
        void deposit() {
            System.out.print("Enter amount to deposit: ");
            double d = get.nextDouble();
            balance+=d;}
        void withdraw() {
            System.out.println("Current balance in account: "+balance);
            System.out.print("\nEnter amount to withdraw: ");
            double d = get.nextDouble();
            balance-=d;
            System.out.println(d + " was withdrawn from your account.");}
        void show() {   
            System.out.println("\nAccount holder name: " +name);
            System.out.println("\nCurrent balance is: " + balance + "\n");
        }
    }
    public static void main(String args[]) {
        Scanner get = new Scanner(System.in);
        Bank b = new Bank();
        b.get();
        System.out.println();
        b.deposit();
        System.out.println();
        b.withdraw();
        System.out.println();
        b.show();
    }
}