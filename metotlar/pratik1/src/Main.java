import java.util.Scanner;
import java.math.*;

public class Main {
    static boolean palindrom(int num){
        int basamak=0; int temp=num,temp1=num;
        while (temp > 0) {
            basamak++;
            temp/=10;
        }
        int x,ters=0;
        while (temp1 > 0){
            basamak--;
            x=temp1%10;
            ters+=x*(Math.pow(10,basamak));
            temp1/=10;
        }
        if(num==ters)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı: ");
        sayi=input.nextInt();
        boolean paln=palindrom(sayi);
        if(paln){
            System.out.println(sayi+" palindrom sayıdır.");
        }
        else {
            System.out.println(sayi+" palindrom sayı değildir.");
        }
    }
}