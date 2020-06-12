public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (hourOfDay < 0 || hourOfDay > 23){
            return false;
        }
        else if ((hourOfDay < 8)  ||  (hourOfDay > 22)) {
            boolean hour = true;
            return barking && hour;
        }
        else {
            boolean hour = false;
            return barking && hour;
        }
    }
}
