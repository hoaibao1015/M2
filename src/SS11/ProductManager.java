package SS11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ProductManager {

    private List<Product> products;

    public ProductManager() {
        products = new LinkedList<>();
    }


    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(int id, String name, double price) {
        for (Product product : products) {
            if (product.getId() == id) {
                product.setName(name);
                product.setPrice(price);
                break;
            }
        }
    }

    public void removeProduct(int id) {
        products.removeIf(product -> product.getId() == id);
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product.getId() + " - " + product.getName() + " - $" + product.getPrice());
        }
    }

    public List<Product> searchByName(String name) {
        List<Product> foundProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                foundProducts.add(product);
            }
        }
        return foundProducts;
    }

    public void sortByPriceAsc() {
        Collections.sort(products, Comparator.comparingDouble(Product::getPrice));
    }

    public void sortByPriceDesc() {
        Collections.sort(products, Comparator.comparingDouble(Product::getPrice).reversed());
    }
}

