import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num,adet,max=0,min=0;
        Scanner inp= new Scanner(System.in);
        System.out.print("Kaç sayı girilecek: ");
        adet=inp.nextInt();
        for(int i=1; i<=adet;i++){
            System.out.print(i+".Sayı: ");
            num=inp.nextInt();
            if(num<=min){
                min=num;
            }
            if(num>=max){
                max=num;
            }
        }
        System.out.println("En büyük sayı: "+max);
        System.out.println("En küçük sayı: "+min);
    }
}