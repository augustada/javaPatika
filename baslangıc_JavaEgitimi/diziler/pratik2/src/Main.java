import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] list = {15,12,788,1,-1,-778,2,0};
        System.out.println("Dizi = " + Arrays.toString(list));
        Arrays.sort(list);
        //System.out.println("Sıralı Dizi = " + Arrays.toString(list));
        int sayi;
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı girin = ");
        sayi= input.nextInt();
        System.out.println("Girilen sayı = " + sayi);

        int min = list[0];
        int max = list[0];

        for (int i=0; i<list.length; i++) {
            if (list[i] < sayi) {
                min = list[i];  // sayidan kücük en büyük sayi
            }
            if (list[i] > sayi) {
                max = list[i];
                break;  // buyuk sayıyı buldugu anda döngüden cıkmalı
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : = " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : = " + max);
    }
}