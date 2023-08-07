import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int kilo;
        double boy,indeks;
        Scanner input = new Scanner(System.in);
        System.out.print("Boy Giriniz : ");
        boy = input.nextDouble();
        System.out.print("Kilo Giriniz : ");
        kilo = input.nextInt();
        indeks=kilo/(boy*boy);
        System.out.print("Vücut Kitle Endeksiniz : "+indeks);
    }
}