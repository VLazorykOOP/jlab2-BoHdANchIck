package MyClasses;

public class Account {

    private String owner;
    private int number;
    private double percent;
    private double sum;

    public Account(String owner, int number, double percent, double sum) {
        this.owner = owner;
        this.number = number;
        this.percent = percent;
        this.sum = sum;
    }

    public void changeOwner(String newOwner) {
        this.owner = newOwner;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= sum) {
            sum -= amount;
        } else {
            System.out.println("Insufficient funds or invalid amount: " + amount);
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            sum += amount;
        } else {
            System.out.println("Invalid deposit amount: " + amount);
        }
    }

    public void addPercent() {
        if (percent > 0) {
            sum += sum * (percent / 100);
        } else {
            System.out.println("Invalid interest rate: " + percent);
        }
    }

    public double getSum() {
        return sum;
    }

    public String getAccInfo() {
        return "Owner: " + owner + "\n" +
                "Number: " + number + "\n" +
                "Percent: " + percent + "%\n" +
                "Sum: " + sum + " грн";
    }

}
