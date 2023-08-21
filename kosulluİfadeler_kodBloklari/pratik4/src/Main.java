import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int sicaklik;
        Scanner inp=new Scanner(System.in);
        System.out.print("Sıcaklık: ");
        sicaklik=inp.nextInt();

        if(sicaklik<=5){
            System.out.println("Kayak");
        } else if (sicaklik>5 && sicaklik<=25) {
            if (sicaklik <= 15) {
                System.out.println("Sinema");
            }
            if(sicaklik >= 10){
                System.out.println("Piknik");
            }
        }
        else {
            System.out.println("Yüzme");
        }

    }
}