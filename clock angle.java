public class Main {

    public static double clockAngle(String s) {
        String[] parts = s.split(":");

        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);

        hour %= 12;

        double hourAngle = hour * 30 + minute * 0.5;
        double minuteAngle = minute * 6;

        double angle = Math.abs(hourAngle - minuteAngle);

        return Math.min(angle, 360 - angle);
    }

    public static void main(String[] args) {
        System.out.printf("%.3f\n", clockAngle("06:00"));
        System.out.printf("%.3f\n", clockAngle("03:15"));
    }
}
