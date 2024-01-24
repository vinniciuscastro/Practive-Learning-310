package org.example;
import java.util.Scanner;
public class User {
    private String name;
    private double saving;

    public User(String name, double saving) {
        // Add validation if needed
        this.name = name;
        this.saving = saving;
    }
    public static User createUserFromInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Let's create a quick profile");

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("How mcuh you have in your savings: ");
        double saving = scanner.nextDouble();
        scanner.nextLine();

        return new User(name, saving);
    }
}




