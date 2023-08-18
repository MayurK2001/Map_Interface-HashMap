import java.time.LocalDate;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductService service = new ProductService();
        System.out.println("Welcome to product app");
        while (true){
            System.out.println("1.Add product\n2.Get all products\n3.Get Product\n4.Exit");
            System.out.println("Enter choice:");
            int choice = sc.nextInt();
            switch (choice){
                case 1 -> {
                    System.out.println("Enter product id:");
                    int id = sc.nextInt();
                    System.out.println("Enter product name:");
                    String pName = sc.next();
                    System.out.println("Enter product price:");
                    double price = sc.nextDouble();
                    System.out.println("Enter product mfd(yyyy/mm/dd)");
                    String mfd = sc.next();
                    LocalDate ld = LocalDate.parse(mfd);
                    Product p = new Product();
                    p.setProductId(id);
                    p.setProductName(pName);
                    p.setProductPrice(price);
                    p.setProductMfd(ld);
                    service.addProduct(p);
                }
                case 2 ->{
                    TreeMap<Integer,Product> tm = service.getAllProducts();
                    System.out.println(tm);
                }
                case 3 -> {
                    System.out.println("Products with price >= 1000");
                    System.out.println(service.getProduct());
                }
                case 4 -> System.exit(0);
            }
        }
    }
}
