import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[][] letter = new String[6][5];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if ( i == 2 || i==5) {
                    letter[i][j] = " * ";
                } else if (j == 0) {
                    letter[i][j] = " * ";
                }
                else {
                    letter[0][0] = " * ";
                    letter[0][1] = " * ";
                    letter[0][2] = " * ";
                    letter[0][3] = " * ";
                    letter[1][3] = " * ";
                    letter[2][3] = " * ";
                    letter[2][4] = " * ";
                    letter[3][4] = " * ";
                    letter[4][4] = " * ";
                    letter[5][4] = " * ";
                    letter[i][j] = "   ";
                }
            }
        }

        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}