package Task11;

public class Main {
    public static void main(final String[] args) {
        final Driver[] drivers = new Driver[3];

        drivers[0] = new Driver("Oleg", "Kalka");
        drivers[1] = new Driver("Vitaliy", "Malanych");
        drivers[2] = new Driver("Taras", "Nalivayko");

        final Taxi taxiCar = new Taxi("Ferrari", 5, true, drivers);

        System.out.println(taxiCar);
    }
}
