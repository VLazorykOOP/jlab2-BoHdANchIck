import MyClasses.Account;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name of Owner: ");
        String owner = scanner.nextLine();

        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        System.out.println("Enter percent: ");
        double percent = scanner.nextDouble();

        System.out.println("Enter sum: ");
        double sum = scanner.nextDouble();

        Account objAccount = new Account(owner, number, percent, sum);

        scanner.nextLine();

        System.out.println("Enter new owner: ");
        String newOwner = scanner.nextLine();
        objAccount.changeOwner(newOwner);

        System.out.println("Enter how much money you want to take: ");
        double withdrawAmount = scanner.nextDouble();
        objAccount.withdraw(withdrawAmount);

        System.out.println("Enter how much money you want to put: ");
        double depositAmount = scanner.nextDouble();
        objAccount.deposit(depositAmount);

        objAccount.addPercent();

        System.out.println("Info: ");
        System.out.println(objAccount.getAccInfo());

        scanner.close();
    }
}
