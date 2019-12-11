package productCreation;

import java.time.LocalDate;
import java.util.Objects;

public class Product {
    private int id;
    private String productName;
    private LocalDate expiredDate;
    private double price;

    public Product(int id, String productName, LocalDate expiredDate, double price) {
        this.id = id;
        this.productName = productName;
        this.expiredDate = expiredDate;
        this.price = price;
    }

    public Product(){}

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id &&
                Double.compare(product.price, price) == 0 &&
                Objects.equals(productName, product.productName) &&
                Objects.equals(expiredDate, product.expiredDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productName, expiredDate, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", expiredDate=" + expiredDate +
                ", price=" + price +
                '}';
    }
}