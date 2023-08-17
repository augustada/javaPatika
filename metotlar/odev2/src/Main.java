import java.util.Scanner;

public class Main {

    static int asal(int sayi, int i) {

        if(sayi==1) {
            return 0;                      // 1 sayisi asal degildir
        }
        else {
            if (i == 0)
                return 1;                   //bölen 0a geldiyse asaldir
            if(i==1)
                return asal(sayi, i - 1); //1e bölme işlemini atla
            if (sayi % i == 0)              //böleni varsa asal degil
                return 0;
            else
                return asal(sayi, i - 1);
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int sayi = scan.nextInt();
        int result = asal(sayi, sayi - 1);
        if (result == 1) {
            System.out.println(sayi + " asal sayıdır");
        } else {
            System.out.println(sayi + " asal sayı değildir");
        }

    }
}