import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int mat,fiz,kmy,turk,mzk;
        Scanner inp= new Scanner(System.in);
        System.out.print("Matematik notu: ");
        mat=inp.nextInt();
        //System.out.println(mat);
        System.out.print("Fizik notu: ");
        fiz=inp.nextInt();
        System.out.print("Kimya notu: ");
        kmy=inp.nextInt();
        System.out.print("Türkçe notu: ");
        turk=inp.nextInt();
        System.out.print("Müzik notu: ");
        mzk=inp.nextInt();
        double ort= (mat+fiz+kmy+turk+mzk)/5.0;
        System.out.println("Ortalamanız:"+ort);
        if(ort>60){
            System.out.println("Sınıfı Geçti");
        }
        else{
            System.out.println("Sınıfta Kaldı");
        }
    }
}