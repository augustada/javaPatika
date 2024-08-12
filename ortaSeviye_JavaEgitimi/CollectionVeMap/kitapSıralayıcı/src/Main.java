import java.util.*;

public class Main {
    public static void main(String[] args) {
        //alfabetik sıralama
        TreeSet<Book> b1=new TreeSet<>(new nameComparator());
        b1.add(new Book("Suç ve Ceza",670));
        b1.add(new Book("Çalıkuşu",480));
        b1.add(new Book("Anna Karanina",1012));
        b1.add(new Book("Huzur",350));
        b1.add(new Book("İki Şehrin Hikayesi",455));

        Iterator<Book> itr=b1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next().getName());
        }
        System.out.println();
        System.out.println("---------------------------------------------------------");
        System.out.println();
        //büyükten küçüğe sayfa no sıralama

        TreeSet<Book> b2=new TreeSet<>(new pageComparator().reversed());
        b2.add(new Book("Suç ve Ceza",670));
        b2.add(new Book("Çalıkuşu",480));
        b2.add(new Book("Anna Karanina",1012));
        b2.add(new Book("Huzur",350));
        b2.add(new Book("İki Şehrin Hikayesi",455));

        for(Book b : b2){
            System.out.println(b.getName()+" ("+b.getPageNum()+")");
        }
    }
}