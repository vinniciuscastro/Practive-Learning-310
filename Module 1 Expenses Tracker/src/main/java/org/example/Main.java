package org.example;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);

        // before a user is created
        User currentUser = null;

        while (loop) {
            System.out.println("Expense Tracker Menu Options:");
            System.out.println("1. Create a new account");
            System.out.println("2. Add a new expense");
            System.out.println("3. Display expenses and check balance");
            System.out.println("4. Quit");
            System.out.print("Select a choice from the menu: ");

            try {
                int prompt = scanner.nextInt();
                scanner.nextLine();  // Consume the newline character

                switch (prompt) {
                    case 1:
                        currentUser = User.createUserFromInput();
                        System.out.println("Account created successfully!");
                        break;
                    case 2:
                        if (currentUser != null) {
                            Expenses expense = Expenses.createExpensesFromInput();
                            currentUser.addExpense(expense);
                            System.out.println("Expense added successfully!");
                        } else {
                            System.out.println("Please create an account first.");
                        }
                        break;
                    case 3:
                        if (currentUser != null) {
                            System.out.println("________________________________________________");
                            System.out.println(currentUser.getName() + " Account Information");
                            System.out.println("Purchase History:");
                            System.out.println(" ");
                            for (Expenses expense : currentUser.getExpenses()) {
                                System.out.println("Description: " + expense.getDescription() + ", Amount: " + expense.getAmount());
                            }
                            DecimalFormat decimalFormat = new DecimalFormat("#.##");
                            System.out.println("Balance");

                            System.out.println("Total in your Savings: $" + decimalFormat.format(currentUser.getBalance()));
                            System.out.println("________________________________________________");


                        } else {
                            System.out.println("Please create an account first.");
                        }
                        break;
                    case 4:
                        loop = false;
                        System.out.println("Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose a valid option.");
                        break;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid numeric value.");
                scanner.nextLine();  // Consume the invalid input to avoid an infinite loop
            }
        }

        scanner.close();
    }
}

