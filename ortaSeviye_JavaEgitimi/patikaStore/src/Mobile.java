import java.util.ArrayList;
import java.util.Scanner;

public class Mobile {
    private int m_id;
    private String name;
    private int price;
    private String brandName;
    private int storage;
    private double inch;
    private int camera;
    private int battery;
    private int ram;
    private String color;
    private static int b=1;
    private static ArrayList<Mobile> mobiles = new ArrayList<>();

    static {
        mobiles.add(new Mobile("GALAXY A51", 3199, "Samsung", 128, 6.5, 32, 4000, 6, "Siyah"));
        mobiles.add(new Mobile("iPhone 11", 7379, "Apple", 64, 6.1, 5, 3046, 6, "Mavi"));
        mobiles.add(new Mobile("Redmi Note 10 Pro", 4012, "Xiaomi", 128, 6.5, 35, 4000, 12, "Beyaz"));
    }

    public Mobile(String name, int price, String brandName, int storage, double inch, int camera, int battery, int ram, String color) {
        this.m_id = b++;
        this.name = name;
        this.price = price;
        this.brandName = brandName;
        this.storage = storage;
        this.inch=inch;
        this.camera = camera;
        this.battery = battery;
        this.ram = ram;
        this.color = color;
    }

    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String toString() {
        return String.format("| %-2d | %-20s | %-8d TL | %-8s | %-9d | %-13.1f | %-7d | %-7d | %-10s |",
                m_id, (brandName.toUpperCase()+" "+name), price, brandName, storage, inch, camera, battery, color);
    }

    public static void listMobile() {
        System.out.println("Cep Telefon Listesi");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı             | Fiyat     | Marka     | Depolama   | Ekran Boyutu   | Kamera    | Batarya  | Renk       |");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        for (Mobile m : mobiles) {
            System.out.println(m);
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
    }

    public static void listById(int id) {
        Mobile searchedMobile=null;
        for(Mobile m : mobiles){
            if(m.getM_id()==id){
                searchedMobile=m;
                break;
            }
            System.out.println("ID'yle eşleşen bir kayıt bulunamadı!");
        }

        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı             | Fiyat     | Marka     | Depolama   | Ekran Boyutu   | Kamera    | Batarya  | Renk       |");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
            System.out.println(searchedMobile);
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
    }

    public static void listByBrand(String brandName) {
        ArrayList<Mobile> foundMobiles = new ArrayList<>();
        for(Mobile m : mobiles){
            if(m.getBrandName().equalsIgnoreCase(brandName)){
                foundMobiles.add(m);
            }
        }

        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı             | Fiyat     | Marka     | Depolama   | Ekran Boyutu   | Kamera    | Batarya  | Renk       |");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        for (Mobile m : foundMobiles) {
            System.out.println(m);
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
    }

    public static void insertMobile() {
        System.out.println("-------------------------------------");
        System.out.println("Cep Telefonu Ekle !");
        Scanner input = new Scanner(System.in);
        System.out.print("Ürün adı: ");
        String productName = input.nextLine();
        System.out.print("Fiyat: ");
        int price = input.nextInt();
        System.out.print("Marka adı seçin: \n");
        Brands.listBrand();
        int select = input.nextInt();
        System.out.print("Depolama alanı seçin: (32-64-128) ");
        int storage = input.nextInt();
        System.out.print("Ekran Boyutu: ");
        double inch = input.nextDouble();
        System.out.print("Kamera çözünürlüğü (MP): ");
        int camera = input.nextInt();
        System.out.print("Batarya kapasitesi (mAh): ");
        int battery = input.nextInt();
        System.out.print("RAM: (6-12)");
        int ram = input.nextInt();
        System.out.print("Renk: ");
        input.nextLine(); // Consume newline
        String color = input.nextLine();

        mobiles.add(new Mobile(productName, price, Brands.getBrandById(select), storage, inch, camera, battery, ram, color));
        System.out.println("Başarıyla eklendi!");
    }

    public static void deleteMobile(int id) {
        boolean removed = mobiles.removeIf(m -> m.getM_id() == id);
        if (removed) {
            System.out.println("Başarıyla silindi!");
        } else {
            System.out.println("Cep telefonu bulunamadı!");
        }
    }
}
