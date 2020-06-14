public class Overload {
    public static int overLoadTest(int a, String b){
        return a;
    }
    public static int overLoadTest(int a, int b){
        return b;
    }
    public static String overLoadTest(String a){
        return a;
    }
    public static int overLoadTest(String a, int b){
        return b;
    }
    public static void main(String[] args){
        System.out.println(overLoadTest("sss"));
        System.out.println(overLoadTest("sss", 6));
        System.out.println(overLoadTest(6, "sss"));
    }
}
