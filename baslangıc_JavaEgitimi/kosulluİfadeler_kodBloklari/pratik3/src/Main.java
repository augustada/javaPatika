import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int mat,fzk,trk,kmy,mzk;
        double ort,ders=0,top=0;
        Scanner inp=new Scanner(System.in);
        System.out.print("Matematik: ");
        mat = inp.nextInt();
        if(mat>=0 && mat<=100){
            top+=mat;
            ++ders;
        }

        System.out.print("Fizik: ");
        fzk = inp.nextInt();
        if(fzk>=0 && fzk<=100){
            top+=fzk;
            ++ders;
        }

        System.out.print("Türkçe: ");
        trk = inp.nextInt();
        if(trk>=0 && trk<=100){
            top+=trk;
            ++ders;
        }

        System.out.print("Kimya: ");
        kmy = inp.nextInt();
        if(kmy>=0 && kmy<=100){
            top+=kmy;
            ++ders;
        }

        System.out.print("Müzik: ");
        mzk = inp.nextInt();
        if(mzk>=0 && mzk<=100){
            top+=mzk;
            ++ders;
        }
            ort=top/ders;
            System.out.println("Geçme Notu = " + ort);
            System.out.println( (ort>=55) ? "Geçtiniz!" : "Kaldınız!" );

    }
}