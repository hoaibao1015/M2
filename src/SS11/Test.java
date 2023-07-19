package SS11;
import java.util.List;
public class Test {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        productManager.addProduct(new Product(1, "Laptop", 1000));
        productManager.addProduct(new Product(2, "Phone", 500));
        productManager.addProduct(new Product(3, "Tablet", 300));

        System.out.println("List of products:");
        productManager.displayProducts();


        productManager.updateProduct(2, "Smartphone", 550);

        System.out.println("List of products after update:");
        productManager.displayProducts();


        productManager.removeProduct(1);


        System.out.println("List of products after removal:");
        productManager.displayProducts();


        String searchName = "Tablet";
        List<Product> foundProducts = productManager.searchByName(searchName);
        System.out.println("Found products with name '" + searchName + "':");
        for (Product product : foundProducts) {
            System.out.println(product.getId() + " - " + product.getName() + " - $" + product.getPrice());
        }


        productManager.sortByPriceAsc();
        System.out.println("Products sorted by price in ascending order:");
        productManager.displayProducts();


        productManager.sortByPriceDesc();
        System.out.println("Products sorted by price in descending order:");
        productManager.displayProducts();
    }
}

