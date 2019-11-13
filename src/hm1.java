import java.util.Arrays;

public class hm1 {

    public static void main(String[] args) {

//task1
        int a = 5;
        int b = 6;
        int c = 20;
        int d = 30;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};
        int[] arrSort = {31, 22, 43, 17, 95, 566, 127, 348, 96, 1010, 171, 1772, 1345, 104, 1125, 116, 117, 148, 1967, 2054, 321};


        System.out.println(" TASK 1:");
        System.out.println((double) (a + b) / (c + d) * 2);
        System.out.println((a + 2 * 2 - (double) 12 / (a * (b - c))));
        System.out.println(b + 11 * c - a);
        System.out.println(a * (b + c + d) - Math.exp(1) / (1 + a));
        System.out.println(a + (double) b * (a - b) / 12);

//task2
        System.out.println("\n\n TASK 2");
        //2
        System.out.println("Деление на 2: ");
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.print(i);
                System.out.print(" ");
            } else {

            }

        }
        //3
        System.out.println("\nДеление на 3: ");
        for (int i : arr) {
            if (i % 3 == 0) {
                System.out.print(i);
                System.out.print(" ");
            } else {

            }

        }
        //5
        System.out.println("\nДеление на 5: ");
        for (int i : arr) {
            if (i % 5 == 0) {
                System.out.print(i);
                System.out.print(" ");
            } else {

            }

        }
        //7
        System.out.println("\nДеление на 7: ");
        for (int i : arr) {
            if (i % 7 == 0) {
                System.out.print(i);
                System.out.print(" ");
            } else {

            }

        }

        System.out.println("\n\n TASK 3");
        Arrays.sort(arrSort);
        System.out.println(Arrays.toString(arrSort));
    }
}
