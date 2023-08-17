import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1,num2;int i=1,ebob=i,ekok;
        Scanner inp= new Scanner(System.in);
        System.out.print("1.Sayı: ");
        num1=inp.nextInt();
        System.out.print("2.Sayı: ");
        num2=inp.nextInt();
        while (i<=num1){
            if(num1%i ==0 && num2%i==0) {
                if (i>=ebob) {
                    ebob = i;
                }
            }
            i++;
        }
        ekok=(num1*num2)/ebob;
        System.out.println("EBOB: "+ebob);
        System.out.println("EKOK: "+ekok);
    }
}