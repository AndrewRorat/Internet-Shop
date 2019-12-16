package productCreation;

import productsCategory.Category;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Objects;

public class Product {
    private int id;
    private String productName;
    private LocalDate expiredDate;
    private Category category;
    private double price;

    public Product(int id, String productName, LocalDate expiredDate, Category category, double price) {
        this.id = id;
        this.productName = productName;
        this.expiredDate = expiredDate;
        this.category = category;
        this.price = price;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public LocalDate getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(LocalDate expiredDate) {
        this.expiredDate = expiredDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return id == product.id &&
                Double.compare(product.price, price) == 0 &&
                Objects.equals(productName, product.productName) &&
                Objects.equals(expiredDate, product.expiredDate) &&
                category == product.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productName, expiredDate, category, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", expiredDate=" + expiredDate +
                ", category=" + category +
                ", price=" + price +
                '}';
    }

    public HashMap<Integer, Product> productMap() {
        Product newProduct = new Product();
        var items = new HashMap<Integer, Product>();
        items.put(newProduct.getId(), new Product
                (2, "Good oil", LocalDate.of(2019, 12, 30), Category.OILS, 2.99));
        items.put(newProduct.getId(), new Product
                (31, "Сracker", LocalDate.of(2019, 12, 25), Category.SWEETS, 0.99));
        items.put(newProduct.getId(), new Product
                (11, "Pomegranate", LocalDate.of(2019, 12, 21), Category.VEGETABLESANDFRUITS, 1.49));
        items.put(newProduct.getId(), new Product(54, "CocaCola", LocalDate.of(2020, 11, 12), Category.WATER, 0.49));
        return items;
    }

//    public HashMap<Integer, ArrayList<Product>> productMap() {
//        Product newProduct = new Product();
//        var items = new HashMap<Integer, ArrayList<Product>>();
//        items.put(newProduct.getId(), new ArrayList<>(Arrays.asList(newProduct)));
////        items.put(new Product(product.getId()), new Product(2, "Good oil", LocalDate.of(2019, 12, 30), Category.oils, 2.99));
////        items.put(new Product(product.getId()), new Product(31, "Сracker", LocalDate.of(2019, 12, 25), Category.sweets, 0.99));
////        items.put(new Product(product.getId()),new Product(11, "Pomegranate", LocalDate.of(2019, 12, 21), Category.vegetablesAndFruits, 1.49));
////        item.add(new Product(54, "CocaCola", LocalDate.of(2020, 11, 12), Category.water, 0.49));
//        return items;
//    }

    public void showProducts() {
        productMap().entrySet().forEach(System.out::println);
    }
}