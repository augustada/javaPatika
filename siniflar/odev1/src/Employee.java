public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    double tax(double salary){
        this.salary=salary;
        double vergi=0;
        if(salary<=1000) {
            return vergi;
        }
        if(salary>1000) {
            vergi=salary * 0.03;
            return vergi;
        }
        return vergi;
    }

    double bonus(int workHours){
        double bonus=0;
        if(workHours>40){
            bonus= (workHours-40)*30;
            return bonus;
        }
        return bonus;
    }

    double raiseSalary(int hireYear){
        double artis=0;
        if(hireYear>2011){ // 10yıldan az
            artis=this.salary*0.5;
            return artis;
        }
        if(hireYear<=2011 && hireYear>2001) { // 9yıldan fazla 20yıldan az
            artis=this.salary*0.10;
            return artis;
        }
        if(hireYear<2002){
            artis=this.salary*0.15;
            return artis;
        }
        return artis;
    }
    void print(){
        double vbmaas=salary+bonus(workHours)-tax(salary);
        double maas=salary+raiseSalary(hireYear);
        System.out.println("Adı : " + name + "\nMaaşı : "+salary+"\nÇalışma Saati : "+ workHours
                +"\nBaşlangıç Yılı : "+hireYear+"\nVergi : "+ tax(salary)+"\nBonus : "+bonus(workHours)+
                "\nMaaş Artışı : "+raiseSalary(hireYear)+"\nVergi ve Bonuslar ile maaş : "+vbmaas+"\nToplam Maaş : "+maas+"\n");
    }


}
