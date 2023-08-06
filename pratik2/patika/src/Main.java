import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        double para,kdvtutar,kdv,kdvpara;
        Scanner inp= new Scanner(System.in);
        System.out.print("Para girin: ");
        para=inp.nextDouble();
        if(para<1000 && para>0) {
            kdv=0.18;
            kdvtutar=para*kdv;
            kdvpara=para+kdvtutar;
            System.out.println("KDV'siz fiyat: "+para);
            System.out.println("KDV'li fiyat: "+kdvpara);
            System.out.println("KDV tutarı: "+kdvtutar);
        }
        else if(para>1000){
            kdv=0.08;
            kdvtutar=para*kdv;
            kdvpara=para+kdvtutar;
            System.out.println("KDV'siz fiyat: "+para);
            System.out.println("KDV'li fiyat: "+kdvpara);
            System.out.println("KDV tutarı: "+kdvtutar);
        }

    }
}