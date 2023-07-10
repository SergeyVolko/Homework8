import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        double[] b = {1.57, 7.654, 9.986};
        char[] c = {'a', 'b', 'c', 'd'};
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.println(a[i]);
                break;
            }
            System.out.print(a[i] + ", ");
        }

        double[] b = {1.57, 7.654, 9.986};
        for (int i = 0; i < b.length; i++) {
            if (i == b.length - 1) {
                System.out.println(b[i]);
                break;
            }
            System.out.print(b[i] + ", ");
        }

        char[] c = {'a', 'b', 'c', 'd'};
        for (int i = 0; i < c.length; i++) {
            if (i == c.length - 1) {
                System.out.println(c[i]);
                break;
            }
            System.out.print(c[i] + ", ");
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        for (int i = a.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(a[i]);
                break;
            }
            System.out.print(a[i] + ", ");
        }

        double[] b = {1.57, 7.654, 9.986};
        for (int i = b.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(b[i]);
                break;
            }
            System.out.print(b[i] + ", ");
        }

        char[] c = {'a', 'b', 'c', 'd'};
        for (int i = c.length - 1; i >= 0 ; i--) {
            if (i == 0) {
                System.out.println(c[i]);
                break;
            }
            System.out.print(c[i] + ", ");
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 > 0) {
                a[i]++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}