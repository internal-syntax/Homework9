import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] integer = new int[3];
        integer[0] = 1;
        integer[1] = 2;
        integer[2] = 3;
        double[] fractional = {1.57, 7.654, 9.986};
        int[] arbitrary = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] integer = new int[3];
        integer[0] = 1;
        integer[1] = 2;
        integer[2] = 3;
        double[] fractional = {1.57, 7.654, 9.986};
        int[] arbitrary = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.print(integer[0] + ", " + integer[1] + ", " + integer[2]);
        System.out.println();
        System.out.println();
        for (int i = 0; i < fractional.length; i++) {
            System.out.print(fractional[i]);
            if (i != fractional.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < arbitrary.length; i++) {
            System.out.print(arbitrary[i]);
            if (i != arbitrary.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] integer = new int[3];
        integer[0] = 1;
        integer[1] = 2;
        integer[2] = 3;
        double[] fractional = {1.57, 7.654, 9.986};
        int[] arbitrary = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.print(integer[2] + ", " + integer[1] + ", " + integer[0]);
        System.out.println();
        System.out.println();
        for (int i = fractional.length - 1; i >= 0; i--) {
            System.out.print(fractional[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();
        for (int i = arbitrary.length - 1; i >= 0; i--) {
            System.out.print(arbitrary[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }


    public static void task4() {
        System.out.println("Задача 4");
        int[] integer = new int[3];
        integer[0] = 1;
        integer[1] = 2;
        integer[2] = 3;
        for (int i = 0; i < integer.length; i++) {
            if (integer[i] % 2 != 0) {
                integer[i] = integer[i] + 1;
            }
        }
        System.out.println(Arrays.toString(integer));
    }
}