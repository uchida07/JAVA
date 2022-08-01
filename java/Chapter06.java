public class Chapter06 {
    public static void main(String[] args) {
        // int a = 10;
        // System.out.println(a=10);
        // System.out.println(a+=5);
        // System.out.println(a-=3);
        // System.out.println(a*=4);
        // System.out.println(a/=2);
        // System.out.println(a%=7);
    //     int a = 5;
    //     boolean c;
    //     System.out.println( c = a < 5);
    //    System.out.println( c = a <= 5);
    //    System.out.println(c = a > 4);
    //    System.out.println(c = a >= 6);
    //    System.out.println(  c = a == 5);
    //    System.out.println( c = a != 5);
    int val = 2+5;
    System.out.println(val);
    val++;
        System.out.println(val);

        val *= 5;
        System.out.println(val);

        boolean bool = (val == 50);
        System.out.println(bool);

        bool = (val < 50) && (val % 10 == 0);
        System.out.println(bool);
    }
}