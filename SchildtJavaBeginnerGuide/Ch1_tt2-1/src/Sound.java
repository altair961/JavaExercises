public class Sound {
    public static void main(String[] args) {
        double soundSpeedFeetPerSecond = 1100;
        double soundTravelTimeSeconds = 7.2;

        double distance = soundTravelTimeSeconds * soundSpeedFeetPerSecond;

        System.out.println("The lightning is " + distance + " feet away.");
    }
}