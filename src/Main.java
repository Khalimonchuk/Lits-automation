import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Array ar1 = new Array();
        Array ar4 = new Array (new int[]{1,26,3,5,655,3432,76,2,2,2,42,56,76,88,98});


        System.out.println(ar4.max());
        System.out.println(ar4.min());
        System.out.println(ar4.avg());
        System.out.println(Arrays.toString(ar4.even()));
        System.out.println(Arrays.toString(ar4.odd()));
        System.out.println(Arrays.toString(ar1.random()));


    }
}
