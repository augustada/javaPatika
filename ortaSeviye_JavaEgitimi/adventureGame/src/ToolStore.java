public class ToolStore extends NormalLoc{
    public ToolStore(Player player, String name) {
        super(player, "Mağaza");
    }
    @Override
    public boolean onLocation(){
        System.out.println("------ Mağazaya Hoşgeldin! ------");
        boolean showMenu=true;

        while(showMenu) {
            System.out.println("1- Silahlar");
            System.out.println("2- Zırhlar");
            System.out.println("3- Çıkış Yap");
            System.out.print("Seçiminiz: ");
            int selectCase = input.nextInt();

            while (selectCase < 1 || selectCase > 3) {
                System.out.println("Geçersiz değer, tekrar giriniz: ");
                selectCase = input.nextInt();
            }

            switch (selectCase) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Güle Güle!!");
                    showMenu = false;
                    break;
            }
        }
        return true;
    }

    public void printWeapon(){
        System.out.println("------ Silahlar ------");
        for (Weapon weapon : Weapon.weapons()){
            System.out.println("ID #"+weapon.getId()+" "+weapon.getName()+"\tHasarı: "+weapon.getDamage()+"\tÜcreti: "+weapon.getPrice());
        }
        System.out.println("0 - Çıkış Yap");
    }

    public void buyWeapon(){

            System.out.print("Bir silah seçiniz: ");
            int selectWeaponID = input.nextInt();
            while (selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length) {
                System.out.print("Geçersiz değer, tekrar giriniz: ");
                selectWeaponID = input.nextInt();
            }
        if(selectWeaponID!=0){
            Weapon selectedWeapon = Weapon.getWeapon(selectWeaponID);
            System.out.println();
            if (getPlayer().getMoney() >= selectedWeapon.getPrice()) {
                getPlayer().setMoney(getPlayer().getMoney() - selectedWeapon.getPrice());
                System.out.println(selectedWeapon.getName() + " satın alındı!!");
                System.out.println("Kalan bakiyeniz: " + getPlayer().getMoney());
                this.getPlayer().getInventory().setWeapon(selectedWeapon);
            } else {
                System.out.println("Bakiye Yetersiz!!");
            }
        }
    }
    public void printArmor(){
        System.out.println("------ Zırhlar ------");
        for (Armor armor : Armor.armors()){
            System.out.println("ID #"+armor.getId()+" "+armor.getName()+"\tBloklama: "+armor.getBlock()+"\tÜcreti: "+armor.getPrice());
        }
        System.out.println("0 - Çıkış Yap");
    }
    public void buyArmor(){
        System.out.print("Bir zırh seçiniz: ");
        int selectArmorID=input.nextInt();
        while(selectArmorID<0 || selectArmorID>Armor.armors().length){
            System.out.print("Geçersiz değer, tekrar giriniz: ");
            selectArmorID=input.nextInt();
        }
        if(selectArmorID!=0) {
            Armor selectedArmor = Armor.getArmor(selectArmorID);
            System.out.println();
            if (getPlayer().getMoney() >= selectedArmor.getPrice()) {
                getPlayer().setMoney(getPlayer().getMoney() - selectedArmor.getPrice());
                System.out.println(selectedArmor.getName() + " zırh satın alındı!!");
                System.out.println("Kalan bakiyeniz: " + getPlayer().getMoney());
                this.getPlayer().getInventory().setArmor(selectedArmor);
            } else {
                System.out.println("Bakiye Yetersiz!!");
            }
        }
    }
}
