import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        for(int i=2; i<=100;i++){
            int sayac=0;
            for (int j=2; j<i;j++){

                if(i%j==0){
                    sayac=1;
                    break;
                }
            }
            if (sayac==0){
                System.out.println(i);
            }
        }
    }
}