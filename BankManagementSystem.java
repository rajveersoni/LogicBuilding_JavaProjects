import java.util.Scanner;

public class BankManagementSystem {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Please, Enter your name: ");
        String name = ip.nextLine();

        System.out.print("Please, Enter your age: ");
        int age = ip.nextInt();
        System.out.println();
        System.out.println("--------------------Welcome to the Bank of Stimulation---------------------------");
        System.out.println();
        SavingAccount customer = new SavingAccount();

        customer.Name(name);
        customer.age(age);
        System.out.println();
        System.out.println();
        System.out.print("Press 0 to exit or any number to continue: ");
        while (ip.nextInt() != 0){

        System.out.print("Dear " + name + ", press 1 to deposit money, 2 to withdraw money, 3 to check balance: ");
        int input = ip.nextInt();
            if (input == 1){
                System.out.print("Enter amount to deposit: ");
                int amount = ip.nextInt();
                customer.deposit(amount);
            } else if (input == 2) {
                System.out.print("Enter amount to withdraw: ");
                int amount = ip.nextInt();
                customer.withdraw(amount);
            } else if (input == 3) {
                customer.balance();
            }
        System.out.print("Press 0 to exit or any number to continue: ");
        }


    }
}

abstract class IndusBank{

    abstract void Name(String name);
    abstract void age(int age);

}
abstract class BankAccount extends IndusBank{

    abstract void deposit(int rupees);
    abstract void withdraw(int rupees);
    abstract void balance();

}
class SavingAccount extends BankAccount{

    int balance = 0;
    @Override
    void deposit(int rupees) {
        balance = balance + rupees;
    }

    @Override
    void withdraw(int rupees) {
        balance = balance - rupees;
    }

    @Override
    void balance() {
        System.out.println("Your current balance is " + balance);
    }

    @Override
    void Name(String name) {
        System.out.println("The name of customer is " + name);
    }

    @Override
    void age(int age) {
        System.out.println("The age of the customer is " + age);
    }
}