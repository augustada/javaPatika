import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int sayi;int sum=0;
        Scanner inp=new Scanner(System.in);
        System.out.print("Sayı: ");
        sayi=inp.nextInt();
        System.out.println(sayi+"'dan küçük 4'ün kuvvetleri");
        for (int i=1; i<=sayi;i*=4){
            if(i==1)
                continue;
         System.out.println(i);
        }
        System.out.println();
        System.out.println(sayi+"'dan küçük 5'ün kuvvetleri");
        for (int i=1; i<=sayi;i*=5){
            if(i==1)
                continue;
            System.out.println(i);
        }
    }
}