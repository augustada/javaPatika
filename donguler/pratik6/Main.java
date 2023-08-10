import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int sayi,birler,onlar,yuzler,binler;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı: ");
        sayi = inp.nextInt();
        birler=sayi%10;
        onlar=(sayi%100-birler)/10;
        yuzler=(sayi%1000-onlar)/100;
        binler=(sayi-sayi%1000)/1000;
        System.out.println(birler+onlar+yuzler+binler);
    }
}