import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int a = 0;
        int b = 1;
        int c;
        Scanner inp= new Scanner(System.in);
        System.out.print("Eleman Sayısı: ");
        n=inp.nextInt();
        System.out.print(a+" " + b);
        for (int i=2;i<n;i++){
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}