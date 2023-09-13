import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num,i=1,kat,top=0;
        Scanner inp= new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        num=inp.nextInt();
        while (i<num){
            if(num%i ==0) {
                    kat = i;
                    top+=kat;
            }
            i++;
        }
        if(top==num){
            System.out.println(num+" Mükemmel sayıdır");
        }
        else {
            System.out.println(num+" Mükemmel sayı değildir");
        }
    }
}