import java.util.Scanner;
import java.util.Random;

class Bank {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    String name, fatherName, motherName, address, city, state, zip, phone, adharNumber, pan, nominee, accountType;
    int choice;

    void createAccount() {
        System.out.println("Enter Type of Account: ");
        System.out.println("1. Savings Account");
        System.out.println("2. Fixed Deposit Account");
        System.out.println("By Default. Current Account");
        System.out.print("\nEnter your choice: ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                accountType = "Savings Account";
                System.out.println("You are creating Saving Account");
                break;
            case 2:
                accountType = "Fixed Deposit Account";
                System.out.println("You are creating Fixed Deposit Account");
                break;
            default:
                accountType = "Current Account";
                System.out.println("You are creating Current Account");
                break;
        }

        System.out.println("\nEnter the name of the account holder: ");
        name = scanner.next();
        System.out.println("\nEnter the Father's name: ");
        fatherName = scanner.next();
        System.out.println("\nEnter the Mother's name: ");
        motherName = scanner.next();
        System.out.println("\nEnter the State: ");
        state = scanner.next();
        System.out.println("\nEnter the City: ");
        city = scanner.next();
        System.out.println("\nEnter the Address: ");
        address = scanner.next();
        System.out.println("\nEnter the Zip code: ");
        zip = scanner.next();
        System.out.println("\nEnter the Phone number: ");
        phone = scanner.next();
        System.out.println("\nEnter the Aadhar number: ");
        adharNumber = scanner.next();
        System.out.println("\nEnter the PAN number: ");
        pan = scanner.next();
        System.out.println("\nEnter the Nominee's name: ");
        nominee = scanner.next();

        int acc_no = random.nextInt(900000000) + 20000000;
        System.out.println("\nYour account number is: " + acc_no);
    }

    void deposit() {
        int accountNo, amount;
        System.out.println("\nEnter the Name of Account Holder:");
        name = scanner.next();
        System.out.println("\nEnter the Account number: ");
        accountNo = scanner.nextInt();
        System.out.println("\nEnter the Amount to be deposited: ");
        amount = scanner.nextInt();
        System.out.println("Dear " + name + ", " + amount + " deposited successfully in Account number: " + accountNo);
    }

    void withdraw() {
        int accountNo, amount;
        System.out.println("\nEnter the Name of Account Holder:");
        name = scanner.next();
        System.out.println("\nEnter the Account number: ");
        accountNo = scanner.nextInt();
        System.out.println("\nEnter the Amount to be withdrawn: ");
        amount = scanner.nextInt();
        System.out.println("Dear " + name + ", " + amount + " withdrawn from Account number: " + accountNo);
    }

    void checkBalance() {
        int accountNo;
        System.out.println("Enter Type of Account: ");
        System.out.println("1. Savings Account");
        System.out.println("2. Fixed Deposit Account");
        System.out.println("By Default. Current Account");
        System.out.print("\nEnter your choice: ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Saving Account::");
                break;
            case 2:
                System.out.println("Fixed Deposit Account::");
                break;
            default:
                System.out.println("Current Account::");
                break;
        }

        System.out.println("\nEnter the Name of Account Holder:");
        name = scanner.next();
        System.out.println("\nEnter the Account number: ");
        accountNo = scanner.nextInt();

        int balance = random.nextInt(900000000) + 20000000;
        System.out.println("\nDear " + name + ", your balance is: " + balance);
    }

    void transfer() {
        int accountNo, amount, accountNo1;
        String name1;
        System.out.println("\nEnter the Name of Account Holder:");
        name1 = scanner.next();
        System.out.println("\nEnter Your Account Number:");
        accountNo = scanner.nextInt();
        System.out.println("\nEnter the Amount to be Transferred: ");
        amount = scanner.nextInt();
        System.out.println("\nEnter the Account number to Transfer: ");
        accountNo1 = scanner.nextInt();
        System.out.println("\nEnter the Name of that Account Holder: ");
        name = scanner.next();

        System.out.println("Dear " + name1 + ", " + amount + " Transferred from Account number: " + accountNo + " to " + name + " whose ACCOUNT NUMBER: " + accountNo1);
    }



    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Bank b = new Bank();

        // Switch case
        System.out.println("1. Create Account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Check Balance");
        System.out.println("5. Transfer");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                b.createAccount();
                break;
            case 2:
                b.deposit();
                break;
            case 3:
                b.withdraw();
                break;
            case 4:
                b.checkBalance();
                break;
            case 5:
                b.transfer();
                break;
            default:
                System.out.println("\nYou have entered the wrong choice");
                break;
        }
    }
}
