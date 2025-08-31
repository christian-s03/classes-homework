public class Car {
    String brand;
    int yearOfProduction;
    static int counter = 0;

    public Car(String brand, int yearOfProduction) {
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
        counter++;
    }

    public Car() {
        this("Unknown", 2000);
    }

    public void showDifference() {
        String brand = "Lexus";   // Local brand -- Task 4
        System.out.println("Local brand: " + brand);
        System.out.println("this.brand : " + this.brand);     // this.brand
    }

    public void changeBrand(String Brand) {
        this.brand = Brand;
    }

    public void introduceYourself() {
        System.out.println("I'm a car of brand " + brand + " and year of production " + yearOfProduction);
    }

    public static void classDescription() {
        System.out.println("This class represents cars.");
    }

    public void showCars() {
        System.out.println("Car brand: " + brand + " year of production: " + yearOfProduction);
    }

    public static void main(String[] args) {

        System.out.println("Task 1");
        Car car = new Car();
        car.brand = "Lexus";
        car.yearOfProduction = 2000;
        System.out.println(car.brand + car.yearOfProduction);

        System.out.println("Task 2");
        Car car1 = new Car();
        System.out.println(car1.brand + " " + car1.yearOfProduction);

        System.out.println("Task 3");
        Car car2 = new Car("Toyota", 2023);
        System.out.println(car2.brand + " " + car2.yearOfProduction);

        System.out.println("Task 4");
        Car car3 = new Car();
        car3.showDifference();

        System.out.println("Task 5");
        car2.changeBrand("BMW");
        System.out.println(car2.brand);

        System.out.println("Task 6");
        Car car4 = new Car();
        System.out.println(car4.brand + " " + car4.yearOfProduction);

        System.out.println("Task 7");
        Car car5 = new Car("Mercedes", 2021);
        car5.introduceYourself();

        System.out.println("Task 8");
        Car.classDescription();

        System.out.println("Task 9");
        System.out.println("Number of car fields is " + counter);

        System.out.println("Task 10");
        Car[] cars = new Car[3];

        cars[0] = new Car("Mercedes", 2021);
        cars[1] = new Car("Toyota", 2021);
        cars[2] = new Car("Volvo", 2018);

        for (int i = 0; i < cars.length; i++) {
            cars[i].showCars();
        }
    }
}
