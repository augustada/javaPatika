import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int sayi;int sum=0;int count=0;
        Scanner inp=new Scanner(System.in);
        System.out.print("Sayı: ");
        sayi=inp.nextInt();
        for(int i=1; i<=sayi; i++){
            if(i%3==0 && i%4==0){
                System.out.println(i);
                count++;
                sum+=i;
            }
        }
        System.out.print("Ort: "+sum/count);
    }
}