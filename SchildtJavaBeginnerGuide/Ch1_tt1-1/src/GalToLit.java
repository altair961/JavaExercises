public class GalToLit {
    public static void main(String[] args) {
        double gallons = 10.0;
        double liters = 0;
        double litersInGallon = 3.7854;

        liters = gallons * litersInGallon;

        System.out.println(gallons + " gallons is " + liters);
    }
}