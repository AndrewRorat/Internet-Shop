package admin;

import cartProduct.Cart;
import exceptions.ProductNotFoundException;
import exceptions.WrongProductInputException;
import productCreation.Product;
import productCreation.Products;
import productsCategory.Category;

import java.io.Console;

public class Admin {

    public static void main(String[] args) throws WrongProductInputException, ProductNotFoundException {
        final String FIRST_MENU = "1";
        final String SECOND_MENU = "2";
        final String THIRD_MENU = "3";
        final String FOURTH_MENU = "4";
        final String FIFTH_MENU = "5";
        final String SIXTH_MENU = "6";
        String AdminName = "admin";
        String password = "123456789";

        Console console = System.console();
        System.out.println("Hello user. Please choose your action");
        System.out.println("'1' - Buy products;\n" +
                "'2' - Admin menu;\n" +
                "'3' - exit");
        if (console == null) {
            System.out.println("No console available");
            System.exit(1);
        }
        if (console.readLine().equals(FIRST_MENU)) {                //Buy products;
            System.out.println("Lets add product into your cart");
            String userInput = console.readLine("'1' - Show product categories;\n" +
                    "'2' - Show products" +
                    "'3' - Add product to cart;\n" +
                    "'4' - Remove product from cart;\n" +
                    "'5' - Show product cart;\n" +
                    "'6' - return to main menu");
            if (userInput == null) {
                System.out.println("Please enter correct menu category");
                return;
            }
            if (userInput.equals(FIRST_MENU)) {     //Show product categories
                Category.showCategories();
            }
            if (userInput.equals(SECOND_MENU)) {    //Show products
                Products.showProducts();
            }
            if (userInput.equals(THIRD_MENU)) {     //Add product to cart
                String productId = console.readLine("Please enter product id you want to add");
                Cart.addToCart(Integer.parseInt(productId));
            }
            if (userInput.equals(FOURTH_MENU)) {    //Remove product from cart
                String productId = console.readLine("Please enter product id you want to remove");
                Cart.removeFromCart(Integer.parseInt(productId));
            }
            if (userInput.equals(FIFTH_MENU)) {     //Show product cart
                Cart.showCart();
            }
            if (userInput.equals(SIXTH_MENU)) {     //return to main menu
                System.out.println("To previous menu");
            }
        }
        if (console.readLine().equals(SECOND_MENU)) {       //Admin menu
            System.out.println("Enter the password: ");
            char[] ch = console.readPassword();
            String consolePassword = String.valueOf(ch);
            if (password.equals(consolePassword)) {
                System.out.println("Welcome Admin");
                String input = console.readLine("Choose your action:\n" +
                        "'1' - Show products;\n" +
                        "'2' - Add product:\n" +
                        "'3' - Remove product");
                if (input.equals(FIRST_MENU)) {
                    Products.showProducts();
                }
                if (input.equals(SECOND_MENU)) {

                }
            }
        }
    }
}