public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
            return;
        }
        int yearMin = 365 * 24 * 60;
        int dayMin = 24 * 60;
        int YY = (int) (minutes / yearMin);
        int ZZ = (int) ((minutes % yearMin) / dayMin);
        StringBuilder sb = new StringBuilder();
        sb.append(minutes).append(" min = ").append(YY).append(" y and ").append(ZZ).append(" d");
        System.out.println(sb);
    }
}
