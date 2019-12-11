package cartProduct;

import productCreation.Product;
import productCreation.Products;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Cart {
    Products products = new Products();

    private int quantity;

    public Cart() {
    }

    private Map cartList = new HashMap<Integer, Product>();

    public void addToCart(Products p) {

    }

    public Collection showCartList() {
        return cartList.values();

    }
}
