public class MegaBytesConverter {
    public static void main(String[] args){
        printMegaBytesAndKiloBytes(0);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        }
        else {
            int XX = kiloBytes;
            int ZZ = XX % 1024;
            int YY = XX / 1024;
            System.out.println(XX + " KB " + " == " + YY + " MB and " + ZZ + "KB");
        }
    }
}
