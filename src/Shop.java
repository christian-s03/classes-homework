public class Shop {
    String name;
    Product[] products;

    Shop(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    void showProducts() {
        System.out.println("Products in shop: " + name);
        for (int i = 0; i < products.length; i++) {
            products[i].showProduct();
        }
    }

    public static void main(String[] args) {

        Product p1 = new Product("Phone", 3000);
        Product p2 = new Product("PC", 5000);
        Product p3 = new Product("Headphones", 300);
        Product p4 = new Product("Tablets", 500);

        Product[] products = {p1, p2, p3, p4};
        Shop shop = new Shop("TechStore", products);

        shop.showProducts();
    }
}
