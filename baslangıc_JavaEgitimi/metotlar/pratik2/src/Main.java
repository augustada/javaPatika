import java.util.Scanner;
import java.math.*;

public class Main {
    static int fib(int x){
        if(x==1 || x==2)
            return 1;
        else if (x==0)
            return 0;
         else
           return fib(x-1)+fib(x-2);
    }
    public static void main(String[] args) {
        int n;
        Scanner inp= new Scanner(System.in);
        System.out.print("Sayı: ");
        n=inp.nextInt();
        System.out.println(fib(n));
    }
}