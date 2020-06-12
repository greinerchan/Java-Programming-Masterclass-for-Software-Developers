public class DecimalComparator {
    public static void main(String[] args){
        boolean ans = areEqualByThreeDecimalPlaces(3.1756,3.1755);
        System.out.println(ans);
    }
    public static boolean areEqualByThreeDecimalPlaces(double x, double y){
        float diff = (float)(x - y);
        //System.out.println(diff);
        if (Math.abs(diff) <= 0.001) {
            return true;
        } else {
            return false;
        }
    }
}
