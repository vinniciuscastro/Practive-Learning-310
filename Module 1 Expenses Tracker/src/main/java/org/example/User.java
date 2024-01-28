package org.example;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class User {
    private String name;
    private String type;
    private double saving;
    private List<Expenses> expenses;

    public User(String name, double saving) {
        this.name = name;
        this.saving = saving;
        this.expenses = new ArrayList<>();
    }

    public void addExpense(Expenses expense) {
        expenses.add(expense); // Corrected the method name to 'expenses'
    }

    public List<Expenses> getExpenses() {
        return expenses;
    }
    public String getName() {
        return name;
    }

    public double getSaving() {
        return saving;
    }

    public double getBalance() {
        double totalExpenses = expenses.stream().mapToDouble(Expenses::getAmount).sum();
        return saving - totalExpenses;
    }
    public static User createUserFromInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's create a quick profile");

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("How much you have in your savings: ");
        double saving = scanner.nextDouble();
        scanner.nextLine();

        if (scanner.hasNextDouble()) {
            saving = scanner.nextDouble();
        } else {
            System.out.println("Invalid amount. Defaulting to 0.");
            scanner.nextLine();
        }

        scanner.nextLine();
        return new User(name, saving);
    }
}


