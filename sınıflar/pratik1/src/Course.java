public class Course {
    Teacher teacher;
     String name;
     String code;
     String prefix;
     int note;
     int sozNote;

     Course(String name,String code, String prefix,Teacher teacher){

         this.name=name;
         this.code=code;
         this.prefix=prefix;
         this.teacher=teacher;
         int note=0;
         int sozNote=0;

     }
     void addTeacher(Teacher teacher){

         if(this.prefix.equals(teacher.branch))
             this.teacher=teacher;
         else
             System.out.println(teacher.name+" ders branchi hatalı!");

     }
    void printTeacher(){

        System.out.println(this.teacher.name);
    }
}
