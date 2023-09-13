import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int gun,ay;
        Scanner inp=new Scanner(System.in);
        System.out.print("Gün: ");
        gun=inp.nextInt();
        System.out.print("Ay: ");
        ay=inp.nextInt();

        if((ay==3 && gun>=21 && gun<=31) || (ay==4 && gun<=20 && gun>=1)){
            System.out.println("Koç Burcu");
        }
        if((ay==4 && gun>=21 && gun<=30) || (ay==5 && gun<=21 && gun>=1)){
            System.out.println("Boğa Burcu");
        }
        if((ay==5 && gun>=22 && gun<=31) || (ay==6 && gun<=22 && gun>=1)){
            System.out.println("İkizler Burcu");
        }
        if((ay==6 && gun>=23 && gun<=30) || (ay==7 && gun<=22 && gun>=1)){
            System.out.println("Yengeç Burcu");
        }
        if((ay==7 && gun>=23 && gun<=31) || (ay==8 && gun<=22 && gun>=1)){
            System.out.println("Aslan Burcu");
        }
        if((ay==8 && gun>=23 && gun<=31) || (ay==9 && gun<=22 && gun>=1)){
            System.out.println("Başak Burcu");
        }
        if((ay==9 && gun>=23 && gun<=30) || (ay==10 && gun<=22 && gun>=1)){
            System.out.println("Terazi Burcu");
        }
        if((ay==10 && gun>=23 && gun<=31) || (ay==11 && gun<=21 && gun>=1)){
            System.out.println("Akrep Burcu");
        }
        if((ay==10 && gun>=22 && gun<=30) || (ay==12 && gun<=21 && gun>=1)){
            System.out.println("Yay Burcu");
        }
        if((ay==12 && gun>=22 && gun<=31) || (ay==1 && gun<=21 && gun>=1)){
            System.out.println("Oğlak Burcu");
        }
        if((ay==1 && gun>=22 && gun<=31) || (ay==2 && gun<=19 && gun>=1)){
            System.out.println("Kova Burcu");
        }
        if((ay==2 && gun>=20 && gun<=29) || (ay==3 && gun<=20 && gun>=1)){
            System.out.println("Balık Burcu");
        }
    }
}