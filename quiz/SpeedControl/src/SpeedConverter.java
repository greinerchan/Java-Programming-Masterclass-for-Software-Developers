public class SpeedConverter {
    public static void main(String[] args) {
        long toMilesPerHour = toMilesPerHour(1.5);
        System.out.println(toMilesPerHour);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        long mile;
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            mile = (long) (kilometersPerHour * 0.621371);
            mile = Math.round(mile);
            return mile;
        }
    }
}
