package astonTasks;

import java.util.Scanner;

public class FirstTask {
    public static void greetingWithCondition() {
        System.out.println("Первое задание. \nВведите число:");
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        if (number > 7.0) {
            System.out.println("Привет");
        }
        System.out.println("----------------------------------");
    }
}