import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int km; double tutar;
        Scanner inp=new Scanner(System.in);
        System.out.print("KM Girin: ");
        km=inp.nextInt();
        tutar=km*2.20+10;
        tutar = (tutar<20) ? 20 : tutar;
            System.out.println("Ödenecek Tutar: "+tutar);

    }
}