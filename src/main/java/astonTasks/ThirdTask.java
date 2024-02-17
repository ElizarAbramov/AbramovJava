package astonTasks;

public class ThirdTask {
    public static void multiplicityCheck(double[] array) {
        System.out.println("Третье задание");
        for (double el : array
        ) {
            if (el % 3 == 0) {
                System.out.println(el);
            }
        }
        System.out.println("----------------------------------");
    }
}