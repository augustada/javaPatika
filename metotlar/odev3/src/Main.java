import com.sun.org.apache.xerces.internal.xs.ItemPSVI;

import java.util.Scanner;

public class Main {

    static int desen(int sayi,int temp,boolean stop) {
        System.out.println(sayi);
        if (sayi < 0 || sayi == 0 || !stop) {
            stop = false;
            if (sayi != temp) {
                return desen(sayi + 5,temp, stop);
            } else
                return 0;
        } else {
            return desen(sayi - 5,temp, stop);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int sayi = scan.nextInt();
       desen(sayi,sayi,true);

    }
}