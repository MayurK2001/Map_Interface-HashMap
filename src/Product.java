import java.time.LocalDate;
import java.util.Comparator;

public class Product implements Comparator<Product> {
    private int productId;
    private String productName;
    private double productPrice;
    private LocalDate productMfd;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public LocalDate getProductMfd() {
        return productMfd;
    }

    public void setProductMfd(LocalDate productMfd) {
        this.productMfd = productMfd;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productMfd=" + productMfd +
                '}';
    }

    @Override
    public int compare(Product o1, Product o2) {
        return Integer.compare(o1.getProductId(), o2.getProductId());
    }
}
