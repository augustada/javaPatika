import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Fighter f1=new Fighter("Adem Kılıçcı",550,1000,75,50);
        Fighter f2=new Fighter("Avatar Atakan",450,1150,90,50);
        Ring r = new Ring(f1,f2,60,120);
        r.run();
    }
}