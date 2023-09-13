import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[][] matris= {{1, 2, 3}, {4, 5, 6}};

        System.out.println("Matris : ");
        for(int i=0; i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print("  " + matris[i][j]);
            }
            System.out.println();
        }

        System.out.println("Transpoze : ");
        for(int i=0;i<4;i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("  " + matris[j][i]);
            }
            System.out.println();
        }
    }
}