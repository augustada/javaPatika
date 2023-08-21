import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int secim;
        double a,b,sonuc;
        Scanner inp = new Scanner(System.in);
        System.out.print("1.Sayı: ");
        a=inp.nextInt();
        System.out.print("2.Sayı: ");
        b=inp.nextInt();
        System.out.println("Yapılacak İşlem Seçin: +[1] -[2] *[3] /[4]");
        secim=inp.nextInt();

        switch (secim){
            case 1:
                sonuc=a+b;
                break;
            case 2:
                sonuc=a-b;
                break;
            case 3:
                sonuc=a*b;
                break;
            case 4:
                sonuc=a/b;
                break;
            default:
                System.out.println("Yanlış İşlem Girdiniz!");
                return;
        }
        System.out.println("Sonuç= "+sonuc);

    }
}