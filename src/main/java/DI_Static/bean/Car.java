package DI_Static.bean;

public class Car {

    private static String carname;
    public static void setCarname(String carname) {
        Car.carname = carname;
    }

    public  void printCar() {
        System.out.println("Carname is - " + carname);
    }
}
