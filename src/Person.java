public class Person {
    String name;
    int age;
    static int numberOfPeople = 0;

    void introduceYourself() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }

    void introduceYourself(String greeting) {
        System.out.println(greeting + "! My name is " + name + " and I am " + age + " years old.");
    }

    boolean isAdult() {
        return age >= 18;
    }

    int compareAge(Person other) {
        return this.age - other.age;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        numberOfPeople++;
    }

    Person(String name) {
        this(name, 0);
    }

    public static void main(String[] args) {
        System.out.println("Task 1");
        Person person1 = new Person("Christian", 21);
        person1.introduceYourself();

        System.out.println("Task 2");
        person1.introduceYourself();
        person1.introduceYourself("Hello");

        System.out.println("Task 3");
        Person person2 = new Person("Ala", 23);
        Person person3 = new Person("Kuba");
        person2.introduceYourself();
        person3.introduceYourself();

        System.out.println("Task 4");
        person2.introduceYourself();
        person3.introduceYourself();

        System.out.println("Task 5");
        Person person4 = new Person("Maciej", 18);
        Person person5 = new Person("Julia", 5);
        Person person6 = new Person("Anastazja", 31);
        System.out.println("Number of people (via class): " + Person.numberOfPeople);
        System.out.println("Number of people (via object): " + person1.numberOfPeople);

        System.out.println("Task 6");
        Person[] people = new Person[3];
        people[0] = person4;
        people[1] = person5;
        people[2] = person6;

        for (int i = 0; i < people.length; i++) {
            people[i].introduceYourself();
            if (people[i].isAdult()) {
                System.out.println("-> this person is an adult.");
            } else {
                System.out.println("-> this person is not an adult");
            }
        }
        System.out.println("Task 7");
        int difference = person4.compareAge(person5);
        if (difference > 0) {
            System.out.println(person4.name + " is " + difference + " years older than " + person5.name);
        } else if (difference < 0) {
            System.out.println(person5.name + " is " + (-difference) + " years older than " + person4.name);
        } else {
            System.out.println("Same age");
        }
    }
}