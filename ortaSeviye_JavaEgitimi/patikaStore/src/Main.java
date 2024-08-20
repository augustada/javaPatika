import java.util.Scanner;

public class Main {
    public static void menu(){
        System.out.println("1- Notebook İşlemleri \n2- Cep telefonu İşlemleri \n3- Marka Listele \n4- Çıkış Yap");
        Scanner input=new Scanner(System.in);
        System.out.print("Seçiminiz: ");
        try {
            int select = input.nextInt();
            switch (select) {
                case 1:
                    Notebook.listNotebook();
                    System.out.println();
                    System.out.println("1- Yeni Notebook Ekle \n2- Notebook Sil \n3- ID'ye göre listele \n4- Markaya göre listele\n5- Menuye Don");
                    int selectN= input.nextInt();
                    if (selectN==1) {
                        Notebook.insertNotebook();
                        Notebook.listNotebook();
                        menu();
                    }else if(selectN==2) {
                        System.out.print("ID: ");
                        int selectedId=input.nextInt();
                        Notebook.deleteNotebook(selectedId);
                        Notebook.listNotebook();
                        menu();
                    }
                    else if(selectN==3) {
                        System.out.print("ID: ");
                        int selectedId=input.nextInt();
                        Notebook.listById(selectedId);
                        menu();
                    }
                    else if(selectN==4) {
                        System.out.print("Marka: ");
                        Scanner bInput= new Scanner(System.in);
                        String selectedBrand=bInput.nextLine();
                        Notebook.listByBrand(selectedBrand);
                        menu();
                    }
                    else if(selectN==5) {
                        menu();
                    }
                    else {
                        System.out.println("Yanlış girdiniz!");
                        menu();
                    }
                    break;

                case 2:
                    Mobile.listMobile();
                    System.out.println();
                    System.out.println("1- Yeni Cep Telefonu Ekle \n2- Cep Telefonu Sil \n3- ID'ye göre listele \n4- Markaya göre listele\n5- Menuye Don");
                    int selectM= input.nextInt();
                    if (selectM==1) {
                        Mobile.insertMobile();
                        Mobile.listMobile();
                        menu();
                    }else if(selectM==2) {
                        System.out.print("ID: ");
                        int selectedId=input.nextInt();
                        Mobile.deleteMobile(selectedId);
                        Mobile.listMobile();
                        menu();
                    }
                    else if(selectM==3) {
                        System.out.print("ID: ");
                        int selectedId=input.nextInt();
                        Mobile.listById(selectedId);
                        menu();
                    }
                    else if(selectM==4) {
                        System.out.print("Marka: ");
                        Scanner bInput= new Scanner(System.in);
                        String selectedBrand=bInput.nextLine();
                        Mobile.listByBrand(selectedBrand);
                        menu();
                    }
                    else if(selectM==5) {
                        menu();
                    }
                    else {
                        System.out.println("Yanlış girdiniz!");
                        menu();
                    }
                    break;

                case 3:
                    Brands.listBrand();
                    System.out.println();
                    menu();
                case 4:
                    System.out.println("Görüşmek Üzere!");
                    break;
                default:
                    System.out.println("Lütfen geçerli bir sayı girin!");
                    menu();
            }
        }catch (Exception e){
            System.out.println("Lütfen tekrar girin!");
            System.out.println();
            menu();
        }

    }

    public static void main(String[] args) {
        System.out.println("PatikaStore Ürün Yönetim Paneli !");
        menu();
    }
}