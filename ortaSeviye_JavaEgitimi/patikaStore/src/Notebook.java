import java.util.ArrayList;
import java.util.Scanner;

public class Notebook {
    private int n_id;
    private String name;
    private int price;
    private String brandName;
    private int storage;
    private double inch;
    private int ram;
    private static int b=1;
    private static ArrayList<Notebook> notebook = new ArrayList<>();

    static {
        notebook.add(new Notebook("Matebook 14", 7000, "Huawei", 512, 14.0, 16));
        notebook.add(new Notebook("V14 IGL", 3699, "Lenovo", 1024, 14.0, 8));
        notebook.add(new Notebook("Tuf Gaming", 8199, "Asus", 2048, 15.6, 32));
    }

    public Notebook(String name, int price, String brandName, int storage, double inch, int ram) {
        this.n_id = b++;
        this.name = name;
        this.price = price;
        this.brandName=brandName;
        this.storage = storage;
        this.inch = inch;
        this.ram = ram;
    }

    public int getN_id() {
        return n_id;
    }

    public void setN_id(int n_id) {
        this.n_id = n_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getInch() {
        return inch;
    }

    public void setInch(double inch) {
        this.inch = inch;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return String.format("| %-2d | %-30s | %-8.2f TL | %-8s | %-8d | %-8.1f | %-10d |",
                n_id, (brandName.toUpperCase()+" "+name), (double) price, brandName, storage, inch, ram);
    }

    public static void listNotebook() {
        System.out.println("Notebook Listesi");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                       | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for (Notebook n : notebook) {
            System.out.println(n);
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
    }
    public static void listById(int id) {
        Notebook searchedNotebook=null;
        for(Notebook n : notebook){
            if(n.getN_id()==id){
                searchedNotebook=n;
                break;
            }
            System.out.println("ID'yle eşleşen bir kayıt bulunamadı!");
        }

        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                       | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
        System.out.println("----------------------------------------------------------------------------------------------------");
            System.out.println(searchedNotebook);
        System.out.println("----------------------------------------------------------------------------------------------------");
    }

    public static void listByBrand(String brandName) {
        ArrayList<Notebook> foundNotebooks = new ArrayList<>();
        for(Notebook n : notebook){
            if(n.getBrandName().equalsIgnoreCase(brandName)){
                foundNotebooks.add(n);
            }
        }

        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                       | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for (Notebook n : foundNotebooks) {
            System.out.println(n);
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
    }
    public static void insertNotebook() {
        System.out.println("-------------------------------------");
        System.out.println("Notebook Ekle !");
        Scanner input=new Scanner(System.in);
        System.out.print("Ürün adı: ");
        String productName=input.nextLine();
        System.out.print("Fiyat: ");
        int price=input.nextInt();
        System.out.print("Marka adı seçin: \n");
        Brands.listBrand();
        int select=input.nextInt();
        System.out.print("Depolama alanı seçin: (512-1024-2048) ");
        int storage=input.nextInt();
        System.out.print("Ekran boyutu girin: ");
        double size=input.nextDouble();
        System.out.print("RAM: (8-16-32-64) ");
        int ram=input.nextInt();

        notebook.add(new Notebook(productName,price,Brands.getBrandById(select),storage,size,ram));
        System.out.println("Başarıyla eklendi!");
    }

    public static void deleteNotebook(int id){
        notebook.removeIf(n -> n.getN_id() == id); // remove if kullanımı dışardan aldığım id notebooklarda N_id olarak varsa (eşitse) sil
        System.out.println("Başarıyla silindi!");
    }

}
