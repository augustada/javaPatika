import java.util.Random;

public abstract class BattleLoc extends Location {
    private Obstacle obstacle;
    private String award;
    private int maxObstacle; // çıkıcak canavar sayısı max

    public BattleLoc(Player player, String name,Obstacle obstacle, String award, int maxObstacle) {
        super(player, name);
        this.obstacle=obstacle;
        this.award=award;
        this.maxObstacle=maxObstacle;
    }

    @Override
    public boolean onLocation(){
        int obsNum=this.randomObsNum();
        System.out.println("Şuan buradasın: "+this.getName());
        System.out.println("Dikkat!! Burada "+obsNum+" "+this.getObstacle().getName()+" yaşıyor!");
        System.out.println("Alınacak ganimet: "+this.getAward());
        System.out.print("<S>avaş veya <K>aç ! (PRESS S OR K) : ");
        String selectCase=input.nextLine().toUpperCase();
        if(this.getObstacle().getName().equals("Yılan")){
            this.getObstacle().setDamage(snakeDamage());
        }
            if(selectCase.equals("S") && combat(obsNum)){ //combat true dönerse
                System.out.println("Bu "+this.getName()+" tüm düşmanları yendin!!");
                this.getPlayer().getInventory().setInventoryList(this.getAward());
                if(this.getAward().equals("food")){
                    this.getPlayer().getInventory().setFood(true);
                } else if (this.getAward().equals("water")) {
                    this.getPlayer().getInventory().setWater(true);
                }
                else if(this.getAward().equals("firewood")){
                    this.getPlayer().getInventory().setFirewood(true);
                }
                else{
                    this.getPlayer().getInventory().setAxe(true);
                }
                return true;
            }

        if(this.getPlayer().getHealth() <= 0){ //ölmüşsek
            System.out.println();
            System.out.println("  ÖLDÜN!! :') ");
            return false;
        }

        return true;
    }

    public boolean combat(int obsNumber){

        for(int i=1;i<=obsNumber;i++){
            System.out.println("--------------------------------------");
            this.getPlayer().printInfo();
            obstacleStats(i);
            System.out.println("--------------------------------------");
            this.getObstacle().setHealth(this.getObstacle().getOriginalHealth());
            while(this.getPlayer().getHealth()>0 && this.getObstacle().getHealth()>0){
                System.out.println();
                System.out.print("<V>ur veya <K>aç ! (PRESS V OR K) : ");
                String selectCombat=input.nextLine().toUpperCase();
                if(selectCombat.equals("V")){
                    int startNum=randomStartNum();
                    startFirst(startNum);
                }
                else{
                    return false;
                }
            }

            if(this.getObstacle().getHealth()==0){
                System.out.println("Düşmanı yendin!! "+this.getObstacle().getAward()+" para ödülü kazandın!");
                this.getPlayer().setMoney(getPlayer().getMoney()+this.getObstacle().getAward());
            }
            else{
                return false;
            }
        }
        return true;
    }

    public void startFirst(int randomStartNum){
        if(randomStartNum==1){ // sayı 1 se insan başlasın
            System.out.println();
            System.out.println("VURDUN!!");
            this.getObstacle().setHealth(this.getObstacle().getHealth()-this.getPlayer().getDamage());
            afterHit();
            if(this.getObstacle().getHealth()>0){ // canavar ölmemişse geri vurucak
                System.out.println();
                System.out.println(this.getObstacle().getName()+" SİZE VURDU!!");
                int obstacleDamage=this.getObstacle().getDamage()-this.getPlayer().getInventory().getArmor().getBlock();
                if(obstacleDamage<0) { //zırhımız canavarın vuruşundan çoksa canavar 0 vurmuş olur, zırh engeller
                    obstacleDamage=0;
                }
                this.getPlayer().setHealth(this.getPlayer().getHealth()-obstacleDamage);
                //yeni canımız = canımız-canavarın verdiği hasar-zırhımızın bloklaması
                afterHit();
            }
        }
        else{
            System.out.println();
            System.out.println(this.getObstacle().getName()+" SİZE VURDU!!");
            int obstacleDamage=this.getObstacle().getDamage()-this.getPlayer().getInventory().getArmor().getBlock();
            if(obstacleDamage<0) {
                obstacleDamage=0;
            }
            this.getPlayer().setHealth(this.getPlayer().getHealth()-obstacleDamage);
            afterHit();
            if(this.getPlayer().getHealth()>0){
                System.out.println();
                System.out.println("VURDUN!!");
                this.getObstacle().setHealth(this.getObstacle().getHealth()-this.getPlayer().getDamage());
                afterHit();
            }
        }
    }

    public void afterHit() {
        System.out.println("Canınız: "+this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName()+" Canı: "+this.getObstacle().getHealth());
    }

    public void obstacleStats(int i) {
        System.out.println(i+"."+this.getObstacle().getName()+" Değerleri:");
        System.out.println("Sağlık: "+this.getObstacle().getOriginalHealth()+
                           ", Hasar: "+this.getObstacle().getDamage()+
                ", Para Ödülü: "+this.getObstacle().getAward());
    }

    public int randomObsNum(){
        Random random =  new Random();
        return random.nextInt(this.getMaxObstacle())+1; // 1-maxObstacle arası
    }

    public int randomStartNum(){
        Random random =  new Random();
        return random.nextInt(2); // 0-1 arası %50 ihtimalle sayı uret
    }

    public int snakeDamage() {
        Random random = new Random();
        int randomDamageNum = random.nextInt(5) + 2;
        this.getObstacle().setDamage(randomDamageNum);
        return randomDamageNum;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }


}
