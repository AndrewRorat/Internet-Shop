package productCreation;

import exceptions.ProductNotFoundException;
import exceptions.WrongProductInputException;
import productsCategory.Category;

import java.time.LocalDate;
import java.util.HashMap;

public class Products {

    public static final Product GOOD_OIL = new Product(2, "Good oil", LocalDate.of(2019, 12, 30), Category.OILS, 2.99);
    public static final Product CRACKER = new Product(31, "Сracker", LocalDate.of(2019, 12, 25), Category.SWEETS, 0.99);
    public static final Product POMEGRANATE = new Product(11, "Pomegranate", LocalDate.of(2019, 12, 21), Category.VEGETABLESANDFRUITS, 1.49);
    public static final Product COCACOLA = new Product(54, "CocaCola", LocalDate.of(2020, 11, 12), Category.WATER, 0.49);

    public static HashMap<Integer, Product> items = new HashMap<>();

    static {
        items.put(GOOD_OIL.getId(), GOOD_OIL);
        items.put(CRACKER.getId(), CRACKER);
        items.put(POMEGRANATE.getId(), CRACKER);
        items.put(COCACOLA.getId(), COCACOLA);
    }

    public static void showProducts() {
        items.values().forEach(System.out::println);
    }

    public static void addProduct(Product product) throws WrongProductInputException{
        if(!items.keySet().contains(product.getId())) {
            items.put(product.getId(), product);
            System.out.println("Product has added");
        } else {
            throw new WrongProductInputException("Product is already at storage");
        }
    }

    public static void removeProduct(Product product) throws ProductNotFoundException {
        if (items.keySet().contains(product.getId())) {
            items.remove(product.getId());
        } else {
            throw new ProductNotFoundException("Wrong product id : " + product.getId());
        }
    }
}