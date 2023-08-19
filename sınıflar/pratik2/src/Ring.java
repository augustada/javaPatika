public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run(){
        if(isCheck()){
            while (this.f1.health>0 && this.f2.health>0){

                if(isStart()) { // ilk f1 vursun
                    System.out.println("-------YENİ ROUND-------");
                    this.f2.health = this.f1.hit(f2);

                    if (isWin()) {
                        break;
                    }

                    this.f1.health = this.f2.hit(f1);
                    if(isWin()){
                        break;
                    }
                System.out.println(this.f2.name+" Health = " + this.f2.health);
                System.out.println(this.f1.name+" Health = " + this.f1.health);
                }

                if(!isStart()) { // ilk f2 vursun
                    System.out.println("-------YENİ ROUND-------");
                    this.f1.health = this.f2.hit(f1);

                    if (isWin()) {
                        break;
                    }

                    this.f2.health = this.f1.hit(f2);
                    if(isWin()){
                        break;
                    }
                    System.out.println(this.f2.name+" Health = " + this.f2.health);
                    System.out.println(this.f1.name+" Health = " + this.f1.health);
                }

            }
        }
        else {
            System.out.println("Sporcuların sikletleri uymuyor!");
        }
    }

    boolean isCheck(){
        return ((this.f1.weight >= this.minWeight && this.f1.weight<= this.maxWeight)&&(this.f2.weight >= this.minWeight && this.f2.weight<= this.maxWeight)) ;
    }
    boolean isStart(){
        double rndm1=Math.random()*100;
        if(rndm1<=50) {
            return true;
        }
        else {
            return false;
        }
    }
    boolean isWin(){
        if(this.f1.health==0){
            System.out.println("------------------------");
            System.out.println(this.f2.name+" kazandı!");
            return true;
        }
        if(this.f2.health==0){
            System.out.println("------------------------");
            System.out.println(this.f1.name+" kazandı!");
            return true;
        }
        return false;
    }

}
