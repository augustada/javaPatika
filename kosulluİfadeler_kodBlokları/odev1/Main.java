import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int km, yas, tip;
        double tutar;
        Scanner inp = new Scanner(System.in);
        System.out.print("Mesafe: ");
        km = inp.nextInt();
        if (km < 0) {
            System.out.print("Hatalı Girdiniz! ");
        } else {
            tutar = km * 0.10;
            System.out.print("Yaş: ");
            yas = inp.nextInt();
            if (yas < 0) {
                System.out.print("Hatalı Girdiniz! ");
            } else {

                if(yas<12 && yas>=0){
                    tutar=tutar-(tutar*0.50);
                    
                } else if (yas<24 && yas>=12) {
                    tutar=tutar-(tutar*0.10);
                    
                } else if (yas>=65) {
                    tutar=tutar-(tutar*0.30);
                }
                System.out.print("Yolculuk Tipi: Tek Yön[1] Gidiş-Dönüş[2] ");
                tip = inp.nextInt();

                if (tip != 2 && tip != 1) {
                    System.out.print("Hatalı Girdiniz! ");
                } else {

                    if (tip == 2) {
                        tutar=tutar-(tutar*0.20);
                        tutar*=2;

                    }
                    System.out.println("Tutar: "+tutar);
                }
            }
        }

    }
}