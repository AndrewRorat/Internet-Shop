package productCreation;

import productsCategory.Category;

import java.time.LocalDate;
import java.util.Objects;

public class Product {
    private Integer id;
    private String productName;
    private LocalDate expiredDate;
    private Category category;
    private double price;

    public Product(Integer id, String productName, LocalDate expiredDate, Category category, double price) {
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
}