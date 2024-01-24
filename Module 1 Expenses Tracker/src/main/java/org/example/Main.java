package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);

        while (loop) {
            System.out.println("Expense tracker Menu Options:");
            System.out.println("Type 1 for new account");
            System.out.println("Type 2 for adding new expense");
            System.out.println("Type 3 to check balance");
            System.out.println("Type 4 Quit");
            System.out.print("Select a choice from the menu: ");

            int prompt = scanner.nextInt();

            if (prompt == 4) {
                loop = false;
            }
        }

        scanner.close();
    }
}

