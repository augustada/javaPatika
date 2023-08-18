import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Teacher trh=new Teacher("Mahmut Hoca","5334","trh");
        Teacher bio=new Teacher("Kulyutmaz","4221","bio");
        Teacher fzk=new Teacher("Ahmet Hoca","2345","fzk");
        Course tarih=new Course("Tarih","101","trh",trh);
        Course biyoloji=new Course("Biyoloji","102","bio",bio);
        Course fizik=new Course("Fizik","106","fzk",fzk);
        tarih.addTeacher(trh);
        biyoloji.addTeacher(bio);
        fizik.addTeacher(fzk);
        Student s1=new Student("Ozge","594","3",tarih,fizik,biyoloji);
        Student s2=new Student("Ozlem","109","2",tarih,fizik,biyoloji);
        s1.addNote(65,50,25,90,50,100);
        s1.printNote();
        s1.calcAverage();
        s2.addNote(100,75,30,50,65,10);
        s2.printNote();
        s2.calcAverage();
    }
}