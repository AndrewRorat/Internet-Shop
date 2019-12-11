package productCreation;

import exceptions.ProductNotFoundException;
import exceptions.WrongProductInputException;
import productsCategory.Category;

import java.time.LocalDate;
import java.util.ArrayList;

public class Products {

    public Products() {
    }

    public ArrayList<Product> productList() {
        var item = new ArrayList<Product>();
        item.add(new Product(2, "Good oil", LocalDate.of(2019, 12, 30), Category.oils, 2.99));
        item.add(new Product(31, "Сracker", LocalDate.of(2019, 12, 25), Category.sweets, 0.99));
        item.add(new Product(11, "Pomegranate", LocalDate.of(2019, 12, 21), Category.vegetablesAndFruits, 1.49));
        item.add(new Product(54, "CocaCola", LocalDate.of(2020, 11, 12), Category.water, 0.49));
        return item;
    }

    public static void showProducts(ArrayList<Product> productList) {
        productList.forEach(System.out::println);
    }

    public ArrayList<Product> addProduct(int id, String productName, int year, int month, int day, Category category, double price)
            throws WrongProductInputException {
        var item = new ArrayList<Product>();
        if (item.add(new Product(id, productName, LocalDate.of(year, month, day), category, price))) {
            System.out.println("Product has added");
        } else {
            throw new WrongProductInputException("Wrong input to add product you want");
        }
        return item;
    }

    public void removeProduct(Product id) throws ProductNotFoundException {
        if (productList().contains(id)) {
            productList().remove(id);
        } else {
            throw new ProductNotFoundException("Wrong product id : " + id);
        }
    }
}