import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int yil;
        Scanner inp=new Scanner(System.in);
        System.out.print("Yıl: ");
        yil=inp.nextInt();
        System.out.println((yil%100==0 && yil%400==0 || (yil%100!=0 && yil%4==0)) ? "Artık Yıl" : "Artık Yıl Değildir");
    }
}