import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int sayi;int sum=0;
        boolean kontrol=false;
        Scanner inp=new Scanner(System.in);
        while (!kontrol){
            System.out.print("Sayı: ");
            sayi=inp.nextInt();
            if(sayi%2==1){
                kontrol=true; // tek sayi girilene kadar giris yapilir
            }else if(sayi%4==0){
                sum+=sayi;
            }
        }
        System.out.println("2 ve 4ün katı olan sayıların toplamı: "+sum);
    }
}