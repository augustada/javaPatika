import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int r,a;
        double alan,cevre,dairedilimi;
        double pi=3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Dairenin Yarı Çapını Giriniz : ");
        r = input.nextInt();
        System.out.print("Lütfen Merkez Açısını Giriniz : ");
        a = input.nextInt();

        alan = pi * r * r ;
        cevre = 2 * pi * r;
        dairedilimi = ((alan * a) / 360);

        System.out.println("Dairenizin Alanı : " + alan);
        System.out.println("Dairenizin Çevresi : " + cevre);
        System.out.println("Dairenizin Dilimi Alanı : " + dairedilimi);
    }
}