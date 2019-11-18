import java.util.Arrays;


public class Array {


    int[] arr;
    int count;

    public Array() {
    }

    public Array(int[] arr) {
        this.arr = arr;
    }


    //avg of array
    public double avg() {
        int sum = 0;
        int i;
        for (i = 0; i < arr.length; i++)
            sum += arr[i];
        double avg = (double) sum / arr.length;
        return avg;
    }

    // max value
    public int max() {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
//test2

    // min value
    public int min() {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }


    //even array
    public int[] even() {

        int sizeOfEven = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                sizeOfEven++;
            } else {

            }
        }

        int g = 0;
        int[] even = new int[sizeOfEven];
        for (int i : arr) {
            if (i % 2 == 0) {
                even[g] = i;
                g++;
            } else {

            }


        }
        return even;
    }


    //od array
    public int[] odd() {
        int sizeOfOdd=0;
        for (int i : arr) {
            if (i % 2 == 1) {
                sizeOfOdd++;
            }
        }
            int g=0;
            int[] odd = new int[sizeOfOdd];
            for (int i : arr) {
                if (i % 2 == 1) {
                    odd[g] = i;
                    g++;
                } else {

                }

            }
        return odd;
    }


    //random array
    public int[] random(){
        double a = 100*Math.random();
        int sizeOfRandom = (int) Math.round(a);
        int [] random = new int[sizeOfRandom];

        for (int i = 0; i < a-1; i++)
            random[i] = (int) Math.round(100 * Math.random());

        return random;
    }



    }






/*



                //even by array
    public ArrayList even() {

        ArrayList even = new ArrayList();
        for (int i : arr) {
            if (i % 2 == 0) {
                even.add(i);
            } else {

            }


        }
        return even;
    }

    //odd by array
    public ArrayList odd() {

        ArrayList odd = new ArrayList();
        for (int i : arr) {
            if (i % 2 == 1) {
                odd.add(i);
            } else {

            }


        }
        return odd;
    }



    //index


    public int [] index (){




    }
*/



