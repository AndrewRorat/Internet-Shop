package productsCategory;

public enum Category {

    VEGETABLESANDFRUITS("Vegetables And fruits"),
    OILS("Oils"),
    SWEETS("Sweets"),
    WATER("Water");

    String category;

    Category(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void ShowCategory() {
        System.out.println(getCategory());
    }

    @Override
    public String toString() {
        return "Category{" +
                "category='" + category + '\'' +
                '}';
    }
}
