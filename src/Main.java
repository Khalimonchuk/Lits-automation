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

//test2

/*        Person person = new Person("Alan", 34);
        Person person2 = new Person(34 , "test");
        Person person3 = new Person ("test");

        Person pers4 = person2.getPerson();
        System.out.println(pers4.name);


       // int b = person3.ageTo18();


        person.name = "John";

        System.out.println(person.name);
        System.out.println(person.age);

        person.whoAmI();

        ///fff

        int i=0;
        while (i<10) {
            i++;
            if (i%2==0) {
                System.out.println(i);
            }
            else {

            }
        }*/
    }
}
