import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int a,b;
        double alan,cevre,u,c;
        Scanner inp= new Scanner(System.in);
        System.out.print("Kenar 1 = ");
        a=inp.nextInt();
        System.out.print("Kenar 2 = ");
        b=inp.nextInt();
        c=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs (Kenar 3) = " + c);

         cevre = (a+b+c);
         u = cevre / 2;
         alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin Cevresi = " + cevre);
        System.out.println("Üçgenin Alanı = " + alan);
    }
}