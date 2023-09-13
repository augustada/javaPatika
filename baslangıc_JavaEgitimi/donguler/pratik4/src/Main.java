import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int sayi1;
        int sayi2;
        int fac1 = 1;
        int fac2 = 1;
        int fac3 = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("1.Sayı: ");
        sayi1 = inp.nextInt();
        System.out.print("2.Sayı: ");
        sayi2 = inp.nextInt();
        if (sayi2 > sayi1) {
            System.out.println("2.Sayı daha büyük olamaz!!");
        } else {
            int fark = sayi1 - sayi2;
            while (sayi1 > 0) {
                fac1 = fac1 * sayi1;
                sayi1--;
            }
            while (sayi2 > 0) {
                fac2 = fac2 * sayi2;
                sayi2--;
            }
            while (fark > 0) {
                fac3 = fac3 * fark;
                fark--;
            }
            int sonuc = fac1 / (fac2 * fac3);
            System.out.println("Sonuc=" + sonuc);
        }
    }
}