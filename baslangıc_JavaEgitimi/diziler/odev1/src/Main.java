import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       int boyut,eleman;
       Scanner input=new Scanner(System.in);
        System.out.print("Dizi boyutu : ");
       boyut=input.nextInt();
        int[] list=new int[boyut];
        System.out.println("Dizinin elemanlarını giriniz : ");
       for(int i=0; i<boyut;i++) {
           System.out.print((i+1)+". Elemanı : ");
           eleman = input.nextInt();
           list[i]=eleman;
       }

       Arrays.sort(list);
        System.out.print("Sıralama : ");
        for(int i=0; i<boyut;i++) {
            System.out.print(" " + list[i]);
        }
    }
}