package productsCategory;

public enum Category {

    VEGETABLESANDFRUITS("Vegetables and fruits"),
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

    public static void showCategories() {
        System.out.println("Vegetables and fruits;\n" +
                "Oils;\n" +
                "Sweets;\n" +
                "Water;");
    }

    @Override
    public String toString() {
        return "Category{" +
                "category='" + category + '\'' +
                '}';
    }
}