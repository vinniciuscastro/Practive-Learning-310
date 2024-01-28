package org.example;

import java.util.Scanner;


public class Expenses {
    private String description;
    private double amount;

    public Expenses(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    // Getter methods...
    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }
    public static Expenses createExpensesFromInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter expense description: ");
        String description = scanner.nextLine();

        double amount;
        while (true) {
            try {
                System.out.print("Enter expense amount: ");
                amount = scanner.nextDouble();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid amount. Please enter a numeric value.");
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        return new Expenses(description, amount);
    }
}
