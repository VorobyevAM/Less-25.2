package basket;

import java.util.HashMap;
import java.util.List;

public interface Basket {

    void addProduct(String productName, int productQuantity);

    void removeProduct(String productName);

    void updateProductQuantity(String productName, int productQuantity);

    void clear();

    HashMap<String,Integer> getProducts();

    int getProductQuantity(String productName);

}
