public class Sound {
    public static void main(String[] args) {
        double soundSpeedFeetPerSecond = 1100;
        double echoRoundTripTime = 7.2;
        double soundTravelTimeSeconds = echoRoundTripTime / 2;
        double distance = soundTravelTimeSeconds * soundSpeedFeetPerSecond;

        System.out.println("The rock wall is " + distance + " feet away.");
    }
}