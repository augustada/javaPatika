import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        double armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;
        double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5.0;
        double toplamFiyat;

        System.out.print("Armut kilosunu giriniz: ");
        armutKilo = inp.nextInt();

        System.out.print("Elma kilosunu giriniz: ");
        elmaKilo = inp.nextInt();

        System.out.print("Domates kilosunu giriniz: ");
        domatesKilo = inp.nextInt();

        System.out.print("Muz kilosunu giriniz: ");
        muzKilo = inp.nextInt();

        System.out.print("Patlıcan kilosunu giriniz: ");
        patlicanKilo = inp.nextInt();

        toplamFiyat = (armutKilo * armutFiyat) + (elmaKilo * elmaFiyat) + (domatesKilo * domatesFiyat) +
                (muzKilo * muzFiyat) + (patlicanKilo * patlicanFiyat);

        System.out.println("Toplam fiyat = " + toplamFiyat);

    }
}