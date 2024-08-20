import java.util.TreeSet;

public class Brands {
    private String name;
    private int b_id;
    private static int b=1; // id AutoIncresement olması icin static 1 tanımladım constructorda id=static+1 yaptım

    private static TreeSet<Brands> brands=new TreeSet<>(new nameComparator());
    static {
        brands.add(new Brands("Samsung"));
        brands.add(new Brands("Lenovo"));
        brands.add(new Brands("Apple"));
        brands.add(new Brands("Huawei"));
        brands.add(new Brands("Casper"));
        brands.add(new Brands("Asus"));
        brands.add(new Brands("HP"));
        brands.add(new Brands("Xiaomi"));
        brands.add(new Brands("Monster"));
    }

    public Brands(String name) {
        this.b_id= b++;
        this.name = name;
    }

    public int getB_id() {
        return b_id;
    }

    public void setB_id(int b_id) {
        this.b_id = b_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getBrandById(int id){
        for (Brands b : brands){
            if (id == b.getB_id()){
                return b.getName();
            }
        }
        return "Markasız";
    }
    public static void listBrand() {
        System.out.println("Markalarımız");
        System.out.println("-------------------------------------");
        for(Brands b : brands){
            System.out.println("-"+b.getName()+" ("+b.getB_id()+")");
        }
    }
}
