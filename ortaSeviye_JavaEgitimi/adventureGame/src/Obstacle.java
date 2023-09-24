import java.util.Random;

public class Obstacle {
    private int id;
    private int damage;
    private int health;
    private String name;
    private int award;
    private int originalHealth;

    public Obstacle(int id, int damage, int health, String name, int award) {
        this.id = id;
        this.damage = damage;
        this.health = health;
        this.name = name;
        this.award=award;
        this.originalHealth=health;
    }

    public int obstacleNumber(){

        return 1;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }

    public int getAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
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
}

