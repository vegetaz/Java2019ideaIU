package BTCoBan;

public class BTCoBan06 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        System.out.println("x is " + Integer.toBinaryString(x));
        System.out.println("y is " + Integer.toBinaryString(y));

        x >>= 2;
        y >>= 2;
        System.out.println("x >>= 2 is " + Integer.toBinaryString(x));
        System.out.println("y >>= 2 is " + Integer.toBinaryString(y));

        x <<= 10;
        y <<= 10;
        System.out.println("x <<= 10 is " + Integer.toBinaryString(x));
        System.out.println("y <<= 10 is " + Integer.toBinaryString(y));

        x >>>= 10;
        y >>>= 10;
        System.out.println("x >>>= 10 is " + Integer.toBinaryString(x));
        System.out.println("y >>>= 10 is " + Integer.toBinaryString(y));
    }
}
