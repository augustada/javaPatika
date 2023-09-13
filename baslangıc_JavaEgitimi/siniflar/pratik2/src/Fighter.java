public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    public Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if(dodge >=0 && dodge<=100) // eger dodge degeri 0-100 aralıgında degilse 0 olsun
            this.dodge = dodge;
        else
            this.dodge=0;
    }

    int hit(Fighter fighter){
        if(fighter.isDodge()){
            System.out.println(fighter.name+" gelen hasarı blokladı");
            return fighter.health;
        }
        System.out.println(this.name+" => "+fighter.name+" "+this.damage+" hasar vurdu");
        if(fighter.health-this.damage<0)
            return 0;
        return fighter.health-=this.damage;
    }
    
    boolean isDodge(){
        double rndm=Math.random()*100;
        return rndm <= this.dodge;
    }

}
