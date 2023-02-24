import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 1.8. Arrays");

        lesson();
    }

    private static void lesson() {
        System.out.println("Lesson 8. Arrays");
        int[] monthsWeights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        int month = 0;

        monthsWeights[0] = 90;
        System.out.println(monthsWeights[month]);

        for (int i = 0; i < monthsWeights.length; i++) {
            System.out.print(monthsWeights[i] + " ");
        }

        System.out.println("\n");
    }
}