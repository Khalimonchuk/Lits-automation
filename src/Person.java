

public class Person {

    public Person(String name) {
        this.name = name;

    }

    public Person (int age, String name) {
        this.age = age;
        this.name=name;


    }


    public Person (String name, int age) {
        System.out.println("test");
        this.name = name;
        this.age = age;


    }

    String name;
    int age;

    public void whoAmI() {
        System.out.println("My name is " + name);
    }

    public int getAge() {
        return age;
    }

 //   public Person ageTo18() {
   //     int b = 18 - age;
     //   return b;

     public Person getPerson() {
         return this;
        }



        // через вайл парные значение





    }


