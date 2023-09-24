import java.util.Random;
import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int originalHealth;
    private int money;
    private String name;
    private String CharName;
    private Inventory inventory;

    
    public Player(String name) {
        this.name = name;
        this.inventory=new Inventory();

    }

    public Scanner input = new Scanner(System.in);
   public void selectChar(int secim){

        switch (secim){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                System.out.println("Yanlış Seçim!");
        }
    }

    public void printCharacter(){
       Character[] charList={new Samurai(),new Archer(),new Knight()};
        System.out.println("----------------------------------------------------------------------");
       for(Character character : charList){
           System.out.println("#ID: " + character.getId()+"\tKarakter: "+character.getName()+
                   "\tHasar: "+character.getDamage()+"\tSağlık: "+character.getHealth()+"\tPara: "+character.getMoney());
       }
        System.out.println("----------------------------------------------------------------------");
        System.out.print("Karakter Seçiniz:");
    }

    public void initPlayer(Character character){
        this.setDamage(character.getDamage());
        this.setHealth(character.getHealth());
        this.setOriginalHealth(character.getHealth());
        this.setMoney(character.getMoney());
        this.setCharName(character.getName());
    }

    public void printInfo(){
        System.out.println(this.getCharName()+" Değerleri:");
        System.out.println("Sağlık: "+this.getHealth()+
                        ", Para: "+this.getMoney()+
                        ", Silah: "+this.getInventory().getWeapon().getName()+
                ", Zırh: "+this.getInventory().getArmor().getName()+
                ", Bloklama: "+this.getInventory().getArmor().getBlock()+
                ", Hasar: "+this.getDamage()+" (weapon damage "+this.getInventory().getWeapon().getDamage()+")"+
                ", Envanter: "+this.getInventory().getInventoryList());
    }



    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getDamage() {
        return damage+this.getInventory().getWeapon().getDamage();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health<0){
            health=0;
        }
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return CharName;
    }

    public void setCharName(String charName) {
        CharName = charName;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }

}
