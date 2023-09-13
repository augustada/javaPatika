import java.util.Scanner;
import java.math.*;

public class Main {

    static int power(int base,int exponent) {
        Scanner scan = new Scanner(System.in);
        int result=1;
        if (base == 1 || exponent == 0) {
            return result;
        }
        result=base*power(base, exponent-1);
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        System.out.println("Sonuç = " + power(base,exponent));

    }
}