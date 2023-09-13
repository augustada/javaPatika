import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int sifre=1234; int k_sifre,y_sifre;
        String ad="admin"; String k_ad;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı Adı: ");
        k_ad=inp.next();
        System.out.print("Şifre: ");
        k_sifre=inp.nextInt();

        if(k_sifre==sifre && k_ad.equals(ad)){
            System.out.println("Hoşgeldiniz!");
        }
        else if(k_sifre!=sifre && k_ad.equals(ad)){
            System.out.println("Şifre Hatalı! Sıfırlamak ister misiniz?: Evet[1] Hayır[2]");
            int secim=inp.nextInt();
            if(secim==1){
                System.out.print("Yeni Şifre: ");
                y_sifre=inp.nextInt();
                if(y_sifre==sifre){
                    System.out.print("Yeni şifre eskisiyle aynı olamaz!");
                }
                else{
                    System.out.print("Başarılı!");
                    sifre=y_sifre;
                }
            }
        }
        else if(k_sifre==sifre && k_ad!=ad){
            System.out.println("Kullanıcı Adı Hatalı!");
        }
        else{
            System.out.println("Kullanıcı Adı ve Şifre Hatalı!");
        }
    }
}