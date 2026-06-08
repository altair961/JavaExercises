public class GalToLitTable {
    public static void main(String[] args) {
        double liters, gallons;
        double litersInGallon = 3.7854;
        int counter = 0;
        for(gallons = 1; gallons <= 100; gallons++) {
            liters = litersInGallon * gallons;
            System.out.println(gallons + " gallons is " + liters + " liters.");
            counter++;

            if(counter == 10) {
                System.out.println();
                counter = 0;
            }
        }
    }
}