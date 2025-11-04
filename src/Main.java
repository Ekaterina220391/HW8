
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
        for (int i = 0; i < second.length; i++) {
            System.out.println(second[i]);
        }

        System.out.println("Задача 2");
        System.out.println(Arrays.toString(weight));
        System.out.println(Arrays.toString(second));

        System.out.println("Задача 3");
        for (int j = 2; j>=0; j--) {
            if (weight[j] == j + 1) {
                System.out.print(weight[j] + " ");

            }
        }
        System.out.println("\n");

        System.out.println("Задача 3.1");
        for (int f = 2; f >= 0; f--) {

                System.out.print(second[f] + " ");

        }
        System.out.println("\n");
        System.out.println("Задача 4");
        for (int d=0; d <weight.length; d++){
            if (weight[d]%2!=0) {
                weight[d] = weight[d] + 1;
            }
                System.out.println(Arrays.toString(weight));



        }



            }
        }



















