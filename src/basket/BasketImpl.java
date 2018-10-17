package basket;

import product.Product;

import java.util.*;

public class BasketImpl implements Basket {

    private HashMap<Product,Integer> products = new HashMap<>();

    @Override
    public void addProduct(String productName, int productQuantity) {
        products.put(new Product(productName),productQuantity);
    }

    @Override
    public void removeProduct(String productName) {

        Product prod1 = null;
        for (Product prod : products.keySet()
                ) {
            if (productName.equals(prod.getName())){
                    prod1 = prod;
            }
        }
        if (products.get(prod1)==1){
            products.remove(prod1);
        }else {
            products.put(prod1,products.get(prod1)-1);
        }


    }

    @Override
    public void updateProductQuantity(String productName, int productQuantity) {
        for (Product prod : products.keySet()
        ) {
            if (productName.equals(prod.getName())){
                products.put(prod,products.get(prod)+productQuantity);
            }
        }
    }

    @Override
    public void clear() {
        products.clear();
        System.out.println("Корзина пуста");
    }

    @Override
    public HashMap<String,Integer> getProducts() {
        for (Map.Entry pair : products.entrySet()){
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
        return null;
    }

    @Override
    public int getProductQuantity(String productName) {
        int getProductQuantityInt=0;
        for (Product prod : products.keySet()
        ) {
            if (productName.equals(prod.getName())){
                getProductQuantityInt=products.get(prod);
            }
        }

        return getProductQuantityInt;
    }
}
