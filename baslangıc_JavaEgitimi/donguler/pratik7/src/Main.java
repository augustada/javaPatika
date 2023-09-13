import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int sayi;double toplam=0;
        Scanner inp = new Scanner(System.in);
        System.out.print("N sayısı: ");
        sayi = inp.nextInt();
        for(int i=1;i<=sayi;i++){
            toplam+=(1.0/i);
        }
        System.out.println(toplam);
    }
}