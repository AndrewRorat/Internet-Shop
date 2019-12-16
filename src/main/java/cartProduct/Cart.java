package cartProduct;

import productCreation.Product;
import productCreation.Products;

import java.util.HashMap;

public class Cart {

    public Cart() {
    }

    private static HashMap cart = new HashMap<Integer, Product>();

    public static void addToCart(int id) {
        if (!cart.keySet().contains(id)){
            cart.put(id, Products.items.containsValue(id));
        }
    }


}
