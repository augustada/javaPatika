public class Student {

    Course d1;
    Course d2;
    Course d3;
    String name;
    String stuNo;
    String classes;
    double average;

    Student(String name, String stuNo,String classes, Course d1,Course d2,Course d3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.d1=d1;
        this.d2=d2;
        this.d3=d3;
        this.average=0;
    }

    void addNote(int note1,int note2,int note3, int snot1,int snot2,int snot3){
        if (note1>=0 && note1<=100 && snot1>=0 && snot1<=100) {
            this.d1.note = note1;
            this.d1.sozNote = snot1;
        }
        if (note2>=0 && note2<=100 && snot2>=0 && snot2<=100) {
            this.d2.note = note2;
            this.d2.sozNote = snot2;
        }
        if (note3>=0 && note3<=100 && snot3>=0 && snot3<=100) {
            this.d3.note = note3;
            this.d3.sozNote = snot3;
        }
    }

    void calcAverage(){
        this.average=((this.d1.note*0.80+this.d1.sozNote*0.20)+(this.d2.note*0.80+this.d2.sozNote*0.20)+(this.d3.note*0.80+this.d3.sozNote*0.20))/3.0;
        System.out.println("Ortalamanız: "+this.average);
        if(average>=50)
            System.out.println("Başarıyla Geçtiniz!");
        else
            System.out.println("Kaldınız!");
        System.out.println();

    }

    void printNote(){
        System.out.println("Öğrenci: "+this.name);
        System.out.println(this.d1.name+" Notu: "+this.d1.note+" Sözlü Notu: "+this.d1.sozNote);
        System.out.println(this.d2.name+" Notu: "+this.d2.note+" Sözlü Notu: "+this.d2.sozNote);
        System.out.println(this.d3.name+" Notu: "+this.d3.note+" Sözlü Notu: "+this.d3.sozNote);

    }


}
