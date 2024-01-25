package interview;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the number = ");
        try (Scanner scanner = new Scanner(System.in)) {
            int number = 0;
            boolean success = scanner.hasNextInt();
            if (success) {
                number = scanner.nextInt();
                Solution.PrintGrid(number);
            } else {
                System.out.println("Invalid number");
            }
        }
    }
}