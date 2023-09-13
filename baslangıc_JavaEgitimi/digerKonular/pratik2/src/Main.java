import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;   //bir bastan bir sondan eleman alıp birbirine esit mi diye bakiyoruz
        while (i < j) {                    // ikisi birbirine esit olana kadar bak
            if (str.charAt(i) != str.charAt(j))
                return false;              //esit degilse false döndür esitse true
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str) {  // diziyi tersten yazip equals ile string1 esit mi string2 yapiyoruz degilse false
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome2("kayak"));
        System.out.println(isPalindrome2("adsadf"));
    }
}