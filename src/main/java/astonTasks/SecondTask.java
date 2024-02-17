package astonTasks;

import java.util.Scanner;

public class SecondTask {
    public static void nameCheck() {

        System.out.println("Второе задание. \nВведите имя:");

        Scanner scanner = new Scanner(System.in);

        String name = "Вячеслав";
        String enteredName = scanner.nextLine();
        String answer = enteredName.equals(name) ? "Привет, " + name : "Нет такого имени";

        System.out.println(answer);
        System.out.println("----------------------------------");
    }
}