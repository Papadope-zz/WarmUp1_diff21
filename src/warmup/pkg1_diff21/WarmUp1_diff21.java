package warmup.pkg1_diff21;

public class WarmUp1_diff21 {

    public static void main(String[] args) {
        System.out.println(diff21(19));
        System.out.println(diff21(10));
        System.out.println(diff21(21));
        System.out.println(diff21(22));
        System.out.println(diff21(25));
    }

    public static int diff21(int n) {
        int modulo = 0;
        if (n <= 21) {
            modulo = 21 - n;

        } else {
            n = n - 21;
            modulo = n * 2;
        }
        return modulo;
    }
}
