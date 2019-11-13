

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Alan", 34);
        Person person2 = new Person(34 , "test");
        Person person3 = new Person ("test");

        Person pers4 = person2.getPerson();
        System.out.println(pers4.name);


       // int b = person3.ageTo18();


        person.name = "John";

        System.out.println(person.name);
        System.out.println(person.age);

        person.whoAmI();


        int i=0;
        while (i<10) {
            i++;
            if (i%2==0) {
                System.out.println(i);
            }
            else {

            }
        }
    }
}
