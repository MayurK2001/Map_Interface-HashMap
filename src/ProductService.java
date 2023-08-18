import java.util.*;
public class ProductService {
    HashMap<Integer, Product> products = new HashMap<>();
    public void addProduct(Product p){
        products.put(p.getProductId(), p);
    }
    public TreeMap<Integer, Product> getAllProducts(){
        return new TreeMap<>(products);
    }
    public List<Product> getProduct(){
        List<Product> list = new ArrayList<>();
        for(int i: products.keySet()){
            if(products.get(i).getProductPrice() >= 10000) list.add(products.get(i));
        }
        return list;
    }
}
