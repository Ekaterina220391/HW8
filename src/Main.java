
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;

        System.out.println(weight[0]);
        System.out.println(weight[1]);
        System.out.println(weight[2]);

        System.out.println("Задача 1.2");
        double[] second = {1.57, 7.654, 9.986};
        for (int l = 0; l < second.length; l++) {
            System.out.println(second[l]);
        }

        System.out.println("Задача 1.3");

        int[] third = {0, 80, 90, 120, 200};
        for (int r = 0; r < third.length; r++) {
            System.out.println(third[r]);
        }


        System.out.println("Задача 2");
        System.out.println(Arrays.toString(weight));
        System.out.println(Arrays.toString(second));
        System.out.println(Arrays.toString(third));


        System.out.println("\n");
        System.out.println("Задача 3.1");
        int j;
        for (j = weight.length - 1; j >= 0; j--) {
            System.out.print(weight[j] + ",");
        }
        System.out.println("\n");

        System.out.println("Задача 3.2");
        for (int f = second.length - 1; f >= 0; f--) {
            System.out.print(second[f] + ",");


        }
        System.out.println("\n");

        System.out.println("Задача 3.3");
        for (int m = third.length - 1; m >= 0; m--) {
            System.out.print(third[m] + ",");
        }
        System.out.println("\n");
        System.out.println("Задача 4");
        for (int d = 0; d < weight.length; d++) {
            if (weight[d] % 2 != 0) {
                weight[d] = weight[d] + 1;
            }
            System.out.println(Arrays.toString(weight));
        }


    }
}




















