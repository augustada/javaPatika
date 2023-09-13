import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Satır sayısı girin : ");
        int satir=input.nextInt();
        System.out.print("Sütun sayısı girin : ");
        int sutun=input.nextInt();
      Mayin mayin = new Mayin(satir,sutun);
      mayin.printMatris();
      mayin.run();
    }
}