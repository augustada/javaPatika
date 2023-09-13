import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] list={10, 20, 20, 10, 10, 20, 5, 20,0};
        for(int j = 0 ; j < list.length ; j++) {
            int count = 0;
            boolean isCount = false;

            for (int k = 0; k <= j-1; k++) {
                if (list[k] == list[j]) {
                    isCount = true;
                    break;
                }
            }
            if (!isCount) {
                for (int i = 0; i < list.length; i++) {
                    if (list[j] == list[i]) count++;
                }


                System.out.println(list[j] + " sayısı " + count+" kere tekrar edildi.");
            }
        }
        
        
        
    }
}