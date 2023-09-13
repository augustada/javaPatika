import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] list ={0,1,2,34,21,20,0,23,3,4,1,2,20,12,4,12,2};
        int[] ciftlist= new int[list.length];
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        for (int i = 0 ; i < list.length ; i++) {
            if(list[i]%2==0){
            ciftlist[i]=list[i];
            }
        }

        System.out.print("Repeating Numbers :");
        for (int i = 1 ; i < ciftlist.length ; i++){
            if (ciftlist[i] == ciftlist[i-1] ){
                if (ciftlist[i] != ciftlist[i+1] )
                    System.out.print(" " + ciftlist[i] );
            }
        }

    }
}