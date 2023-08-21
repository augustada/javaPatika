import java.util.Random;
import java.util.Scanner;

public class Mayin {
    int satir;
    int sutun;
    int[][] matris;
    boolean isWin;
    int hak=0;

    Mayin(int satir, int sutun){

        this.satir=satir;
        this.sutun=sutun;
        this.matris=new int[satir][sutun];
        isWin=false;
    }

    void run() {
        System.out.println("Harita : ");
        for(int i=0;i<satir;i++){
            for(int j=0;j<sutun;j++){
                System.out.print(" - ");
            }
            System.out.println();
        }
        while(!isWin) {
            Scanner input = new Scanner(System.in);
            System.out.print("Satır girin : ");
            int x = input.nextInt();
            System.out.print("Sütun girin : ");
            int y = input.nextInt();
            if(x<0 || x>=this.satir || y<0 || y>=sutun ){
                System.out.println("=====================");
                System.out.println("Hatalı index girdiniz!");
                continue;
            }
            if (matris[x][y] == -1) {
                isWin = true;
                System.out.println("=====================");
                System.out.println("Game Over!");
                break;
            }
            hak++;
            goster(x,y);
            if (hak == ((satir*sutun)-(satir*sutun)/4)){
                isWin = true;
                System.out.println("=====================");
                System.out.println("Win Win!");
                for (int i = 0; i < satir; i++) {
                    for (int j = 0; j < sutun; j++) {
                        if (matris[i][j] == -1) {
                            System.out.print("- ");
                        } else {
                            System.out.print(matris[i][j] + " ");
                        }
                    }
                    System.out.println();
                }
                break;
            }
        }

    }
    void printMatris(){
        mayinOlustur();
        System.out.println("Mayınlı Harita : ");
        for(int i=0;i<satir;i++){
            for(int j=0;j<sutun;j++){
                System.out.print(" " + matris[i][j]);
            }
            System.out.println();
        }
    }

    void mayinOlustur(){
        int i=0;
        int adet = (this.satir * this.sutun) / 4;
        while(i<adet) {
            Random rand = new Random();
            int str = rand.nextInt(satir);
            int stn = rand.nextInt(sutun);
            if(matris[str][stn]!=-1) {
                matris[str][stn] = -1;
                i++;
                komsuIsaret(str,stn);
            }

        }
    }

    void komsuIsaret(int str,int stn) {

        if (matris[str][stn] == -1) {
            for (int k = str - 1; k <= str + 1; k++) {
                for (int l = stn - 1; l <= stn + 1; l++) {
                    if (k >= 0 && k < satir && l >= 0 && l < sutun && !(k == str && l == stn)) {
                        if (matris[k][l] != -1) {
                            matris[k][l] += 1;
                        }
                    }

                }
            }

        }
    }

    void goster(int x,int y){

        for (int i=0; i<satir;i++) {
            for (int j = 0; j < sutun; j++){
                if(i==x && j==y) {
                    System.out.print("  " + matris[x][y]);
                }else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }

}
