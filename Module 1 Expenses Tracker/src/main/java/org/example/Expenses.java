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

    public static Expenses createExpenseFromInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter expense description: ");
        String description = scanner.nextLine();

        System.out.print("Enter expense amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        return new Expenses(description, amount);
    }
}
