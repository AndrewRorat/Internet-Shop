package cartProduct;

import exceptions.ProductNotFoundException;
import exceptions.WrongProductInputException;
import productCreation.Product;
import productCreation.Products;

import java.util.HashMap;

public class Cart {

    public Cart() {
    }

    private static HashMap cart = new HashMap<Integer, Product>();

    public static void addToCart(Integer id) throws WrongProductInputException {
        if (!cart.keySet().contains(id)) {
            cart.put(id, Products.items.get(id));
        } else {
            throw new WrongProductInputException("Product already in your cart");
        }
    }

    public static void showCart() {
        cart.values().forEach(System.out::println);
    }

    public static void removeFromCart(int id) throws ProductNotFoundException {
        if (cart.keySet().contains(id)) {
            cart.remove(id);
        } else {
            throw new ProductNotFoundException("Product not found");
        }
    }
}