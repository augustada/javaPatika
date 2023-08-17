import java.util.Scanner;
import java.math.*;

public class Main {
    static int basamak(int a){
        int basamak=0;
        while (a > 0) {
            basamak++;
            a/=10;
        }
        return basamak;
    }
    static int tersi(int num){
        int x,ters=0;
        int n=basamak(num);
        while (num > 0){
            n--;
            x=num%10;
            ters+=x*(Math.pow(10,n));
            num/=10;
        }
        return ters;
    }
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı: ");
        sayi=input.nextInt();
        int n=basamak(sayi);
        int psayi=tersi(sayi);
        if(sayi==psayi){
            System.out.println(sayi+" palindrom sayıdır.");
        }
        else {
            System.out.println(sayi+" palindrom sayı değildir.");
        }
    }
}