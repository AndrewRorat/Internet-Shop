package productCreation;

import exceptions.ProductNotFoundException;
import exceptions.WrongProductInputException;

import java.time.LocalDate;
import java.util.ArrayList;

public class Products {

    public ArrayList<Product> productList() {
        var item = new ArrayList<Product>();
        item.add(new Product(2, "Good oil", LocalDate.of(2019, 12, 30), 2.99));
        item.add(new Product(31, "Сracker", LocalDate.of(2019, 12, 25), 0.99));
        item.add(new Product(11, "Pomegranate", LocalDate.of(2019, 12, 21), 1.49));
        item.add(new Product(54, "Cocacola", LocalDate.of(2020, 11, 12), 0.49));
        return item;
    }

    public static void showProducts(ArrayList<Product> productList) {
        productList.stream().forEach(System.out::println);
    }

    public ArrayList<Product> addProduct(int id, String productName, int year, int month, int day, double price)
            throws WrongProductInputException {
        var item = new ArrayList<Product>();
        if (item.add(new Product(id, productName, LocalDate.of(year, month, day), price))) {
            System.out.println("Product is added");
        } else {
            throw new WrongProductInputException("Wrong input to add product you want");
        }
        return item;
    }

    public void removeProduct(int id) throws ProductNotFoundException {
        if (productList().contains(id)) {
            productList().remove(Integer.valueOf(id));
        } else {
            throw new ProductNotFoundException("Wrong product id : " + id);
        }
    }
}