import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int taban;int us;int n=1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Taban: ");
        taban = inp.nextInt();
        System.out.print("Üs: ");
        us = inp.nextInt();
        for (int i=1;i<=us;i++){
            n*=taban;
        }
        System.out.println(n);
    }
}