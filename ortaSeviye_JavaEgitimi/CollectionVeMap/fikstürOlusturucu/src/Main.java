import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> takim = new ArrayList<>();
        List<List<String>> fiksturler =new ArrayList<>();
        takim.add("Galatasaray");
        takim.add("Fenerbahçe");
        takim.add("Beşiktaş");
        takim.add("Trabzonspor");
        takim.add("Ankaragücü");
        takim.add("Bursaspor");

        int totalTakim=takim.size(); // 6
        int totalRound=(totalTakim-1)*2; //cift devrelide maç/round sayısı

        for(int i=0;i<totalRound;i++) {
            List<String> roundTakim = new ArrayList<>();
            for (int j = 0; j < totalTakim / 2; j++) {
                String evSahibi = takim.get(j); //i. eleman ev sahibi olsun
                String deplasman = takim.get(totalTakim - 1 - j); // 0-5 1-4 diye gidiyor
                roundTakim.add(evSahibi + " vs " + deplasman);
            }
            fiksturler.add(roundTakim); 
            Collections.rotate(takim.subList(0, takim.size()), -1);
        }


        for(int i=0; i<fiksturler.size();i++){
            System.out.println("Round "+(i+1));
            for (String mac : fiksturler.get(i)) {
                System.out.println(mac);
            }
            System.out.println();
        }
    }
}