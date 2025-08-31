public class Product {
    String productName;
    double productPrice;

    Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    void showProduct() {
        System.out.println("Product Name: " + productName + ", Product Price: " + productPrice);
    }

    void reducePrice(double price) {
        productPrice -= price;
        System.out.println(productName + " price reduced by " + productPrice + ". New price is " + productPrice);
    }

    void reducePrice(double price, String reason) {
        productPrice -= price;
        System.out.println(productName + " price reduced by " + productPrice + ". Reason: " + reason);
    }

    public static void main(String[] args) {
        System.out.println("Task 1");
        Product product1 = new Product("Water", 3.5);
        Product product2 = new Product("Beer", 4.2);
        Product product3 = new Product("Ice cream", 7.9);
        product1.showProduct();
        product2.showProduct();
        product3.showProduct();

        System.out.println("Task 2");
        product1.reducePrice(1.5);
        product2.reducePrice(1.5, "Old product");
    }
}
