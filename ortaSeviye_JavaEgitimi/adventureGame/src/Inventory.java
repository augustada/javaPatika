public class Inventory {
private Weapon weapon;
private Armor armor;
private String InventoryList="boş";
private boolean food=false;
private boolean water=false;
private boolean firewood=false;
private boolean axe=false;

    public Inventory() {
        this.weapon = new Weapon("Yumruk",-1,0,0);
        this.armor=new Armor("Yok",-1,0,0);
    }

    public String getInventoryList() {
        return InventoryList;
    }

    public void setInventoryList(String InventoryList) {
        this.InventoryList = InventoryList;
    }

    public boolean isAxe() {
        return axe;
    }

    public void setAxe(boolean axe) {
        this.axe = axe;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isFirewood() {
        return firewood;
    }

    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }
}
