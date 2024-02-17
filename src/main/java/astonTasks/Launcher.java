package astonTasks;

import static astonTasks.FirstTask.greetingWithCondition;
import static astonTasks.FourthTask.answer;
import static astonTasks.SecondTask.nameCheck;
import static astonTasks.ThirdTask.multiplicityCheck;

public class Launcher {
    public static void main(String[] args) {

        double[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11.3, 99};
        greetingWithCondition();
        nameCheck();
        multiplicityCheck(array);
        answer();
    }
}