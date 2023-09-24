import java.util.Scanner;

public class Game {
    Player player;
    Location location;
/*
    public Game(Player player, Location location) {
        this.player = player;
        this.location = location;
    }

 */
  public Scanner input = new Scanner(System.in);
   public void start(){
       System.out.println("Macera Oyununa Hoşgeldiniz!");
       System.out.print("Player İsim: ");
       String playerName=input.nextLine();
       Player player=new Player(playerName);
       System.out.println("Adaya Hoşgeldin "+player.getName()+"!!");
       player.printCharacter();
       int secim=input.nextInt();
       player.selectChar(secim);
       Location location=null;

       while(true){

           System.out.println();
           player.printInfo();
           System.out.println();
           System.out.println("------ Bölgeler ------ \n1- Güvenli Ev ---> Can yenilenir, düşman yoktur.\n2- Eşya Dükkanı ---> Silah ve Zırh satın alınabilir.\n3- Mağara --> Mağaraya gir, zombilerle yüzleş!" +
                   "\n4- Orman ---> Ormana gir, vampirlerle mücadele et!\n5- Nehir ---> Nehire gir, ayılarla savaş!\n6- Maden ---> Madene gir, yılanlara gününü göster!" +
                   "\n0- Çıkış Yap ---> Oyunu Sonlandır");
           System.out.println();

           if(player.getInventory().isFood() && player.getInventory().isWater() && player.getInventory().isFirewood() && player.getInventory().isAxe()){
               player.printInfo();
               System.out.println();
               System.out.println("TEBRİKLER "+player.getName()+"!! Tüm bölgelerdeki ganimetleri toplayarak oyunu bitirdin! ISSIZ ADA Expert <3");
               break;
           }

           System.out.print("Gitmek istediğin yeri seç: ");
           int select=input.nextInt();

           switch (select){
               case 0:
                   location=null;
                   break;
               case 1:
                   location=new SafeHouse(player,"Güvenli Ev");
                   break;
               case 2:
                   location=new ToolStore(player,"Mağaza");
                   break;
               case 3:
                   if(!player.getInventory().isFood()) {
                       location = new Cave(player);
                   }
                   else {
                       System.out.println("Bu bölgedeki tüm düşmanları yendin!!");
                   }
                   break;
               case 4:
                   if(!player.getInventory().isFirewood()) {
                       location = new Forest(player);
                   }
                   else {
                       System.out.println("Bu bölgedeki tüm düşmanları yendin!!");
                   }
                   break;
               case 5:
                   if(!player.getInventory().isWater()) {
                       location = new River(player);
                   }
                   else {
                       System.out.println("Bu bölgedeki tüm düşmanları yendin!!");
                   }
                   break;
               case 6:
                   if(!player.getInventory().isAxe()) {
                       location = new Mine(player);
                   }
                   else {
                       System.out.println("Bu bölgedeki tüm düşmanları yendin!!");
                   }
                   break;
               default:
                   System.out.println("Geçerli bir bölge girin!");
           }
           if (location == null){
               System.out.println("Oyun Bitti!!\nGörüşmek Üzere...");
               break;
           }
           if(!location.onLocation()){
               System.out.println("  GamE OveR!!");
               break;
           }
       }
    }


    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }


}
