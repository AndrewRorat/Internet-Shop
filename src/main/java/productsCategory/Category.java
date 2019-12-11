package productsCategory;

public enum Category {

    vegetablesAndFruits("Vegetables And fruits"),
    oils("Oils"),
    sweets("Sweets"),
    water("Water");

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
